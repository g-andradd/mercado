package br.com.mercado.main;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.mercado.model.Estoque;
import br.com.mercado.model.Gerente;
import br.com.mercado.model.Produto;
import br.com.mercado.model.RelatorioDoProduto;

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

		List<RelatorioDoProduto> relatorioDeProdutos = new ArrayList<>();

		relatorioDeProdutos.add(new RelatorioDoProduto(biscoito, 40));

		Estoque estoque = new Estoque();
		estoque.setEstoqueProdutos(relatorioDeProdutos);

		JOptionPane.showMessageDialog(null, " " + estoque, "Produtos do estoque", JOptionPane.PLAIN_MESSAGE);
    
		//Escolha de Caixa e Caixa Registradora
				//criando as variaveis para checar de caixa e caixaReg foram criados
				boolean x1 = false;
				boolean x2 = false;
				
				//comando de repeticao
				do {
				//criando o vetor para escolha
				String [] funcionarios = {"Caixa", "CaixaRegistradora", "Cancelar"};
				Object result = JOptionPane.showInputDialog(null, "O que deseja criar?", "Criar objetos", JOptionPane.QUESTION_MESSAGE, null, funcionarios, funcionarios[0]);
				
				//caso o usuário cancelar
				if (result == "Cancelar") {
					break;
				}
				
				//criando o caixa
				if(result == "Caixa" && x1 == false) {
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
				  //se o caixa já foi criado, exibe a mensagem
				} else if (result == "Caixa" && x1 == true) {
					JOptionPane.showMessageDialog(null, "Um Caixa já foi criado!", "Criar um Caixa", JOptionPane.ERROR_MESSAGE);
				}
				
				
				// criando a caixaRegistradora	
				if (result == "CaixaRegistradora" && x2 == false) {
					
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
				          
				          //operacao cancelada, exibe a mensagem
				        } else if (opcaoCaixaReg == JOptionPane.NO_OPTION) {
				          JOptionPane.showMessageDialog(null, "Operacao Finalizada", "Criar um Caixa Registradora", JOptionPane.ERROR_MESSAGE);
				        }
				     //exibindo a mensagem caso já foi criado uma caixa registradora   
					} else if (result == "CaixaRegistradora" && x2 == true) {
						JOptionPane.showMessageDialog(null, "Uma Caixa Registradora já foi criada!", "Criar uma Caixa Registradora", JOptionPane.ERROR_MESSAGE);
					}
				} 
				while (x1 == false || x2 == false);
			}
		
	}

	
	