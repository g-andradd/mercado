package br.com.mercado.model;

public class RelatorioDoProduto {
	private Produto produto;
	private int quantidade;
	
	//construtor com paramêtros
	public RelatorioDoProduto(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

	//getters e setters
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

	//método toString para exibir o relatório
	@Override
	public String toString() {
		return " Relatório De Produtos \n" +
				" \n " + produto +
				"\n Quantidade: " + quantidade
				;
	}
}
