package br.com.alba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.alba.config.DbConexao;
import br.com.alba.entidade.Comissao;



public class ComissaoDAO {
	
	public List<Comissao> listarProposicao() throws Exception {
		List<Comissao> listacom = new ArrayList<>();

		Connection conexao = DbConexao.getConnection();

		String sql = "SELECT DepartCod as idComissao, DepartCodPai as idComissaoSuperior, TipoDepart as tipoComissao, Departamento as nomeComissao, Ativo as ativo, Criacao as dataCriacao, Atualizacao as dataAtualizacao \r\n" + 
				"FROM proclegis_ba.view_departamento\r\n" + 
				"where Ativo = 1 ";

		PreparedStatement statement = conexao.prepareStatement(sql);
		ResultSet rs = statement.executeQuery();

		while (rs.next()) {
			Comissao comissao = new Comissao();
			comissao.setIdComissao(rs.getInt("idComissao"));
			comissao.setIdComissaoSuperior(rs.getString("idComissaoSuperior"));
			comissao.setTipoComissao(rs.getString("tipoComissao"));
			comissao.setNomeComissao(rs.getString("nomeComissao"));
			comissao.setAtivo(rs.getInt("ativo"));
			comissao.setDataCriacao(rs.getString("dataCriacao"));
			comissao.setDataAtualizacao(rs.getString("dataAtualizacao"));

			listacom.add(comissao);
		}

		return listacom;
	}

}
