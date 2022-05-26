package br.com.mercado.funcionalidades;

import br.com.mercado.model.Compra;
import br.com.mercado.model.Estoque;
import br.com.mercado.model.Produto;
import br.com.mercado.model.RelatorioDoProduto;
import br.com.mercado.validacao.MaiorQueEstoqueException;

import java.util.List;

public class CompraFinalizada {

    public static void fazerBaixaNoEstoque(Compra compra, Estoque estoque, int quantidade) {
        List<RelatorioDoProduto> estoqueProdutos = estoque.getEstoqueProdutos();
        List<Produto> produtos = compra.getProdutos();

        boolean feito = false;

        //percorre a lista de produtos
        for (Produto produto : produtos) {
            //percorre a lista de relatorio dos produtos
            for (RelatorioDoProduto relatorioDoProduto : estoqueProdutos) {
                //quando achar um produto que é igual ao produto do relatório ele entra na condição
                if (produto == relatorioDoProduto.getProduto()) {
                    int quantidadeAntiga = relatorioDoProduto.getQuantidade();
                    //se a quantidade antiga for menor que a quantidade passada pelo usuario da erro
                    if (quantidadeAntiga < quantidade) {
                        throw new MaiorQueEstoqueException(relatorioDoProduto);
                    }

                    // seta o novo valor para a quantidade de produtos no estoque
                    relatorioDoProduto.setQuantidade(quantidadeAntiga - quantidade);
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
