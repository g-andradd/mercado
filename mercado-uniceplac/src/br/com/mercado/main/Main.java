package br.com.mercado.main;

import br.com.mercado.model.*;
import br.com.mercado.service.*;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
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

        //Escolha de Caixa e Caixa Registradora
        //criando as variaveis para checar de caixa e caixaReg foram criados
        //comando de repeticao
        int opcao;
        do {
            String[] acao = {"Criar Funcionário", "Criar Caixa Registradora", "Criar Produto", "Realizar Compra"};
            String result = (String) JOptionPane.showInputDialog(null, "O que deseja Fazer?", "Criar objetos", JOptionPane.QUESTION_MESSAGE, null, acao, acao[0]);
            if (result == null) {
                //dialogo final
                JOptionPane.showMessageDialog(null, "Cancelado", "Funcionario", JOptionPane.INFORMATION_MESSAGE);
            } else {
                switch (result) {
                    case "Criar Funcionário" -> {
                        OpcaoCriarFuncionario criarFuncionario = new OpcaoCriarFuncionario();
                        String criar = criarFuncionario.mostrarOpcoes();
                        if (criar == null) {
                            //dialogo final
                            JOptionPane.showMessageDialog(null, "Cancelado", "Funcionario", JOptionPane.INFORMATION_MESSAGE);
                        } else if (criar.equals("Caixa")) {
                            criarFuncionario.criarCaixa(caixas);

                        } else if (criar.equals("Gerente")) {
                            criarFuncionario.criarGerente(gerentes);

                        }
                    }
                    case "Criar Caixa Registradora" -> {
                        CaixaRegistradoraService caixaRegistradoraService = new CaixaRegistradoraService();
                        CaixaRegistradora caixaRegistradora = caixaRegistradoraService.novo(caixasRegistradoras);
                        if (caixaRegistradora != null) {
                            caixasRegistradoras.add(caixaRegistradora);
                        }
                    }
                    case "Criar Produto" -> {
                        ProdutoService produtoService = new ProdutoService();
                        Produto produto = produtoService.novo(produtos, relatorioDosProdutos);
                        if (produto != null) {
                            produtos.add(produto);
                        }
                    }
                    case "Realizar Compra" -> {
                        if (caixasRegistradoras.isEmpty()){
                            JOptionPane.showMessageDialog(null, "Primeiro crie uma Caixa Registradora", "Compra", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        }
                        CompraService compraService = new CompraService();
                        Compra compra = compraService.criarACompra(caixasRegistradoras);
                        compraService.fazerACompra(produtos, compra, estoque);

                    }
                    default -> throw new IllegalStateException("Unexpected value: " + result);
                }
            }


            opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar?",
                    null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        } while (opcao == JOptionPane.YES_OPTION);

    }

}

	
	