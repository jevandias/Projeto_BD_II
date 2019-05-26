package com.projetobd.dao;

import java.util.List;

import java.sql.SQLException;

import com.projetobd.entidades.Projetos;

public interface IProjetoDao {

	public void cadastrar(Projetos projetos) throws SQLException;
	public List<Projetos> listar() throws SQLException;
	public void atualizar(Projetos projetos) throws SQLException;
	public void excluir(int codigo) throws SQLException;
}