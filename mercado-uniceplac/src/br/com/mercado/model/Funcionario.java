package br.com.mercado.model;

public abstract class Funcionario {
	
	// criando as possíveis variáveis para serem utilizadas 
	public String Login;
	public String Senha;
	public String nome;
	public String cpf;
	public String idade;
	public double salario;
	
	// construtor com parâmetro
	public Funcionario(String Login, String Senha, String nome, String cpf, String idade, double salario) {
		this.Login = Login;
		this.Senha = Senha;
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.salario = salario;
	}

	// gets and sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}