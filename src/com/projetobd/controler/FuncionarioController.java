package com.projetobd.controler;

import java.sql.SQLException;
import java.util.List;

import javax.swing.text.StyledEditorKit.BoldAction;

import com.projetobd.dao.FuncionarioDao;
import com.projetobd.dao.IFuncionarioDao;
import com.projetobd.entidades.Funcionario;

public class FuncionarioController {
	IFuncionarioDao funcionarioDao;
	
	public FuncionarioController() throws ClassNotFoundException, SQLException {
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
	
	public Funcionario validarSessao(String login, String senha)throws SQLException {
		return funcionarioDao.validarSessao(login, senha);
	}
}