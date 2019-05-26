package com.projetobd.dao;

import java.sql.SQLException;
import java.util.List;
import com.projetobd.entidades.Funcionario;

public interface IFuncionarioDao {

    public void cadastrar(Funcionario funcionarioDao)throws SQLException;
    public List<Funcionario> listar() throws SQLException;
    public void alterar(Funcionario funcionarioDao) throws SQLException;
    public void excluir(int codigo) throws SQLException;
	
}