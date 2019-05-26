package com.projetobd.entidades;

public class Departamentos {

	private int codigo;
	private String nome;
	private String localizacao;

	public Departamentos() {

	}

	public Departamentos(int codigo, String nome, String localizacao) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.localizacao = localizacao;
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

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

}