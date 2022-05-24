package br.com.mercado.model;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
	
	//Cria uma lista de array do tipo relatório de produtos
	List<RelatorioDoProduto> estoqueProdutos = new ArrayList<>();

	//Getters e setters
	public List<RelatorioDoProduto> getEstoqueProdutos() {
		return estoqueProdutos;
	}

	public void setEstoqueProdutos(List<RelatorioDoProduto> estoqueProdutos) {
		this.estoqueProdutos = estoqueProdutos;
	}

	//Método toString para exibir o estoque
	@Override
	public String toString() {
		return " " + estoqueProdutos
				;
	}
}
