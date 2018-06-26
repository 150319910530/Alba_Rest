package br.com.alba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.alba.config.DbConexao;
import br.com.alba.entidade.Proposicao;

public class ProposicaoDAO {
	
	public List<Proposicao> listarProposicao() throws Exception {
		List<Proposicao> listapp = new ArrayList<>();

		Connection conexao = DbConexao.getConnection();

		String sql = "SELECT NumeroProposicao AS IDPROPOSICAO, numero_proposicao AS NUMERO_PROPOSICAO, apresentacao AS DATAAPRESENTACAOPROPOSICAO, Ementa AS EMENTAPROPOSICAO " + 
				"FROM view_proposicao " + 
				"WHERE apresentacao >= NOW() - INTERVAL 30 DAY " + 
				"ORDER BY  apresentacao DESC";

		PreparedStatement statement = conexao.prepareStatement(sql);
		ResultSet rs = statement.executeQuery();

		while (rs.next()) {
			Proposicao proposicao = new Proposicao();
			proposicao.setIdProposicao(rs.getInt("IDPROPOSICAO"));
			proposicao.setNumeroProposicao(rs.getString("NUMERO_PROPOSICAO"));
			proposicao.setDateProposicao(rs.getString("DATAAPRESENTACAOPROPOSICAO").substring(0, rs.getString("DATAAPRESENTACAOPROPOSICAO").length() - 2));
			proposicao.setEmentaProposicao(rs.getString("EMENTAPROPOSICAO").replace("\n", "").replace("\r", "").replace("\"", "").replace("\t", ""));

			listapp.add(proposicao);
		}

		return listapp;
	}

}
