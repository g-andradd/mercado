package br.com.mercado.model;

public abstract class Funcionario {
	
	// criando as possíveis variáveis para serem utilizadas 
	private Long id;
	private String login;
	private String senha;
	private String nome;
	private String cpf;
	private String idade;
	private double salario;
	
	// construtor com parâmetro
	public Funcionario(Long id, String login, String senha, String nome, String cpf, String idade, double salario) {
		this.id = id;
		this.Login = login;
		this.Senha = Senha;
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.salario = salario;
	}

	// gets and sets
	
	public Long getId() {
		return id;
	}
	
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