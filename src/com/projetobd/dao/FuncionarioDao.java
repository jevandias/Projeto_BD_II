package com.projetobd.dao;

import com.projetobd.entidades.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDao implements IFuncionarioDao {
	private Connection con;
	private Funcionario funcionario;
	private List<Funcionario> listFuncionario;

	public FuncionarioDao() throws SQLException, ClassNotFoundException {
		con = (Connection) ConexaoBD.getInstacia().getConector();
	}

	@Override
	public void cadastrar(Funcionario funcionario) throws SQLException {
		String sql = "INSERT INTO funcionarios(`CPF`,`nome`,`rua`,`bairro`,`numero`,`cidade`,`uf`,`telefone`,`salario`) VALUES(?,?,?,?,?,?,?,?,?);";
		PreparedStatement prepare = con.prepareStatement(sql);
		prepare.setLong(1, funcionario.getCpf());
		prepare.setString(2, funcionario.getNome());
		prepare.setString(3, funcionario.getRua());
		prepare.setString(4, funcionario.getBairro());
		prepare.setInt(5, funcionario.getNumeroEnd());
		prepare.setString(6, funcionario.getCidade());
		prepare.setString(7, funcionario.getUf());
		prepare.setLong(8, funcionario.getTelefone());
		prepare.setDouble(9, funcionario.getSalario());
		prepare.execute();
		prepare.close();
	}

	@Override
	public List<Funcionario> listar() throws SQLException {
		String sql = "SELECT * FROM funcionarios";
		PreparedStatement prepare = con.prepareStatement(sql);
		ResultSet result = prepare.executeQuery();
		listFuncionario = new ArrayList<Funcionario>();
		while (result.next()) {
			funcionario = new Funcionario();
			funcionario.setCpf(result.getLong("cpf"));
			funcionario.setNome(result.getString("nome"));
			funcionario.setRua(result.getString("rua"));
			funcionario.setBairro(result.getString("bairro"));
			funcionario.setNumeroEnd(result.getInt("numero"));
			funcionario.setCidade(result.getString("cidade"));
			funcionario.setUf(result.getString("uf"));
			funcionario.setTelefone(result.getLong("telefone"));
			funcionario.setSalario(result.getDouble("salario"));
			funcionario.setCodigo_departamento(result.getInt("codigo_Departamento"));
			funcionario.setCodigo_departamentoGerenciar(result.getInt("codigo_DepartamentoGerenciar"));
			listFuncionario.add(funcionario);
		}
		return listFuncionario;
	}

	@Override
	public void alterar(Funcionario funcionario) throws SQLException {
		String sql = "UPDATE `funcionarios` SET `nome` = ?,`rua` = ?,`bairro` = ?,`numero` = ?,`cidade` = ?,`uf` = ?,`telefone` = ?,`salario` = ? WHERE `CPF` = ?;";
		PreparedStatement prepare = con.prepareStatement(sql);
		prepare.setString(1, funcionario.getNome());
		prepare.setString(2, funcionario.getRua());
		prepare.setString(3, funcionario.getBairro());
		prepare.setInt(4, funcionario.getNumeroEnd());
		prepare.setString(5, funcionario.getCidade());
		prepare.setString(6, funcionario.getUf());
		prepare.setLong(7, funcionario.getTelefone());
		prepare.setDouble(8, funcionario.getSalario());
		prepare.setLong(9, funcionario.getCpf());
		prepare.executeUpdate();
		prepare.close();
	}

	@Override
	public void excluir(int codigo) throws SQLException {
		String sql = "DELETE FROM funcionarios WHERE cpf = ?";
		PreparedStatement prepare = con.prepareStatement(sql);
		prepare.setLong(1, codigo);
		prepare.execute();
		prepare.close();
	}
}