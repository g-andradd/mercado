package br.com.mercado.main;

import br.com.mercado.model.*;
import br.com.mercado.service.CaixaRegistradoraService;
import br.com.mercado.service.CompraService;
import br.com.mercado.service.OpcaoCriarFuncionario;
import br.com.mercado.service.ProdutoService;

import javax.swing.*;
import java.util.List;

public class SwitchResult {

    public static void fazerSwitchCase(String result, List<Caixa> caixas, List<Gerente> gerentes,
                                List<CaixaRegistradora> caixasRegistradoras, List<Produto> produtos,
                                List<RelatorioDoProduto> relatorioDosProdutos, Estoque estoque) {
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
                if (caixasRegistradoras.isEmpty()) {
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
}


