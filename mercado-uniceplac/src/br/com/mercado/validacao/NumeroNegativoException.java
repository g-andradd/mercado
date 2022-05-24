package br.com.mercado.validacao;

public class NumeroNegativoException extends RuntimeException{

    public NumeroNegativoException() {
        super("quantidade precisa ser maior que 0");
    }
}
