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

	public List<Projetos> listarProjetos() throws SQLException {
		return projetosDao.listar();
	}

	public void alterarProjetos(Projetos projetos) throws SQLException {
		projetosDao.atualizar(projetos);
	}

	public void excluirProjetos(int numero) throws SQLException {
		projetosDao.excluir(numero);
	}
		
	public int recuperarNumero() throws SQLException {
		return projetosDao.recuperarNumero();
	}
	
	public Projetos buscarProjeto(int numero) throws SQLException{
		return projetosDao.buscarProjeto(numero);
	}
}