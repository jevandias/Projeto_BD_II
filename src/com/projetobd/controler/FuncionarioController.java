package com.projetobd.controler;

import java.sql.SQLException;
import java.util.List;

import com.projetobd.dao.FuncionarioDao;
import com.projetobd.entidades.Funcionario;

public class FuncionarioController {
	FuncionarioDao funcionarioDao;
	
	public FuncionarioController() throws ClassNotFoundException, SQLException {
		funcionarioDao = new FuncionarioDao();
	}
	
	public void cadastrarFuncionario(Funcionario funcionario) throws SQLException {
		funcionarioDao.cadastrar(funcionario);
	}
	
	public List<Funcionario> listarFuncionario(){
		return null;
	}
	
	public void alterarFuncionario(Funcionario funcionario) {
		
	}
	
	public void excluirFuncionario(int cpf) {
		
	}
	
	public Funcionario validarSessao(String login, String senha)throws SQLException {
		return funcionarioDao.validarSessao(login, senha);
	}
}