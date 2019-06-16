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
	
	public List<Funcionario> listarFuncionario() throws SQLException{
		return funcionarioDao.listar();
	}
	
	public void alterarFuncionario(Funcionario funcionario) throws SQLException {
		funcionarioDao.alterar(funcionario);
	}
	
	public void excluirFuncionario(long cpf) throws SQLException {
		funcionarioDao.excluir(cpf);
	}
	
	public Funcionario validarSessao(String login, String senha)throws SQLException {
		return funcionarioDao.validarSessao(login, senha);
	}

	public Funcionario buscarFuncionario(long cpf) throws SQLException {
		return funcionarioDao.buscar(cpf);
	}
}