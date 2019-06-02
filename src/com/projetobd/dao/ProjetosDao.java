package com.projetobd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.projetobd.entidades.Projetos;

public class ProjetosDao {
	
	private Connection con;
	private List<Projetos> listProjetos;
	private Projetos projetos;
	
	public ProjetosDao() throws ClassNotFoundException, SQLException {
		con = (Connection) ConexaoBD.getInstacia().getConector();
	}
	
	public void cadastrar(Projetos projetos) throws SQLException {
		String sql = "INSERT INTO projetos (nome, tipo, codigo_Departamento, CPF_funcionario, verba, horas) VALUES(?, ?, ?, ?, ?, ?);";
		PreparedStatement prepare = con.prepareStatement(sql);
		prepare.setString(1, projetos.getNome());
		prepare.setString(2, projetos.getTipo());
		prepare.setDouble(3, projetos.getVerba());
		prepare.setInt(4, projetos.getCod_departamento());
		prepare.setLong(5, projetos.getCpf_funcionario());
		prepare.execute();
		prepare.close();
	}

	public List<Projetos> listar() throws SQLException {
		String sql = "SELECT * FROM projetos";
		PreparedStatement prepare = con.prepareStatement(sql);
		ResultSet result = prepare.executeQuery();
		while (result.next()) {
			projetos = new Projetos();
			projetos.setNome(result.getString("nome"));
			
		}
		return null;
	}

	public void atualizar(Projetos projetos) throws SQLException {
		
	}

	public void excluir(int codigo) throws SQLException {
		
	}
}