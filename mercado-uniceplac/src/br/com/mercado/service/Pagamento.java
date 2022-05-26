package br.com.mercado.service;

import br.com.mercado.model.Compra;
import br.com.mercado.validacao.ValorMenorQueACompraException;

import java.math.BigDecimal;

public class Pagamento {

    public static BigDecimal recebePagamento(Compra compra, BigDecimal valor) {
        if (valor.doubleValue() > compra.getPreco().doubleValue()) {
            return valor.subtract(compra.getPreco());
        } else if (valor.doubleValue() < compra.getPreco().doubleValue()) {
            throw new ValorMenorQueACompraException("O valor da compra deve ser igual ou maior que o preço da compra!!");
        } else {

            return BigDecimal.ZERO;
        }
    }
}
