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
	}
}
