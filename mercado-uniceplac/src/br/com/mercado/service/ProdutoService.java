package br.com.mercado.service;

import br.com.mercado.model.Caixa;
import br.com.mercado.model.Produto;
import br.com.mercado.model.RelatorioDoProduto;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.List;

public class ProdutoService {
    public Produto novo(List<Produto> produtos, List<RelatorioDoProduto> relatorioDosProdutos) {
        int quantidade;

        //utilizando o swing para criar um Produto
        int opcaoProduto = JOptionPane.showConfirmDialog(null, "Deseja adicionar uma quantidade ou criar um Produto?", "Criar um Produto", JOptionPane.YES_NO_OPTION);
        if (opcaoProduto == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Insira as informacoes a seguir", "Criar um Produto", JOptionPane.INFORMATION_MESSAGE);

            Long id = Long.valueOf(JOptionPane.showInputDialog("Insira o ID do produto: "));
            if (verificar(produtos, id)){
                quantidade = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade desejada: "));
                adicionarQuantidade(relatorioDosProdutos, produtos, quantidade);
                return null;
            }else {
                Produto produto = criarProduto(id);

                quantidade = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade desejada: "));
                RelatorioDoProduto relatorioDoProduto = new RelatorioDoProduto(produto, quantidade);
                relatorioDosProdutos.add(relatorioDoProduto);

                //dialogo final
                JOptionPane.showMessageDialog(null, "O Produto, foi criado com sucesso", "Criar um Produto", JOptionPane.INFORMATION_MESSAGE);
                return produto;
            }

        } else {
            JOptionPane.showMessageDialog(null, "Operacao Finalizada", "Criar um Produto", JOptionPane.ERROR_MESSAGE);
            return null;
        }

    }

    public Produto criarProduto(Long id){
        String nome = JOptionPane.showInputDialog("Insira o nome do produto: ");
        String descricao = JOptionPane.showInputDialog("Insira a descrição do produto: ");
        String preco = JOptionPane.showInputDialog("Insira o preço: ");

        //criando um produto com os parametros certos
        return new Produto(id, nome, descricao, new BigDecimal(preco));
    }

    private boolean verificar(List<Produto> produtos, Long id) {
        for (Produto produto : produtos) {
            if (produto.getId().equals(id)){
                JOptionPane.showMessageDialog(null, "Produto encontrado, Inserir quantidade extra",
                        "Produto", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }
        }
        return false;
    }

    public void adicionarQuantidade(List<RelatorioDoProduto> relatorioDosProdutos, List<Produto> produtos, int quantidade){
        boolean achou = false;
        for (RelatorioDoProduto relatorioDoProduto : relatorioDosProdutos){
            for (Produto produto : produtos){
                if(relatorioDoProduto.getProduto() == produto){
                    relatorioDoProduto.setQuantidade(relatorioDoProduto.getQuantidade() + quantidade);
                    achou = true;
                    break;
                }
            }
            if (achou){
                break;
            }
        }
    }
}