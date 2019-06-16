package com.projetobd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.projetobd.entidades.Departamentos;

public class DepartamentoDao {

	private Connection con;
	private Departamentos departamentos;
	private List<Departamentos> listDepartamento;

	public DepartamentoDao() throws ClassNotFoundException, SQLException {
		con = (Connection) ConexaoBD.getInstacia().getConector();
	}

	public void cadastrar(Departamentos departamentos) throws SQLException {
		String sql = "INSERT INTO departamentos(nome,localizacao) VALUES (?,?);";
		PreparedStatement prepare = con.prepareStatement(sql);
		prepare.setString(1, departamentos.getNome());
		prepare.setString(2, departamentos.getLocalizacao());
		prepare.execute();
		prepare.close();
	}

	public List<Departamentos> listar() throws SQLException {
		String sql = "SELECT * FROM departamentos ORDER BY codigo ASC";
		PreparedStatement prepare = con.prepareStatement(sql);
		ResultSet result = prepare.executeQuery();
		listDepartamento = new ArrayList<Departamentos>();
		while (result.next()) {
			departamentos = new Departamentos();
			departamentos.setCodigo(result.getInt("codigo"));
			departamentos.setNome(result.getString("nome"));
			departamentos.setLocalizacao(result.getString("localizacao"));
			listDepartamento.add(departamentos);
		}
		return listDepartamento;
	}

	public void alterar(Departamentos departamentos) throws SQLException {
		String sql = "UPDATE departamentos SET nome = ?, localizacao = ? WHERE codigo = ?;";
		PreparedStatement prepare = con.prepareStatement(sql);
		prepare.setString(1, departamentos.getNome());
		prepare.setString(2, departamentos.getLocalizacao());
		prepare.setInt(3, departamentos.getCodigo());
		prepare.executeUpdate();
		prepare.close();
	}

	public void excluir(int codigo) throws SQLException {
		
		String consultaProjeto = "SELECT numero FROM projetos WHERE codigo_departamento = ?;";
		PreparedStatement prepare = con.prepareStatement(consultaProjeto);
		prepare.setInt(1, codigo);
		ResultSet result = prepare.executeQuery();
		List<Integer> listaProjetos = new ArrayList<>();
		while(result.next()) {
			int numeroProjeto = result.getInt("numero");
			listaProjetos.add(numeroProjeto);
		}
		prepare.close();
		
		String deleteProjeto = "DELETE FROM projetos WHERE numero=?";
		prepare = con.prepareStatement(deleteProjeto);
		for(int i = 0; i < listaProjetos.size(); i++) {
			prepare.setInt(1, listaProjetos.get(i));
			prepare.execute();
		}
		prepare.close();
		
		String deleteProjetoFunc = "DELETE FROM funcionarios_projetos WHERE numero_projeto=?";
		prepare = con.prepareStatement(deleteProjetoFunc);
		for(int i = 0; i < listaProjetos.size(); i++) {
			prepare.setInt(1, listaProjetos.get(i));
			prepare.execute();
		}
		prepare.close();
		
		String sql = "DELETE FROM departamentos WHERE codigo = ?;";
		prepare = con.prepareStatement(sql);
		prepare.setInt(1, codigo);
		prepare.execute();
		prepare.close();
	}
	
	public int consultaDep(String nomeDep) throws SQLException {
		String sql = "SELECT codigo FROM departamentos WHERE nome=?";
		PreparedStatement prepared = con.prepareStatement(sql);
		prepared.setString(1, nomeDep);
		ResultSet result = prepared.executeQuery();
		int retorno = 0;
		if(result.next()) {
			retorno = result.getInt("codigo");
		}
		return retorno;
	}

	public int recuperarId() throws SQLException {
		String sql = "SELECT max(codigo)+1 as id FROM departamentos";
		PreparedStatement prepare = con.prepareStatement(sql);
		ResultSet result = prepare.executeQuery();
		int idDepartamento = 0;
		if (result.next()) {
			idDepartamento = result.getInt("id");
		}
		if (idDepartamento == 0) {
			idDepartamento = 1;
		}

		return idDepartamento;

	}

	public Departamentos retornaDepartamento(int codigo)throws SQLException {
		String sql = "SELECT * FROM departamentos WHERE codigo=?;";
		PreparedStatement prepare = con.prepareStatement(sql);
		prepare.setInt(1, codigo);
		ResultSet result = prepare.executeQuery();
		Departamentos departamento = null;
		if(result.next()) {
			departamento = new Departamentos();
			departamento.setCodigo(result.getInt("codigo"));
			departamento.setLocalizacao(result.getString("localizacao"));
			departamento.setNome(result.getString("nome"));
		}
		return departamento;
	}
}