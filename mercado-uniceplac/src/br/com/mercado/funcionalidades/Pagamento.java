package br.com.mercado.funcionalidades;

import br.com.mercado.model.Compra;
import br.com.mercado.validacao.ValorMenorQueACompraException;

import java.math.BigDecimal;

public class Pagamento {

    public static BigDecimal recebePagamento(Compra compra, BigDecimal valor) {
        //se o pagamento do usuario for maior que o valor da compra, retorna o troco
        if (valor.doubleValue() > compra.getPreco().doubleValue()) {
            return valor.subtract(compra.getPreco());
            //se o valor passado pelo usuario for menor que o valor da compra, da o erro
        } else if (valor.doubleValue() < compra.getPreco().doubleValue()) {
            throw new ValorMenorQueACompraException("O valor da compra deve ser igual ou maior que o preço da compra!!");
        } else {

            //retorza 0 se n entrar nas outras condições
            return BigDecimal.ZERO;
        }
    }
}
