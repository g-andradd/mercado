package br.com.mercado.model;

public class Gerente extends Funcionario{
	
	private int senha;
	private int login;

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getLogin() {
		return login;
	}

	public void setLogin(int login) {
		this.login = login;
	}
	
}
