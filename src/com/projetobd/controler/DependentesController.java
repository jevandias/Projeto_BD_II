package com.projetobd.controler;

import java.sql.SQLException;
import java.util.List;

import com.projetobd.dao.DependentesDao;
import com.projetobd.entidades.Dependentes;

public class DependentesController {

	private DependentesDao dependentesDao;

	public DependentesController() throws ClassNotFoundException, SQLException {
		dependentesDao = new DependentesDao();
	}

	public void cadastrarDependente(Dependentes dependentes) throws SQLException {
		dependentesDao.cadastrar(dependentes);
	}

	public List<Dependentes> listarDependentes() throws SQLException {
		return dependentesDao.listar();
	}

	public void alterarDependentes(Dependentes dependentes) {

	}

	public void excluirDependentes(int codigo) {

	}

	public int recuperarId() throws SQLException {
		return dependentesDao.recuperarId();
	}
}