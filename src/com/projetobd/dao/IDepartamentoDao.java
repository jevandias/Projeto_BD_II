package com.projetobd.dao;

import java.sql.SQLException;
import java.util.List;

import com.projetobd.entidades.Departamentos;

public interface IDepartamentoDao {

	public void cadastrar(Departamentos departamentos)throws SQLException;
	public List<Departamentos> listar() throws SQLException;
	public void alterar(Departamentos departamentos) throws SQLException;
	public void excluir(int codigo) throws SQLException;
}