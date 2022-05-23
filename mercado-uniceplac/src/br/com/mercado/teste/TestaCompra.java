package br.com.mercado.teste;

import br.com.mercado.model.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestaCompra {
    public static void main(String[] args) {

        Produto biscoitoOreo = new Produto(1L, "Biscoito Oreo", "Biscoito oreo com 6 biscoitos",
                new BigDecimal("2"), LocalDate.now(), LocalDate.now());
        Produto salgadinho = new Produto(1L, "Salgadionho", "salgadinho de requijao",
                new BigDecimal("3"), LocalDate.now(), LocalDate.now());

        List<RelatorioDeProdutos> relatorioDeProdutos = new ArrayList<>();

        relatorioDeProdutos.add(new RelatorioDeProdutos(biscoitoOreo, 50));
        relatorioDeProdutos.add(new RelatorioDeProdutos(salgadinho, 50));

        Estoque estoque = new Estoque();
        estoque.setEstoqueProdutos(relatorioDeProdutos);

        System.out.println(estoque);

        CaixaRegistradora caixaRegistradora = new CaixaRegistradora(1L);

        Compra compra = new Compra(caixaRegistradora);
        compra.setProduto(biscoitoOreo, 2);

        System.out.println(compra.getPreco());

        compra.setProduto(salgadinho, 2);
        System.out.println(compra.getPreco());
        System.out.println(compra.getProdutos());

    }

}
