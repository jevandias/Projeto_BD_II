package com.projetobd.entidades;

public class Projetos {

	private int numero;
	private String nome;
	private String tipo;
	private double verba;
	private int cod_departamento;
	private long cpf_funcionario;

	public Projetos() {

	}

	public Projetos(int numero, String nome, String tipo, double verba, int cod_departamento, long cpf_funcionario) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.tipo = tipo;
		this.verba = verba;
		this.cod_departamento = cod_departamento;
		this.cpf_funcionario = cpf_funcionario;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getVerba() {
		return verba;
	}

	public void setVerba(double verba) {
		this.verba = verba;
	}

	public int getCod_departamento() {
		return cod_departamento;
	}

	public void setCod_departamento(int cod_departamento) {
		this.cod_departamento = cod_departamento;
	}

	public long getCpf_funcionario() {
		return cpf_funcionario;
	}

	public void setCpf_funcionario(long cpf_funcionario) {
		this.cpf_funcionario = cpf_funcionario;
	}
}