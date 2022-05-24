package br.com.mercado.validacao;

import br.com.mercado.model.Produto;
import br.com.mercado.model.RelatorioDoProduto;

public class MaiorQueEstoqueException extends RuntimeException{
    public MaiorQueEstoqueException(RelatorioDoProduto relatorioDoProduto) {
        super("Quantidade de " + relatorioDoProduto.getProduto().getNome() + " acima que no estoque!");
    }
}
