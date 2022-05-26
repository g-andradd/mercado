package br.com.mercado.main;

import br.com.mercado.model.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        List<Produto> produtos = new ArrayList<>();
        List<RelatorioDoProduto> relatorioDosProdutos = new ArrayList<>();
        List<Gerente> gerentes = new ArrayList<>();
        List<Caixa> caixas = new ArrayList<>();
        List<CaixaRegistradora> caixasRegistradoras = new ArrayList<>();

        //Preenchendo a lista de produto e colocando o relatorio dos produtos no estoque
        SetRelatorioDeProdutosNoEstoque.adicionarProdutos(produtos, relatorioDosProdutos, estoque);

        //comando de repeticao
        int opcao;
        do {
            //escolha de opção no Joption
            String[] acao = {"Criar Funcionário", "Criar Caixa Registradora", "Criar Produto", "Realizar Compra"};
            String result = (String) JOptionPane.showInputDialog(null, "O que deseja Fazer?",
                    "Criar objetos", JOptionPane.QUESTION_MESSAGE, null, acao, acao[0]);
            //verificando se a acao foi cancelada
            if (result == null) {
                //dialogo Cancelar
                JOptionPane.showMessageDialog(null, "Cancelado", "Funcionario", JOptionPane.INFORMATION_MESSAGE);
            } else {
                //chama o metodo que faz o switch case de acordo com a variavel result
                SwitchResult.fazerSwitchCase(result, caixas, gerentes, caixasRegistradoras, produtos, relatorioDosProdutos, estoque);
            }

            opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar?",
                    null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        } while (opcao == JOptionPane.YES_OPTION);

    }

}

	
	