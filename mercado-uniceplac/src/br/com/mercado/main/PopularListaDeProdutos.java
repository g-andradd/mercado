package br.com.mercado.main;

import br.com.mercado.model.Estoque;
import br.com.mercado.model.Produto;
import br.com.mercado.model.RelatorioDoProduto;

import java.math.BigDecimal;
import java.util.List;

public class PopularListaDeProdutos {

    public static void adicionarProdutos(List<Produto> produtos, List<RelatorioDoProduto> relatorioDoProdutos, Estoque estoque){

        Produto produto = new Produto(9991L, "Biscoito", "Biscoito Oreo", new BigDecimal("2.50"));
        Produto produto2 = new Produto(9992L, "Refrigerante", "Refrigerante 2L", new BigDecimal("5.50"));
        Produto produto3 = new Produto(9993L, "Salgadinho", "Salgadinho de Queijo", new BigDecimal("3"));
        Produto produto4 = new Produto(9994L, "Chocolate", "Barra de chocolate", new BigDecimal("2"));
        Produto produto5 = new Produto(9995L, "Achocolatado", "Achocolatado 50%", new BigDecimal("3.40"));
        Produto produto6 = new Produto(9996L, "Leite", "Leite integral", new BigDecimal("1.50"));
        Produto produto7 = new Produto(9997L, "Requeijão", "Requeijão ligth", new BigDecimal("4.50"));
        Produto produto8 = new Produto(9998L, "Desodorante", "Desodorante 24h", new BigDecimal("3"));

        produtos.add(produto);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);
        produtos.add(produto6);
        produtos.add(produto7);
        produtos.add(produto8);

        RelatorioDoProduto relatorioDoProduto = new RelatorioDoProduto(produto, 50);
        RelatorioDoProduto relatorioDoProduto1 = new RelatorioDoProduto(produto2, 50);
        RelatorioDoProduto relatorioDoProduto2 = new RelatorioDoProduto(produto3, 50);
        RelatorioDoProduto relatorioDoProduto3 = new RelatorioDoProduto(produto4, 50);
        RelatorioDoProduto relatorioDoProduto4 = new RelatorioDoProduto(produto5, 50);
        RelatorioDoProduto relatorioDoProduto5 = new RelatorioDoProduto(produto6, 50);
        RelatorioDoProduto relatorioDoProduto6 = new RelatorioDoProduto(produto7, 50);
        RelatorioDoProduto relatorioDoProduto7 = new RelatorioDoProduto(produto8, 50);

        relatorioDoProdutos.add(relatorioDoProduto);
        relatorioDoProdutos.add(relatorioDoProduto1);
        relatorioDoProdutos.add(relatorioDoProduto2);
        relatorioDoProdutos.add(relatorioDoProduto3);
        relatorioDoProdutos.add(relatorioDoProduto4);
        relatorioDoProdutos.add(relatorioDoProduto5);
        relatorioDoProdutos.add(relatorioDoProduto6);
        relatorioDoProdutos.add(relatorioDoProduto7);

        estoque.setEstoqueProdutos(relatorioDoProdutos);

    }

}
