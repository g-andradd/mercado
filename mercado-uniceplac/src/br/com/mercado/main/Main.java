package br.com.mercado.main;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.mercado.model.Estoque;
import br.com.mercado.model.Gerente;
import br.com.mercado.model.Produto;
import br.com.mercado.model.RelatorioDeProdutos;

import java.math.BigDecimal;
import javax.swing.JOptionPane;
import br.com.mercado.model.Caixa;
import br.com.mercado.model.CaixaRegistradora;
import br.com.mercado.model.Funcionario;

public class Main {
	public static void main(String[] args) {
	
		//Instanciando a classe Gerente e criando um objeto chamado gerente
		Gerente gerente = new Gerente(6L, "sdfghsdh", "3454576578", "34", new BigDecimal("23456.7"), "geren",
				"afdfg5s");
		//Instanciando a classe produto e criando um produto chamado biscoito
		Produto biscoito = new Produto(6L, "Biscopit sdog", "afhsgj", new BigDecimal("4"), LocalDate.now(),
				LocalDate.now());

		List<RelatorioDeProdutos> relatorioDeProdutos = new ArrayList<>();

		relatorioDeProdutos.add(new RelatorioDeProdutos(biscoito, 40));

		Estoque estoque = new Estoque();
		estoque.setEstoqueProdutos(relatorioDeProdutos);

		JOptionPane.showMessageDialog(null, " " + estoque, "Produtos do estoque", JOptionPane.PLAIN_MESSAGE);
    
    //Caixa e Caixa Registradora
		//variaveis para checar de as informacoes foram inseridas
		boolean x1 = false;
		boolean x2 = false;
		
		//iniciando o comando de repeticao checando caixa e/ou caixa registradora foram criados
		do {
			//se caixa foi preenchido/criado prossegue
			if(x1 == false) {
				//utilizando o swing para criar um funcionario
		        int opcaoCaixa = JOptionPane.showConfirmDialog(null, "Deseja criar um Caixa?", "Criar um Caixa", JOptionPane.YES_NO_OPTION);
		        if (opcaoCaixa == JOptionPane.YES_OPTION) {
		          JOptionPane.showMessageDialog(null, "Insira as informacoes a seguir", "Criar um Caixa", JOptionPane.INFORMATION_MESSAGE);
		          String id = JOptionPane.showInputDialog("Insira o id:");
		          String nome = JOptionPane.showInputDialog("Insira o nome:");
		          String cpf = JOptionPane.showInputDialog("Insira o cpf:");
		          String idade = JOptionPane.showInputDialog("Insira a idade:");
		          String salario = JOptionPane.showInputDialog("Insira o salario:");
		
		          //transformar o id em long e o salario em bigdecimal
		          Long idfinal = new Long(id);
		          BigDecimal salariofinal = new BigDecimal(salario);
		
		          //criando um funcionario com os parametros certos
		          Funcionario FunCaixa01 = new Caixa(idfinal, nome, cpf, idade, salariofinal);
		
		          //dialogo final
		          JOptionPane.showMessageDialog(null, "O Funcionario-Caixa, foi criado com sucesso", "Criar um Caixa", JOptionPane.INFORMATION_MESSAGE);
		          
		          //confirma a criacao do caixa
		          x1 = true;
		          
		          //operacao finalizada caso nao queira criar o funcionario caixa
		        } else if (opcaoCaixa == JOptionPane.NO_OPTION) {
		          JOptionPane.showMessageDialog(null, "Operacao Finalizada", "Criar um Caixa", JOptionPane.ERROR_MESSAGE);
		        }
			}
			
			//se caixa registradora foi preenchido/criado prossegue
			if (x2 == false) {
		        //utilizando o swing para criar a caixa reg.
		        int opcaoCaixaReg = JOptionPane.showConfirmDialog(null, "Deseja criar uma CaixaRegistradora?", "Criar uma Caixa Registradora", JOptionPane.YES_NO_OPTION);
		        if (opcaoCaixaReg == JOptionPane.YES_OPTION){
		          //inserindo 
		          JOptionPane.showMessageDialog(null, "Insira as informacoes a seguir", "Criar uma Caixa Registradora", JOptionPane.INFORMATION_MESSAGE);
		          String id = JOptionPane.showInputDialog("Insira o id da Caixa Registradora:");
		          Long idfinal = new Long(id);
		
		          CaixaRegistradora CaixaReg01 = new CaixaRegistradora(idfinal);
		          //confirma a criacao da caixa registradora
		          x2 = true;
		        } else if (opcaoCaixaReg == JOptionPane.NO_OPTION) {
		          JOptionPane.showMessageDialog(null, "Operacao Finalizada", "Criar um Caixa", JOptionPane.ERROR_MESSAGE);
		        }
			}
		}	
		while(x1 == false || x2 == false);
	}
}
	
	
	
	
	
	