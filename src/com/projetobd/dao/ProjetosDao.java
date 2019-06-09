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
		String sql = "INSERT INTO projetos (nome, tipo, codigo_Departamento,verba, horas) VALUES(?, ?, ?, ?, ?);";
		PreparedStatement prepare = con.prepareStatement(sql);
		prepare.setString(1, projetos.getNome());
		prepare.setString(2, projetos.getTipo());
		prepare.setInt(3, projetos.getCod_departamento());
		prepare.setDouble(4, projetos.getVerba());
		prepare.setInt(5, projetos.getHora());
		prepare.execute();
		prepare.close();
						
		String sql2 = "INSERT INTO funcionarios_projetos(CPF_funcionario, numero_projeto) VALUES(?, ?);";
		PreparedStatement prepare2 = con.prepareStatement(sql2);
		System.out.println(projetos.getCpf_funcionario().get(0));
		for (int i = 0; i < projetos.getCpf_funcionario().size(); i++) {
			prepare2.setLong(1, projetos.getCpf_funcionario().get(i));
			prepare2.setInt(2, projetos.getNumero());
			prepare2.execute();
		}
		prepare2.close();
	}

	public List<Projetos> listar() throws SQLException {
		String sql = "SELECT * FROM projetos";
		PreparedStatement prepare = con.prepareStatement(sql);
		ResultSet result = prepare.executeQuery();
		while (result.next()) {
			projetos = new Projetos();
			projetos.setNome(result.getString("nome"));

		}
		return listProjetos;
	}

	public void atualizar(Projetos projetos) throws SQLException {

	}

	public void excluir(int codigo) throws SQLException {

	}

	public int recuperarNumero() throws SQLException {
		String sql = "SELECT max(numero)+1 as numero FROM projetos;";
		PreparedStatement prepare = con.prepareStatement(sql);
		ResultSet result = prepare.executeQuery();
		int numProjeto = 0;
		if (result.next()) {
			numProjeto = result.getInt("numero");
		}
		if (numProjeto == 0) {
			numProjeto = 1;
		}

		return numProjeto;
	}
}