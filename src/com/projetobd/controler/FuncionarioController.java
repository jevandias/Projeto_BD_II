package com.projetobd.controler;

import com.projetobd.dao.FuncionarioDao;
import com.projetobd.dao.IFuncionarioDao;

public class FuncionarioController {
	IFuncionarioDao funcionarioDao;
	
	public FuncionarioController() {
		funcionarioDao = new FuncionarioDao();
	}
		
}