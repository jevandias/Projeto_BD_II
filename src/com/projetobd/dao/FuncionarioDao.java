package com.projetobd.dao;

import com.projetobd.entidades.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDao {
	private Connection con;
	private Funcionario funcionario;
	private List<Funcionario> listFuncionario;

	public FuncionarioDao() throws SQLException, ClassNotFoundException {
		con = (Connection) ConexaoBD.getInstacia().getConector();
	}

	public void cadastrar(Funcionario funcionario) throws SQLException {
		String sql = "INSERT INTO funcionarios(CPF,nome,rua,bairro,numero,cidade,uf,telefone,salario,senha) VALUES(?,?,?,?,?,?,?,?,?,?);";
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
		prepare.setInt(10, funcionario.getSenha());
		prepare.execute();
		prepare.close();
	}

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

	public void alterar(Funcionario funcionario) throws SQLException {
		String sql = "UPDATE funcionarios SET nome = ?, cep = ?, rua = ?, bairro = ?, numero = ?, cidade = ?, uf = ?, telefone = ?, salario = ? WHERE CPF = ?;";
		PreparedStatement prepare = con.prepareStatement(sql);
		prepare.setString(1, funcionario.getNome());
		prepare.setLong(2, funcionario.getCep());
		prepare.setString(3, funcionario.getRua());
		prepare.setString(4, funcionario.getBairro());
		prepare.setInt(5, funcionario.getNumeroEnd());
		prepare.setString(6, funcionario.getCidade());
		prepare.setString(7, funcionario.getUf());
		prepare.setLong(8, funcionario.getTelefone());
		prepare.setDouble(9, funcionario.getSalario());
		prepare.setLong(10, funcionario.getCpf());
		prepare.executeUpdate();
		prepare.close();
	}

	public void excluir(long cpf) throws SQLException {

		String consultaFuncionario = "SELECT codigo_dependentes, cpf_funcionario FROM funcionarios_dependentes WHERE cpf_funcionario = ?;";
		PreparedStatement prepare = con.prepareStatement(consultaFuncionario);
		prepare.setLong(1, cpf);
		ResultSet result = prepare.executeQuery();
		List<Long> listaFuncionario = new ArrayList<Long>();
		List<Integer> listaDependentes = new ArrayList<>();
		while (result.next()) {
			int numeroProjeto = result.getInt("codigo_dependentes");
			long cpfFuncionario = result.getLong("cpf_funcionario");
			listaFuncionario.add(cpfFuncionario);
			listaDependentes.add(numeroProjeto);
		}
		prepare.close();

		String deleteProjeto = "DELETE FROM funcionarios_dependentes WHERE codigo_dependentes=?";
		prepare = con.prepareStatement(deleteProjeto);
		for (int i = 0; i < listaDependentes.size(); i++) {
			prepare.setInt(1, listaDependentes.get(i));
			prepare.execute();
		}
		prepare.close();

		String deleteProjetoFunc = "DELETE FROM funcionarios_projetos WHERE cpf_funcionario=?";
		prepare = con.prepareStatement(deleteProjetoFunc);
		for (int i = 0; i < listaFuncionario.size(); i++) {
			prepare.setLong(1, listaFuncionario.get(i));
			prepare.execute();
		}
		prepare.close();

		String deleteDependente = "DELETE FROM dependentes WHERE codigo = ?;";
		prepare = con.prepareStatement(deleteDependente);
		for (int i = 0; i < listaDependentes.size(); i++) {
			prepare.setLong(1, cpf);
			prepare.execute();
		}
		prepare.close();

		String sql = "DELETE FROM funcionarios WHERE cpf = ?";
		prepare = con.prepareStatement(sql);
		prepare.setLong(1, cpf);
		prepare.execute();
		prepare.close();

	}

	public Funcionario validarSessao(String usuario, String senha) throws SQLException {
		String sql = "SELECT nome FROM funcionarios WHERE cpf = ? AND senha=?";
		PreparedStatement prepare = con.prepareStatement(sql);
		prepare.setString(1, usuario);
		prepare.setString(2, senha);
		ResultSet result = prepare.executeQuery();
		Funcionario funcionario = null;
		if (result.next()) {
			funcionario = new Funcionario();
			funcionario.setNome(result.getString("nome"));
		}
		return funcionario;
	}

	public Funcionario buscar(long cpf) throws SQLException {
		String sql = "SELECT * FROM funcionarios WHERE cpf = ?";
		PreparedStatement prepare = con.prepareStatement(sql);
		prepare.setLong(1, cpf);
		ResultSet result = prepare.executeQuery();
		Funcionario funcionario = null;
		if (result.next()) {
			funcionario = new Funcionario();
			funcionario.setCpf(cpf);
			funcionario.setNome(result.getString("nome"));
			funcionario.setRua(result.getString("rua"));
			funcionario.setBairro(result.getString("bairro"));
			funcionario.setNumeroEnd(result.getInt("numero"));
			funcionario.setCidade(result.getString("cidade"));
			funcionario.setCep(result.getLong("cep"));
			funcionario.setUf(result.getString("uf"));
			funcionario.setSalario(result.getDouble("salario"));
			funcionario.setTelefone(result.getLong("telefone"));
			funcionario.setSenha(result.getInt("senha"));
		}
		return funcionario;
	}
}