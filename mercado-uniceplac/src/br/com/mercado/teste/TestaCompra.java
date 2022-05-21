package br.com.mercado.teste;

import br.com.mercado.model.CaixaRegistradora;
import br.com.mercado.model.Compra;
import br.com.mercado.model.Produto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TestaCompra {
    public static void main(String[] args) {

        Produto produto = new Produto(1L, "Biscoito Oreo", "Biscoito oreo com 6 biscoitos",
                new BigDecimal("2"), LocalDate.now(), LocalDate.now());
        Produto produto2 = new Produto(1L, "Salgadionho", "salgadinho de requijao",
                new BigDecimal("3"), LocalDate.now(), LocalDate.now());
        CaixaRegistradora caixaRegistradora = new CaixaRegistradora(1L);

        Compra compra = new Compra(caixaRegistradora);
        compra.setProduto(produto, 2);

        System.out.println(compra.getPreco());

        compra.setProduto(produto2, 2);
        System.out.println(compra.getPreco());
        System.out.println(compra.getProdutos());

    }

}
