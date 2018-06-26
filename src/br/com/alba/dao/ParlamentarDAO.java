package br.com.alba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.alba.config.DbConexao;
import br.com.alba.entidade.Parlamentar;



public class ParlamentarDAO {
	
	public List<Parlamentar> listarParlamentar() throws Exception {
		List<Parlamentar> listapar = new ArrayList<>();

		Connection conexao = DbConexao.getConnection();

		String sql ="SELECT DISTINCT CodAutor as idParlamentar, Autor as nomeParlamentar, Partido as siglaPartido, Sexo as sexo, Ativo as ativo " + 
				"FROM view_parlamentar";

		PreparedStatement statement = conexao.prepareStatement(sql);
		ResultSet rs = statement.executeQuery();

		while (rs.next()) {
			Parlamentar parlamentar = new Parlamentar();
			parlamentar.setIdParlamentar(rs.getInt("idParlamentar"));
			parlamentar.setNomeParlamentar(rs.getString("nomeParlamentar"));
			parlamentar.setSiglaPartido(rs.getString("siglaPartido"));
			parlamentar.setSexo(rs.getString("sexo"));
			parlamentar.setAtivo(rs.getString("ativo"));

			listapar.add(parlamentar);
		}

		return listapar;
	}
	
	public List<Parlamentar> parlamentar(int idParlamentar) throws Exception {
		List<Parlamentar> listaParlamentar = new ArrayList<>();

		Connection conexao = DbConexao.getConnection();

		String sql = "SELECT DISTINCT CodAutor as idParlamentar, Autor as nomeParlamentar, Partido as siglaPartido, Sexo as sexo, Ativo as ativo " + 
				"FROM view_parlamentar " + 
				"WHERE CodAutor = ?";

		PreparedStatement statement = conexao.prepareStatement(sql);
		statement.setInt(1, idParlamentar);
		ResultSet rs = statement.executeQuery();

		while (rs.next()) {
			Parlamentar parlamentar = new Parlamentar();
			parlamentar.setIdParlamentar(rs.getInt("idParlamentar"));
			parlamentar.setNomeParlamentar(rs.getString("nomeParlamentar"));
			parlamentar.setSiglaPartido(rs.getString("siglaPartido"));
			parlamentar.setSexo(rs.getString("sexo"));
			parlamentar.setAtivo(rs.getString("ativo"));

			listaParlamentar.add(parlamentar);
		}

		return listaParlamentar;
	}

}
