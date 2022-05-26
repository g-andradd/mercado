package br.com.mercado.model;

import java.math.BigDecimal;

public class Caixa extends Funcionario{

	// construtor com todos os parametros
	public Caixa(Long id,  String nome, String cpf, String idade, BigDecimal salario) {
		super(id, nome, cpf, idade, salario);
	}
	
	// Método para inserção de Login e Senha;
	public void LoginCaixaReg(String Login, String Senha) {
		System.out.println("- Para entrar na caixa registradora, necessita-se de um login e senha -");
		System.out.println("Insira o seu Login:");
//		this.Login = Login;
		System.out.println("Insira a sua Senha:");
//		this.Senha = Senha;
	}
}