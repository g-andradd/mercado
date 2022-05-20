package br.com.mercado.model;

public class CaixaRegistradora {

    private final Long id;
    private Caixa caixa;

    public CaixaRegistradora(Long id, Caixa caixa) {
        this.id = id;
        this.caixa = caixa;
    }


    public CaixaRegistradora(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }
}
