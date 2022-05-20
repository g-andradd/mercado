package br.com.mercado.model;

import br.com.mercado.service.CompraService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Compra {

    //atributos da compra
    private List<Produto> produtos = new ArrayList<>();
    private BigDecimal preco = BigDecimal.ZERO;
    private MetodoPagamento metodoPagamento;
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
        new CompraService().registraProdutoNaCompra(this.produtos, produto, quantidade);
        //apos registar o produto na lista de produtos, já chama o método de calcular o preço
        calculaPreco();
    }

    public BigDecimal getPreco() {
        return preco;
    }

    //percorre a lista de produtos adicionando o valor dos produtos
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
