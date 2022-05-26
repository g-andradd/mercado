package br.com.mercado.service;

import br.com.mercado.funcionalidades.CompraFinalizada;
import br.com.mercado.funcionalidades.Pagamento;
import br.com.mercado.model.CaixaRegistradora;
import br.com.mercado.model.Compra;
import br.com.mercado.model.Estoque;
import br.com.mercado.model.Produto;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.List;

public class CompraService {

    //cria a compra e devolve a compre criada
    public Compra criarACompra(List<CaixaRegistradora> caixasRegistradoras){
        //joption que retorna os caixas existentes
        CaixaRegistradora caixaRegistradora = (CaixaRegistradora) JOptionPane.showInputDialog(null,
                "Escolha a caixa registradora que deseja passar", "Compra", JOptionPane.QUESTION_MESSAGE,
                null, caixasRegistradoras.toArray(), caixasRegistradoras.get(0));

        return new Compra(caixaRegistradora);
    }

    //metodo que realiza a compra
    public void fazerACompra(List<Produto> produtos, Compra compra, Estoque estoque){
        int finalizar;
        do {
            Produto produto = (Produto) JOptionPane.showInputDialog(null,
                    "Escolha o produto da compra", "Compra", JOptionPane.QUESTION_MESSAGE,
                    null, produtos.toArray(), produtos.get(0));
            int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade: "));
            compra.setProduto(produto, quantidade);

            finalizar = JOptionPane.showConfirmDialog(null, "Deseja finalizar a compra?",
                    null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            //se o cliente quiser finalizar a compra, chama os metodos para fazer o pagamento devolvendo o troco e fazer dar baixa no estoque
            if(finalizar == JOptionPane.YES_OPTION){
                String valor = JOptionPane.showInputDialog("O preço da compra foi R$" + compra.getPreco() + ", Digite o valor do pagamento");
                BigDecimal troco = Pagamento.recebePagamento(compra, new BigDecimal(valor));
                JOptionPane.showMessageDialog(null, "Valor do troco: R$" + troco, "Compra", JOptionPane.INFORMATION_MESSAGE);

                CompraFinalizada.fazerBaixaNoEstoque(compra, estoque, quantidade);
            }
        } while (finalizar == JOptionPane.NO_OPTION);
    }

}
