package com.projetobd.entidades;

public class Funcionario {

	private long cpf;
	private String nome;
	private String rua;
	private String bairro;
	private int numeroEnd;
	private String cidade;
	private String uf;
	private long telefone;
	private double salario;
	private int codigo_departamento;
	private int codigo_departamentoGerenciar;
	private int senha;

	public Funcionario() {
	}

	public Funcionario(long cpf, String nome, String rua, String bairro, int numeroEnd, String cidade, String uf,
			long telefone, double salario, int codigo_departamento, int codigo_departamentoGerenciar, int senha) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.rua = rua;
		this.bairro = bairro;
		this.numeroEnd = numeroEnd;
		this.cidade = cidade;
		this.uf = uf;
		this.telefone = telefone;
		this.salario = salario;
		this.codigo_departamento = codigo_departamento;
		this.codigo_departamentoGerenciar = codigo_departamentoGerenciar;
		this.senha = senha;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
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

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getCodigo_departamento() {
		return codigo_departamento;
	}

	public void setCodigo_departamento(int codigo_departamento) {
		this.codigo_departamento = codigo_departamento;
	}

	public int getCodigo_departamentoGerenciar() {
		return codigo_departamentoGerenciar;
	}

	public void setCodigo_departamentoGerenciar(int codigo_departamentoGerenciar) {
		this.codigo_departamentoGerenciar = codigo_departamentoGerenciar;
	}
	
	public int getSenha() {
		return this.senha;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
}