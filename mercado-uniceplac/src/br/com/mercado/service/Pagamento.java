package br.com.mercado.service;

import br.com.mercado.model.Compra;
import java.math.BigDecimal;

public class Pagamento {

    public static BigDecimal RecebePagamento(Compra compra, BigDecimal valor) {
        if (valor.doubleValue() > compra.getPreco().doubleValue()) {
            return valor.subtract(compra.getPreco());
        } else {
            if (valor.doubleValue() < compra.getPreco().doubleValue()) {
            }

            return BigDecimal.ZERO;
        }
    }
}
