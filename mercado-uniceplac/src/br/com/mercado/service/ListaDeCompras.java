package br.com.mercado.service;

import br.com.mercado.model.Produto;

import java.math.BigDecimal;
import java.util.List;

public class ListaDeCompras {
    //calculo para saber o proço total da compra e adicionar o produto na lista de produtos da compra
    public BigDecimal registraProdutoNaCompra(List<Produto> produtos, Produto produto, Integer quantidade){
        if (quantidade > 1) {
            for (int i = 0; i < quantidade; i++) {
                produtos.add(produto);
            }
        } else {
            produtos.add(produto);
        }
        BigDecimal precoDaCompra = BigDecimal.ZERO;
        for(Produto produtoDaLista : produtos){
            precoDaCompra = produtoDaLista.getPreco().add(precoDaCompra);
        }
        return precoDaCompra;
    }

}
