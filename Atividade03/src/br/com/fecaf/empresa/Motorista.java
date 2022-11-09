package br.com.fecaf.empresa;

import java.time.LocalDate;

public class Motorista extends Funcionario {

	// Atributos.
	private int numCNH;
	private String categoria;
	private String dtPrimeiraHbilitacao;
	private String dtValidade;
	private double salarioMensal;
	
	// Método construtor.
	public Motorista(String nome, int numMatricula, String dtNasc, String numTel, String numCel, double vlHora,
			String email, String dtAdmissao, int numCNH, String categoria, String dtPrimeiraHbilitacao,
			String dtValidade) {
		super(nome, numMatricula, dtNasc, numTel, numCel, vlHora, email, dtAdmissao);
		this.setNumCNH(numCNH);
		this.setCategoria(categoria);
		this.setDtPrimeiraHbilitacao(dtPrimeiraHbilitacao);
		this.setDtValidade(dtValidade);
	}

	// Métodos acessores Getters and Setters.
	protected int getNumCNH() {
		return numCNH;
	}

	protected void setNumCNH(int numCNH) {
		this.numCNH = numCNH;
	}

	protected String getCategoria() {
		return categoria;
	}

	protected void setCategoria(String categoria) {
		this.categoria = categoria;
		if (this.categoria.equals("A")) {
			this.setNvlHora(getVlHora() + 2 + 1);
		} else if (this.categoria.equals("B")) {
			this.setNvlHora(getVlHora() + 2 + 2);
		} else if (this.categoria.equals("C")) {
			this.setNvlHora(getVlHora() + 2 + 3);
		} else if (this.categoria.equals("D")) {
			this.setNvlHora(getVlHora() + 2 + 4);
		} else {
			this.setNvlHora(getVlHora() + 2 + 5);
		}
		salarioMensal();
	}

	protected String getDtPrimeiraHbilitacao() {
		return dtPrimeiraHbilitacao;
	}

	protected void setDtPrimeiraHbilitacao(String dtPrimeiraHbilitacao) {
		this.dtPrimeiraHbilitacao = dtPrimeiraHbilitacao;
	}

	protected String getDtValidade() {
		return dtValidade;
	}

	protected void setDtValidade(String dtValidade) {
		this.dtValidade = dtValidade;
	}
	
	protected double getSalarioMensal() {
		return salarioMensal;
	}
	
	protected void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	
	// Métodos.
	public void statusMotorista() {
		System.out.println("\n                Dados do Motorista                ");
		System.out.println("--------------------------------------------------\n");
		statusFuncionarios();
		System.out.println("Numero da CNH: " + this.numCNH);
		System.out.println("Categoria: " + this.categoria);
		System.out.println("Data da primeira CNH: " + this.dtPrimeiraHbilitacao);
		System.out.println("Data de validade da CNH Atual: " + this.dtValidade);
		System.out.println("Salário mensal: R$ " + this.getSalarioMensal());
	}
	
	public void salarioMensal() {
		double diasTrabalhados = this.getNvlHora() * 8;
		double mesTrabalhado = diasTrabalhados * 30;
		this.setSalarioMensal(mesTrabalhado);
	}
	
	public void demissao() {
		this.setDtDemissao(LocalDate.now());
	}

}
