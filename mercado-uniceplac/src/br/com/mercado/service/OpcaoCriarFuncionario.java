package br.com.mercado.service;

import br.com.mercado.model.Caixa;
import br.com.mercado.model.Gerente;

import javax.swing.*;
import java.util.List;

public class OpcaoCriarFuncionario {

    //verifica se deseja criar um caixa ou um gerente
    public String mostrarOpcoes() {
        String[] acao = {"Caixa", "Gerente"};

        return (String) JOptionPane.showInputDialog(null, "Qual funcionario deseja criar?",
                "Criar objetos", JOptionPane.QUESTION_MESSAGE, null, acao, acao[0]);
    }

    //metodo para criar o caixa
    public void criarCaixa(List<Caixa> caixas) {
        CaixaService caixaService = new CaixaService();
        Caixa caixa = caixaService.novo(caixas);
        if (caixa != null) {
            caixas.add(caixa);
        }
    }

    //metodo para criar o gerente
    public void criarGerente(List<Gerente> gerentes) {
        GerenteService gerenteService = new GerenteService();
        Gerente gerente = gerenteService.novo(gerentes);
        if (gerente != null) {
            gerentes.add(gerente);
        }
    }

}
