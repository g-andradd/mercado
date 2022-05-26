package br.com.mercado.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Produto {

    //Atributos do produto
    private final Long id;
    private String nome;
    private String descricao;
    private BigDecimal preco;

    //Método construtor do produto
    public Produto(Long id, String nome, String descricao, BigDecimal preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    //Métodos get e set dos atributos do produto
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    //método toString para mostrar os valores do produto
    @Override
    public String toString() {
        return "Produto{" +
                "Nome: " + nome +
                ", Descricao: " + descricao +
                ", Preço R$: " + preco +
                '}';
    }
}