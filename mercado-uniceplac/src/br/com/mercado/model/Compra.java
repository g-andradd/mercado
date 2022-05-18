package br.com.mercado.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Compra {

    private List<Produto> produtos = new ArrayList<>();
    private BigDecimal preco = BigDecimal.ZERO;
    private MetodoPagamento metodoPagamento;
    private final CaixaRegistradora caixaRegistradora;

    public Compra(CaixaRegistradora caixaRegistradora) {
        this.caixaRegistradora = caixaRegistradora;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProduto(Produto produto, Integer quantidade) {
        if (quantidade > 1) {
            for (int i = 0; i < quantidade; i++) {
                this.produtos.add(produto);
            }
        } else {
            this.produtos.add(produto);
        }
        calculaPreco();
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void calculaPreco() {
        for(Produto produto : produtos){
            this.preco = produto.getPreco().add(this.preco);
        }
    }

    public MetodoPagamento getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public CaixaRegistradora getCaixaRegistradora() {
        return caixaRegistradora;
    }

}
