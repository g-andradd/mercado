package br.com.mercado.service;

import br.com.mercado.model.Compra;

import java.math.BigDecimal;

public class CompraService {

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
