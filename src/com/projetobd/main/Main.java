package com.projetobd.main;

import java.sql.SQLException;

import com.projetobd.controler.DepartamentoController;
import com.projetobd.dao.ConexaoBD;
import com.projetobd.entidades.Departamentos;

public class Main {

	public static void main(String[] args) {
		try {
			Departamentos departamentos = new Departamentos();
			departamentos.setLocalizacao("Salgueiro");
			DepartamentoController dep = new DepartamentoController();
			
			
			System.out.println(dep.listarDepartamentos().get(0).getNome());
			
			departamentos = new Departamentos();
			
			departamentos.setNome("Pessoal");
			departamentos.setLocalizacao("Salgueiro");
			departamentos.setCodigo(2);
			
			dep.alterarDepartamentos(departamentos);
			
			System.out.println(dep.listarDepartamentos().get(0).getNome());
					
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}