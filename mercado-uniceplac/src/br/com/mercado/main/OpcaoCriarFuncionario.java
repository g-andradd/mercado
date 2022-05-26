package br.com.mercado.main;

import br.com.mercado.model.Caixa;
import br.com.mercado.model.Gerente;
import br.com.mercado.service.CaixaService;
import br.com.mercado.service.GerenteService;

import javax.swing.*;
import java.util.List;

public class OpcaoCriarFuncionario {

    public String mostrarOpcoes() {
        String[] acao = {"Caixa", "Gerente"};

        return (String) JOptionPane.showInputDialog(null, "Qual funcionario deseja criar?",
                "Criar objetos", JOptionPane.QUESTION_MESSAGE, null, acao, acao[0]);
    }

    public void criarCaixa(List<Caixa> caixas) {
        CaixaService caixaService = new CaixaService();
        Caixa caixa = caixaService.novo(caixas);
        if (caixa != null) {
            caixas.add(caixa);
        }
    }

    public void criarGerente(List<Gerente> gerentes) {
        GerenteService gerenteService = new GerenteService();
        Gerente gerente = gerenteService.novo(gerentes);
        if (gerente != null) {
            gerentes.add(gerente);
        }
    }
}
