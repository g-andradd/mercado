package br.com.mercado.model;

import java.math.BigDecimal;

public class Caixa extends Funcionario{

	// construtor com todos os parametros
	public Caixa(Long id,  String nome, String cpf, String idade, BigDecimal salario) {
		super(id, nome, cpf, idade, salario);
	}
	
	// TODO fazer método para inserção de Login e Senha;
	public void LoginCaixaReg(String Login, String Senha) {

	}
}