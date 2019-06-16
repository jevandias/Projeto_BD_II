package com.projetobd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
		String sql = "INSERT INTO projetos (nome, tipo, codigo_Departamento, verba) VALUES(?, ?, ?, ?);";
		PreparedStatement prepare = con.prepareStatement(sql);
		prepare.setString(1, projetos.getNome());
		prepare.setString(2, projetos.getTipo());
		prepare.setInt(3, projetos.getCod_departamento());
		prepare.setDouble(4, projetos.getVerba());
		prepare.execute();
		prepare.close();

		String sql2 = "INSERT INTO funcionarios_projetos(CPF_funcionario, numero_projeto, horas) VALUES(?, ?, ?);";
		PreparedStatement prepare2 = con.prepareStatement(sql2);
		for (int i = 0; i < projetos.getCpf_funcionario().size(); i++) {
			prepare2.setLong(1, projetos.getCpf_funcionario().get(i));
			prepare2.setInt(2, projetos.getNumero());
			prepare2.setInt(3, projetos.getHora());
			prepare2.execute();
		}
		prepare2.close();
	}

	public List<Projetos> listar() throws SQLException {
		String sql = "SELECT * FROM projetos";
		PreparedStatement prepare = con.prepareStatement(sql);
		ResultSet result = prepare.executeQuery();
		listProjetos = new ArrayList<Projetos>();
		while (result.next()) {
			projetos = new Projetos();
			projetos.setNumero(result.getInt("numero"));
			projetos.setNome(result.getString("nome"));
			projetos.setVerba(result.getDouble("verba"));
			listProjetos.add(projetos);
		}
		return listProjetos;
	}

	public void atualizar(Projetos projetos) throws SQLException {
		String sql = "UPDATE projetos SET nome = ?, tipo = ?, codigo_Departamento = ?, verba = ?, horas = ? WHERE numero = ?;";
		PreparedStatement prepare = con.prepareStatement(sql);
		prepare.setString(1, projetos.getNome());
		prepare.setString(2, projetos.getTipo());
		prepare.setInt(3, projetos.getCod_departamento());
		prepare.setDouble(4, projetos.getVerba());
		prepare.setInt(5, projetos.getHora());
		prepare.setInt(6, projetos.getNumero());
		prepare.executeUpdate();
		prepare.close();
	}

	public void excluir(int codigo) throws SQLException {
		String sql = "DELETE FROM projetos WHERE numero=?";
		PreparedStatement prepare = con.prepareStatement(sql);
		prepare.setInt(1, codigo);
		prepare.execute();
		prepare.close();
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

	public Projetos buscarProjeto(int numero) throws SQLException {
		String sql = "SELECT pro.numero, pro.nome, pro.tipo, pro.verba, funpro.horas, dep.codigo, funpro.CPF_funcionario FROM projetos pro INNER JOIN departamentos dep ON dep.codigo = pro.codigo_departamento INNER JOIN funcionarios_projetos funpro ON funpro.numero_projeto = pro.numero WHERE pro.numero = ?";
		PreparedStatement prepare = con.prepareStatement(sql);
		prepare.setInt(1, numero);
		ResultSet result = prepare.executeQuery();
		Projetos projeto = null;
		List<Long> listCpfFunc = new ArrayList<>();
		while (result.next()) {
			listCpfFunc.add(result.getLong("cpf_funcionario"));
			projeto = new Projetos();
			projeto.setNumero(result.getInt("numero"));
			projeto.setNome(result.getString("nome"));
			projeto.setVerba(result.getDouble("verba"));
			projeto.setHora(result.getInt("horas"));
			projeto.setTipo(result.getString("tipo"));
			projeto.setCod_departamento(result.getInt("codigo"));
			projeto.setCpf_funcionario(listCpfFunc);
		}
		return projeto;
	}
}