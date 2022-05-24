package br.com.mercado.model;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

	List<RelatorioDoProduto> estoqueProdutos = new ArrayList<>();

	public List<RelatorioDoProduto> getEstoqueProdutos() {
		return estoqueProdutos;
	}

	public void setEstoqueProdutos(List<RelatorioDoProduto> estoqueProdutos) {
		this.estoqueProdutos = estoqueProdutos;
	}

	@Override
	public String toString() {
		return "Estoque{" +
				"estoqueProdutos=" + estoqueProdutos +
				'}';
	}
}
