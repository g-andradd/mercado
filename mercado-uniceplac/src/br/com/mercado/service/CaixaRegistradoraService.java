package br.com.mercado.service;

import br.com.mercado.model.CaixaRegistradora;

import javax.swing.*;
import java.util.List;

public class CaixaRegistradoraService {

    public CaixaRegistradora novo(List<CaixaRegistradora> registradoraList) {
        int opcaoCaixaReg = JOptionPane.showConfirmDialog(null,
                "Deseja criar uma CaixaRegistradora?", "Criar uma Caixa Registradora", JOptionPane.YES_NO_OPTION);
        if (opcaoCaixaReg == JOptionPane.YES_OPTION) {
            //inserindo
            JOptionPane.showMessageDialog(null, "Insira as informacoes a seguir",
                    "Criar uma Caixa Registradora", JOptionPane.INFORMATION_MESSAGE);
            Long id = Long.valueOf(JOptionPane.showInputDialog("Insira o id da Caixa Registradora:"));
            if (verificar(registradoraList, id)){
                return null;
            }

            CaixaRegistradora caixaRegistradora = new CaixaRegistradora(id);

            JOptionPane.showMessageDialog(null, "A caixa registradora foi criada com sucesso",
                    "Criar uma Caixa Registradora", JOptionPane.INFORMATION_MESSAGE);

            return caixaRegistradora;

        } else {
            JOptionPane.showMessageDialog(null, "Operacao Finalizada",
                    "Criar um Caixa Registradora", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    private boolean verificar(List<CaixaRegistradora> registradoraList, Long id) {
        for (CaixaRegistradora caixaRegistradora : registradoraList) {
            if (caixaRegistradora.getId().equals(id)){
                JOptionPane.showMessageDialog(null, "Essa caixa registrafora já existe",
                        "Criar uma Caixa Registradora", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }
        }
        return false;
    }
}
