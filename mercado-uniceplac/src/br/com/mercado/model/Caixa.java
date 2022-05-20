package br.com.mercado.model;

public class Caixa extends Funcionario{
	
	// construtor com todos os parametros
	public Caixa(String Login, String Senha, String nome, String cpf, String idade, double salario) {
		super(Login, Senha, nome, cpf, idade, salario);
		// TODO Auto-generated constructor stub
	}
	
	// Método para inserção de Login e Senha;
	public void LoginCaixaReg(String Login, String Senha) {
		System.out.println("- Para entrar na caixa registradora, necessita-se de um login e senha -");
		System.out.println("Insira o seu Login:");
		this.Login = Login;
		System.out.println("Insira a sua Senha:");
		this.Senha = Senha;
	}
}