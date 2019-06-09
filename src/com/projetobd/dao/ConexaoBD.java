package com.projetobd.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

	private static Connection con = null;
	private static ConexaoBD self = null;

	protected Connection getConector() throws SQLException, ClassNotFoundException {
		if (con == null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/Projeto_BD_II?useTimezone=true&serverTimezone=UTC", "root", "58603418");
		}
		return con;
	}

	public static synchronized ConexaoBD getInstacia() {
		if (self == null) {
			self = new ConexaoBD();
			return self;
		} else {
			return self;
		}
	}

	@Override
	protected void finalize() throws Throwable {
		if (self != null) {
			desconectar();
		}
	}

	private void desconectar() throws SQLException {
		con.close();
	}

	public static boolean testarCon() throws ClassNotFoundException, SQLException {
		if (getInstacia().getConector() != null) {
			return true;
		}
		return false;
	}
}