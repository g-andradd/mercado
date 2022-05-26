package br.com.mercado.model;

import java.math.BigDecimal;

public abstract class Funcionario {
	
	// criando as possíveis variáveis para serem utilizadas 
	private Long id;
	private String nome;
	private String cpf;
	private String idade;
	private BigDecimal salario;
	
	// construtor com parâmetro
	public Funcionario(Long id, String nome, String cpf, String idade, BigDecimal salario) {
		this.id = id;
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

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
}