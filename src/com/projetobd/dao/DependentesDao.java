package com.projetobd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.projetobd.entidades.Dependentes;

public class DependentesDao {

	private Connection con;
	private Dependentes dependentes;
	private List<Dependentes> listDependentes;

	public DependentesDao() throws ClassNotFoundException, SQLException {
		con = (Connection) ConexaoBD.getInstacia().getConector();
	}

	public void cadastrar(Dependentes dependentes) throws SQLException {
		String sql = "INSERT INTO dependentes(nome,rua,bairro,numero,cidade,uf,parentesco, cep) VALUES (?,?,?,?,?,?,?,?);";
		String sqlFuncDep = "INSERT INTO funcionarios_dependentes(cpf_funcionario, codigo_dependentes) VALUES(?,?)";

		PreparedStatement prepare = con.prepareStatement(sql);
		prepare.setString(1, dependentes.getNome());
		prepare.setString(2, dependentes.getRua());
		prepare.setString(3, dependentes.getBairro());
		prepare.setInt(4, dependentes.getNumeroEnd());
		prepare.setString(5, dependentes.getCidade());
		prepare.setString(6, dependentes.getUf());
		prepare.setString(7, dependentes.getParentesco());
		prepare.setLong(8, dependentes.getCep());
		prepare.execute();
		prepare.close();

		prepare = con.prepareStatement(sqlFuncDep);
		prepare.setLong(1, dependentes.getCpf_funcionario());
		prepare.setInt(2, dependentes.getCodigo());
		prepare.execute();
		prepare.close();
	}

	public List<Dependentes> listar() throws SQLException {
		String sql = "SELECT d.codigo, d.nome, d.rua, d.bairro, d.numero, d.cidade, d.uf, d.parentesco, f.nome as nome_funcionario FROM funcionarios f INNER JOIN funcionarios_dependentes fd ON fd.cpf_funcionario = f.cpf INNER JOIN dependentes d ON d.codigo = fd.codigo_dependentes";
		PreparedStatement prepare = con.prepareStatement(sql);
		ResultSet result = prepare.executeQuery();
		listDependentes = new ArrayList<Dependentes>();
		while (result.next()) {
			dependentes = new Dependentes();
			dependentes.setCodigo(result.getInt("codigo"));
			dependentes.setNome(result.getString("nome"));
			dependentes.setRua(result.getString("rua"));
			dependentes.setBairro(result.getString("bairro"));
			dependentes.setNumeroEnd(result.getInt("numero"));
			dependentes.setCidade(result.getString("cidade"));
			dependentes.setUf(result.getString("uf"));
			dependentes.setParentesco(result.getString("parentesco"));
			dependentes.setNome_funcionario(result.getString("nome_funcionario"));
			listDependentes.add(dependentes);
		}
		return listDependentes;
	}

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
		System.out.println(prepare);
		prepare.executeUpdate();
		prepare.close();
	}

	public void excluir(int codigo) throws SQLException {
		String sql = "DELETE FROM dependentes WHERE codigo = ?;";
		PreparedStatement prepare = con.prepareStatement(sql);
		prepare.setInt(1, codigo);
		prepare.execute();
		prepare.close();
	}
	
	public int recuperarId() throws SQLException {
		String sql = "SELECT max(codigo)+1 as codigo FROM dependentes";
		PreparedStatement prepare = con.prepareStatement(sql);
		ResultSet result = prepare.executeQuery();
		int codDependente = 0;
		if (result.next()) {
			codDependente = result.getInt("codigo");
		}
		if (codDependente == 0) {
			codDependente = 1;
		}
		return codDependente;
	}

	public Dependentes consultarDependete(int codigo) throws SQLException{
		String sql = "SELECT d.codigo, d.nome, d.cep, d.rua, d.bairro, d.cidade, d.uf, f.cpf, d.numero, d.parentesco FROM dependentes d INNER JOIN funcionarios_dependentes fd ON fd.codigo_dependentes = d.codigo INNER JOIN funcionarios f ON f.cpf = fd.cpf_funcionario WHERE codigo = ?";
		PreparedStatement prepare = con.prepareStatement(sql);
		prepare.setInt(1, codigo);
		ResultSet result = prepare.executeQuery();
		Dependentes dependente = null;
		
		if(result.next()) {
			dependente = new Dependentes();
			dependente.setCodigo(result.getInt("codigo"));
			dependente.setNome(result.getString("nome"));
			dependente.setCep(result.getLong("cep"));
			dependente.setRua(result.getString("rua"));
			dependente.setBairro(result.getString("bairro"));
			dependente.setCidade(result.getString("cidade"));
			dependente.setUf(result.getString("uf"));
			dependente.setCpfFuncionario(result.getLong("cpf"));
			dependente.setNumeroEnd(result.getInt("numero"));
			dependente.setParentesco(result.getString("parentesco"));
		}
		
		return dependente;
	}
}