package br.com.mercado.model;

import java.math.BigDecimal;

//classe gerente herdando da classe funcionário
public class Gerente extends Funcionario{

	//atributos privados
    private String login;
    private String senha;

    //construtor para que só seja possivel a criação de um gerente utilizando os parametros abaixo
    public Gerente(Long id, String nome, String cpf, String idade, BigDecimal salario, String login, String senha) {
        super(id, nome, cpf, idade, salario);
        this.login = login;
        this.senha = senha;
    }

    //getters e setters
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}