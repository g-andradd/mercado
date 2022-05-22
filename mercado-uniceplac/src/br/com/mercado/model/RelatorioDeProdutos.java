package br.com.mercado.model;

public class RelatorioDeProdutos {
	private Produto produto;
	private int quantidade;

	public RelatorioDeProdutos(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "RelatorioDeProdutos{" +
				"produto=" + produto +
				", quantidade=" + quantidade +
				'}';
	}
}