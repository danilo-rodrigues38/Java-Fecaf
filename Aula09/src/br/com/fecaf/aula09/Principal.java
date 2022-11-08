package br.com.fecaf.aula09;

public class Principal {

	public static void main(String[] args) {
		
		Produto prod1 = new Produto();
		
		prod1.setId(1);
		prod1.setNome("Teclado");
		prod1.setDescricao("Teclado Alfanumerico RGB - Gamer");
		prod1.setValorCompra(150);
		prod1.setQtdEstoque(20);
		
		prod1.validarEstoque();
		prod1.calcularValorVenda(10);
		prod1.listagemProduto();

	}

}
