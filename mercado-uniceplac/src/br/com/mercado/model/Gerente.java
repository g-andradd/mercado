package br.com.mercado.model;

import java.math.BigDecimal;

public class Gerente extends Funcionario{

    private String login;
    private String senha;

    public Gerente(Long id, String nome, String cpf, String idade, BigDecimal salario, String login, String senha) {
        super(id, nome, cpf, idade, salario);
        this.login = login;
        this.senha = senha;
    }

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