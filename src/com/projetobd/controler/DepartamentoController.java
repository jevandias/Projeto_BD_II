package com.projetobd.controler;

import java.sql.SQLException;
import java.util.List;

import com.projetobd.dao.DepartamentoDao;
import com.projetobd.entidades.Departamentos;

public class DepartamentoController {

	DepartamentoDao departamentoDao;
	
	public DepartamentoController() throws ClassNotFoundException, SQLException {
		departamentoDao = new DepartamentoDao();
	}
	
	public void cadastrarDepartamento(Departamentos departamentos) throws SQLException {
		departamentoDao.cadastrar(departamentos);
	}
	
	public List<Departamentos> listarDepartamentos() throws SQLException{
		return departamentoDao.listar();
	}
	
	public void alterarDepartamentos(Departamentos departamentos) throws SQLException {
		departamentoDao.alterar(departamentos);
	}
	
	public void excluir(int codigo) throws SQLException {
		departamentoDao.excluir(codigo);
	}
}