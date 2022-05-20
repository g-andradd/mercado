package br.com.mercado.service;

import br.com.mercado.model.Compra;
import br.com.mercado.model.Produto;

import java.math.BigDecimal;
import java.util.List;

public class CompraService {

    public void registraProdutoNaCompra(List<Produto> produtos, Produto produto, Integer quantidade){
        if (quantidade > 1) {
            for (int i = 0; i < quantidade; i++) {
                produtos.add(produto);
            }
        } else {
            produtos.add(produto);
        }
    }

    public static BigDecimal RecebePagamento(Compra compra, BigDecimal valor){
        //todo valor não pode ser menor que o preço da compra
        if(valor.doubleValue() > compra.getPreco().doubleValue()){
            return valor.subtract(compra.getPreco());
        }
        if(valor.doubleValue() < compra.getPreco().doubleValue()){
            //lançar exception
        }
        return BigDecimal.ZERO;
    }

    public void finalizaCompra(Compra compra){

    }

}
