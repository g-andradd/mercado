package br.com.mercado.model;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

	List<RelatorioDeProdutos> estoqueProdutos = new ArrayList<>();

	public List<RelatorioDeProdutos> getEstoqueProdutos() {
		return estoqueProdutos;
	}

	public void setEstoqueProdutos(List<RelatorioDeProdutos> estoqueProdutos) {
		this.estoqueProdutos = estoqueProdutos;
	}

}
