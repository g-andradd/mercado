package br.com.mercado.model;

import br.com.mercado.service.ListaDeCompras;
import br.com.mercado.validacao.NumeroNegativoException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Compra {

    //atributos da compra
    private List<Produto> produtos = new ArrayList<>();
    private BigDecimal preco = BigDecimal.ZERO;
    private final CaixaRegistradora caixaRegistradora;

    //metodo construtor
    public Compra(CaixaRegistradora caixaRegistradora) {
        this.caixaRegistradora = caixaRegistradora;
    }

    //Métodos get e set
    public List<Produto> getProdutos() {
        return produtos;
    }

    //Recebe a lista de produtos da compra, o produto que será colocado na lista e a quantidade desse produto
    public void setProduto(Produto produto, Integer quantidade) {
        if (quantidade <= 0) {
            throw new NumeroNegativoException();
        } else {
            //Coloca o produto na lista de compras do cliente e retorna o preco total da lista
            BigDecimal precoDaCompra = (new ListaDeCompras()).registraProdutoNaCompra(this.produtos, produto, quantidade);
            //pega o preco retornado no método e seta no preco do objeto Compra
            this.setPreco(precoDaCompra);
        }
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public CaixaRegistradora getCaixaRegistradora() {
        return caixaRegistradora;
    }

}
