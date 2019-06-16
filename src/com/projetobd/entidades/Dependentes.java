package com.projetobd.entidades;

public class Dependentes {

	private int codigo;
	private String nome;
	private long cpfFuncionario;
	private long cep;
	private String rua;
	private String bairro;
	private int numeroEnd;
	private String cidade;
	private String uf;
	private String parentesco;
	private String nome_funcionario;

	public Dependentes() {
	}

	public Dependentes(int codigo, String nome, String rua, String bairro, int numeroEnd, String cidade, String uf,
			String parentesco, String nome_funcionario) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.rua = rua;
		this.bairro = bairro;
		this.numeroEnd = numeroEnd;
		this.cidade = cidade;
		this.uf = uf;
		this.parentesco = parentesco;
		this.nome_funcionario = nome_funcionario;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getNumeroEnd() {
		return numeroEnd;
	}

	public void setNumeroEnd(int numeroEnd) {
		this.numeroEnd = numeroEnd;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}

	public long getCpf_funcionario() {
		return cpfFuncionario;
	}

	public void setCpfFuncionario(long cpfFuncionario) {
		this.cpfFuncionario = cpfFuncionario;
	}

	public long getCep() {
		return cep;
	}

	public void setCep(long cep) {
		this.cep = cep;
	}

	public void setNome_funcionario(String nome_funcionario) {
		this.nome_funcionario = nome_funcionario;
	}

	public String getNome_funcionario() {
		return nome_funcionario;
	}
}