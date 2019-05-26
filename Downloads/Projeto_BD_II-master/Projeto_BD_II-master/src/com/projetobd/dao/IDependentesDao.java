package com.projetobd.dao;

import java.sql.SQLException;
import java.util.List;

import com.projetobd.entidades.Dependentes;

public interface IDependentesDao {

	public void cadastrar(Dependentes dependentes)throws SQLException;
	public List<Dependentes> listar() throws SQLException;
	public void alterar(Dependentes dependentes) throws SQLException;
	public void excluir(int codigo) throws SQLException;
}