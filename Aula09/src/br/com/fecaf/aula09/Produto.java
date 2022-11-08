package br.com.fecaf.aula09;

public class Produto {
	
	// Atributos da classe
	private int id;
	private String nome;
	private String descricao;
	private int qtdEstoque;
	private double valorCompra;
	private double valorVenda;
	private String statusProduto;
	
	// Métodos modificadores
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public String getStatusProduto() {
		return statusProduto;
	}

	public void setStatusProduto(String statusProduto) {
		this.statusProduto = statusProduto;
	}
	
	// Métodos acessores
	public void calcularValorVenda(float percentual) {
		/*
		 * Aplicar o reajuste do percentual no valor da compra
		 */
		setValorVenda(this.valorCompra + (this.valorCompra * (percentual / 100)));
	}
	
	public void validarEstoque() {
		/*
		 * Estoque <= 8;  Nível crítico
		 * Estoque <= 12; Nível Baixo
		 * Estoque > 12;  Nível Normal
		 */
		if (this.getQtdEstoque()<= 8) {
			this.setStatusProduto("NIVEL CRITICO!!!");
		} else if (this.getQtdEstoque() <= 12) {
			this.setStatusProduto("NIVEL BAIXO!");
		} else {
			this.setStatusProduto("NIVEL NORMAL.");
		}
	}
	
	public void listagemProduto() {
		System.out.println("ID do Produto: " + this.id);
		System.out.println("Nome do Produto: " + this.nome);
		System.out.println("Descricao do produto: " +this.descricao);
		System.out.println("Valor de compra: " + this.valorCompra);
		System.out.println("Qtde do Estoque: " + this.qtdEstoque);
		System.out.println("Status Produto: " + this.statusProduto);
		System.out.println("Valor da Venda: " + this.valorVenda);
	}

}
