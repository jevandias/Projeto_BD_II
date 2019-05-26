package com.projetobd.entidades;

public class Dependentes {

	private int codigo;
	private String nome;
	private String rua;
	private String bairro;
	private int numeroEnd;
	private String cidade;
	private String uf;
	private String parentesco;

	public Dependentes() {
	}

	public Dependentes(int codigo, String nome, String rua, String bairro, int numeroEnd, String cidade, String uf,
			String parentesco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.rua = rua;
		this.bairro = bairro;
		this.numeroEnd = numeroEnd;
		this.cidade = cidade;
		this.uf = uf;
		this.parentesco = parentesco;
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
}