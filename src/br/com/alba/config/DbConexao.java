package br.com.alba.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConexao {
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://xxxxxxxxxxxxx:3306/proclegis_ba", "xxxxxxxx", "xxxxxxx");
	}

}
