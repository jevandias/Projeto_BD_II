package com.projetobd.dao;

import java.sql.SQLException;
import java.util.List;

import com.projetobd.entidades.Funcionario;

public interface IFuncionarioDao {

	public void cadastrar(Funcionario dependentes)throws SQLException;
	public List<Funcionario> listar() throws SQLException;
	public void alterar(Funcionario funcionario) throws SQLException;
	public void excluir(int codigo) throws SQLException;
	Funcionario validarSessao(String usuario, String senha) throws SQLException;
}