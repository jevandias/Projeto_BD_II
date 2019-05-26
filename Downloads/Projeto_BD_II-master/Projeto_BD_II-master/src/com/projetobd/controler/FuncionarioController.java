package com.projetobd.controler;

import java.util.List;

import com.projetobd.dao.FuncionarioDao;
import com.projetobd.dao.IFuncionarioDao;
import com.projetobd.entidades.Funcionario;
import java.sql.SQLException;

public class FuncionarioController {
	IFuncionarioDao funcionarioDao;
	
	public FuncionarioController() throws SQLException, ClassNotFoundException {
		funcionarioDao = new FuncionarioDao();
	}
	
	public void cadastrarFuncionario(Funcionario funcionario) {
		
	}
	
	public List<Funcionario> listarFuncionario(){
		return null;
	}
	
	public void alterarFuncionario(Funcionario funcionario) {
		
	}
	
	public void excluirFuncionario(int cpf) {
		
	}
}