package com.projetobd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.projetobd.entidades.Dependentes;

public class DependentesDao implements IDependentesDao{

	private Connection con;
	private Dependentes dependentes;
	private List<Dependentes> listDependentes;
	
	public DependentesDao() throws ClassNotFoundException, SQLException {
		con = (Connection) ConexaoBD.getInstacia().getConector();
	}

	@Override
	public void cadastrar(Dependentes dependentes) throws SQLException {
		String sql = "INSERT INTO dependentes(nome,rua,bairro,numero,cidade,uf,parentesco) VALUES (?,?,?,?,?,?,?);";
		PreparedStatement prepare = con.prepareStatement(sql);
		prepare.setString(1, dependentes.getNome());
		prepare.setString(2, dependentes.getRua());
		prepare.setString(3, dependentes.getBairro());
		prepare.setInt(4, dependentes.getNumeroEnd());
		prepare.setString(5, dependentes.getCidade());
		prepare.setString(6, dependentes.getUf());
		prepare.setString(7, dependentes.getParentesco());
		prepare.execute();
		prepare.close();
	}

	@Override
	public List<Dependentes> listar() throws SQLException {
		String sql = "SELECT * FROM dependentes";
		PreparedStatement prepare = con.prepareStatement(sql);
		ResultSet result = prepare.executeQuery();
		listDependentes = new ArrayList<Dependentes>();
		while(result.next()) {
			dependentes = new Dependentes();
			dependentes.setNome(result.getString("nome"));
			dependentes.setRua(result.getString("rua"));
			dependentes.setBairro(result.getString("bairro"));
			dependentes.setNumeroEnd(result.getInt("numero"));
			dependentes.setCidade(result.getString("cidade"));
			dependentes.setUf(result.getString("uf"));
			dependentes.setParentesco(result.getString("parentesco"));
			listDependentes.add(dependentes);
		}
		return listDependentes;
	}

	@Override
	public void alterar(Dependentes dependentes) throws SQLException {
		String sql = "UPDATE dependentes SET nome = ?, rua = ?, bairro = ?, numero = ?, cidade = ?, uf = ?, parentesco = ? WHERE codigo = ?;";
		PreparedStatement prepare = con.prepareStatement(sql);
		prepare.setString(1, dependentes.getNome());
		prepare.setString(2, dependentes.getRua());
		prepare.setString(3, dependentes.getBairro());
		prepare.setInt(4, dependentes.getNumeroEnd());
		prepare.setString(5, dependentes.getCidade());
		prepare.setString(6, dependentes.getUf());
		prepare.setString(7, dependentes.getParentesco());
		prepare.setInt(8, dependentes.getCodigo());
		prepare.executeUpdate();
		prepare.close();
	}

	@Override
	public void excluir(int codigo) throws SQLException {
		String sql = "DELETE FROM dependentes WHERE codigo = ?;";
		PreparedStatement prepare = con.prepareStatement(sql);
		prepare.setInt(1, codigo);
		prepare.execute();
		prepare.close();
	}
}
