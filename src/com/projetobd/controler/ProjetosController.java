package com.projetobd.controler;

import java.sql.SQLException;
import java.util.List;

import com.projetobd.dao.ProjetosDao;
import com.projetobd.entidades.Projetos;

public class ProjetosController {

	private ProjetosDao projetosDao;
	
	public ProjetosController() throws ClassNotFoundException, SQLException {
		projetosDao = new ProjetosDao();
	}

	public void cadastrarProjeto(Projetos projetos) throws SQLException {
		projetosDao.cadastrar(projetos);
	}

	public List<Projetos> listarProjetos() {
		return null;
	}

	public void alterarProjetos(Projetos projetos) {

	}

	public void excluirProjetos(int numero) {

	}
		
	public int recuperarNumero() throws SQLException {
		return projetosDao.recuperarNumero();
	}
}