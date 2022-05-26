package br.com.mercado.service;

import br.com.mercado.model.Gerente;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.List;

public class GerenteService {

    public Gerente novo(List<Gerente> gerentes) {
        //utilizando o swing para criar um funcionario
        int opcaoGerente = JOptionPane.showConfirmDialog(null, "Deseja criar um Gerente?", "Criar um Gerente", JOptionPane.YES_NO_OPTION);
        if (opcaoGerente == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Insira as informacoes a seguir", "Criar um Gerente", JOptionPane.INFORMATION_MESSAGE);

            Long id = Long.valueOf(JOptionPane.showInputDialog("Insira o ID: "));
            if (verificar(gerentes, id)){
                return null;
            }
            String nome = JOptionPane.showInputDialog("Insira o nome: ");
            String cpf = JOptionPane.showInputDialog("Insira o cpf: ");
            String idade = JOptionPane.showInputDialog("Insira a idade: ");
            String salario = JOptionPane.showInputDialog("Insira o salario: ");
            String login = JOptionPane.showInputDialog("Insira o Login: ");
            String senha = JOptionPane.showInputDialog("Insira o Senha: ");

            //criando um funcionario com os parametros certos
            Gerente gerente = new Gerente(id, nome, cpf, idade, new BigDecimal(salario), login, senha);

            //dialogo final
            JOptionPane.showMessageDialog(null, "O Funcionario-Gerente, foi criado com sucesso", "Criar um Gerente", JOptionPane.INFORMATION_MESSAGE);

            return gerente;
        } else {
            JOptionPane.showMessageDialog(null, "Operacao Finalizada", "Criar um Gerente", JOptionPane.ERROR_MESSAGE);
            return null;
        }

    }

    private boolean verificar(List<Gerente> gerentes, Long id) {
        for (Gerente gerente : gerentes) {
            if (gerente.getId().equals(id)){
                JOptionPane.showMessageDialog(null, "Esse gerente já existe",
                        "Criar um Gerente", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }
        }
        return false;
    }

}
