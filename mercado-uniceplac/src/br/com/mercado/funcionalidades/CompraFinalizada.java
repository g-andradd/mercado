package br.com.mercado.funcionalidades;

import br.com.mercado.model.Compra;
import br.com.mercado.model.Estoque;
import br.com.mercado.model.Produto;
import br.com.mercado.model.RelatorioDoProduto;
import br.com.mercado.validacao.MaiorQueEstoqueException;

import java.util.List;

public class CompraFinalizada {

    public static void fazerBaixaNoEstoque(Compra compra, Estoque estoque) {
        List<RelatorioDoProduto> estoqueProdutos = estoque.getEstoqueProdutos();
        List<Produto> produtos = compra.getProdutos();

        boolean feito = false;

        for (Produto produto : produtos) {
            for (RelatorioDoProduto relatorioDoProduto : estoqueProdutos) {
                if (produto == relatorioDoProduto.getProduto()) {
                    int quantidadeAntiga = relatorioDoProduto.getQuantidade();
                    if (quantidadeAntiga == 0) {
                        throw new MaiorQueEstoqueException(relatorioDoProduto);
                    }

                    relatorioDoProduto.setQuantidade(quantidadeAntiga - 1);
                    feito = true;
                    break;
                }
            }
            if (feito){
                break;
            }
        }

    }


}
