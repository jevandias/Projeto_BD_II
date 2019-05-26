package com.projetobd.main;


import java.sql.SQLException;

import com.projetobd.dao.ConexaoBD;

public class Main {

	public static void main(String[] args) {
		try {
			System.out.println(ConexaoBD.testarCon());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}