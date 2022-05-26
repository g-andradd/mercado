package br.com.mercado.service;

import br.com.mercado.model.Caixa;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.List;

public class CaixaService{


    public Caixa novo(List<Caixa> caixas) {
        //utilizando o swing para criar um funcionario
        int opcaoCaixa = JOptionPane.showConfirmDialog(null, "Deseja criar um Caixa?", "Criar um Caixa", JOptionPane.YES_NO_OPTION);
        if (opcaoCaixa == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Insira as informacoes a seguir", "Criar um Caixa", JOptionPane.INFORMATION_MESSAGE);
            Long id = Long.parseLong(JOptionPane.showInputDialog("Insira o id:"));

            //se o id já existe, retorna null
            if (verificarId(caixas, id)){
                return null;
            }
            String nome = JOptionPane.showInputDialog("Insira o nome:");
            String cpf = JOptionPane.showInputDialog("Insira o cpf:");
            String idade = JOptionPane.showInputDialog("Insira a idade:");
            String salario = JOptionPane.showInputDialog("Insira o salario:");

            //criando um funcionario
            Caixa caixa = new Caixa(id, nome, cpf, idade, new BigDecimal(salario));

            //dialogo final
            JOptionPane.showMessageDialog(null, "O Funcionario-Caixa, foi criado com sucesso", "Criar um Caixa", JOptionPane.INFORMATION_MESSAGE);

            return caixa;
        } else {
            JOptionPane.showMessageDialog(null, "Operacao Finalizada", "Criar um Caixa", JOptionPane.ERROR_MESSAGE);
            return null;
        }

    }

    //Metodo que verifica se o id já existe
    private boolean verificarId(List<Caixa> caixas, Long id) {
        for (Caixa caixa : caixas) {
            if (caixa.getId().equals(id)){
                JOptionPane.showMessageDialog(null, "Esse caixa já existe",
                        "Criar um Caixa", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }
        }
        return false;
    }
}
