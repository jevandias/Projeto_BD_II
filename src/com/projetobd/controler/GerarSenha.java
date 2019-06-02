package com.projetobd.controler;

public class GerarSenha {

	public GerarSenha() {

	}

	public static int retornaSenha() {
		int numero = (int) ((int) 100000 + Math.random() * 899999);

		return numero;
	}
}