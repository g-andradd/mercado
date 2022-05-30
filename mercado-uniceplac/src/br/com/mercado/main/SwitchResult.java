package br.com.mercado.main;

import br.com.mercado.model.*;
import br.com.mercado.service.CaixaRegistradoraService;
import br.com.mercado.service.CompraService;
import br.com.mercado.service.OpcaoCriarFuncionario;
import br.com.mercado.service.ProdutoService;

import javax.swing.*;
import java.util.List;

public class SwitchResult {

    //faz o switch case da main, recebendo as listas já que não tem banco de dados
    public static void fazerSwitchCase(String result, List<Caixa> caixas, List<Gerente> gerentes,
                                List<CaixaRegistradora> caixasRegistradoras, List<Produto> produtos,
                                List<RelatorioDoProduto> relatorioDosProdutos, Estoque estoque) {
        switch (result) {
            case "Criar Funcionário" -> {
                OpcaoCriarFuncionario criarFuncionario = new OpcaoCriarFuncionario();
                String criar = criarFuncionario.mostrarOpcoes();
                //se cair no null significa que cancelou
                if (criar == null) {
                    //dialogo final
                    JOptionPane.showMessageDialog(null, "Cancelado",
                            "Funcionario", JOptionPane.INFORMATION_MESSAGE);
                } else if (criar.equals("Caixa")) {
                    //cria caixa
                    criarFuncionario.criarCaixa(caixas);

                    //cria gerente
                } else if (criar.equals("Gerente")) {
                    criarFuncionario.criarGerente(gerentes);

                }
            }
            case "Criar Caixa Registradora" -> {
                //cria caixa registradora
                CaixaRegistradoraService caixaRegistradoraService = new CaixaRegistradoraService();
                CaixaRegistradora caixaRegistradora = caixaRegistradoraService.novo(caixasRegistradoras);
                //se nao for null ele adiciona na lista, pois nao foi cancelado
                if (caixaRegistradora != null) {
                    caixasRegistradoras.add(caixaRegistradora);
                }
            }
            case "Criar Produto" -> {
                //cria produto
                ProdutoService produtoService = new ProdutoService();
                Produto produto = produtoService.novo(produtos, relatorioDosProdutos);
                //se nao for null ele adiciona na lista, pois nao foi cancelado
                if (produto != null) {
                    produtos.add(produto);
                }
            }
            case "Realizar Compra" -> {
                //se não existir caixa registradora, avisa o usuario que não existe caixa registradora criada
                if (caixasRegistradoras.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Primeiro crie uma Caixa Registradora", "Compra", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
                //chama metodo que cria e faz a compra
                CompraService compraService = new CompraService();
                Compra compra = compraService.criarACompra(caixasRegistradoras);
                compraService.fazerACompra(produtos, compra, estoque);

            }
            default -> throw new IllegalStateException("Unexpected value: " + result);
        }
    }
}


