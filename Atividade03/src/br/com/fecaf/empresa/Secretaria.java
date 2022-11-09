package br.com.fecaf.empresa;

import java.time.LocalDate;

public class Secretaria extends Funcionario {

	// Atributos.
	private int qtdIdiomas;
	private String nomeGraduacao;
	private String anoIniGraduacao;
	private double salarioMensal;
	
	// Método construtor.
	public Secretaria(String nome, int numMatricula, String dtNasc, String numTel, String numCel, double vlHora,
			String email, String dtAdmissao, int qtdIdiomas, String nomeGraduação, String anoIniGraduacao) {
		super(nome, numMatricula, dtNasc, numTel, numCel, vlHora, email, dtAdmissao);
		this.setQtdIdiomas(qtdIdiomas);
		this.setNomeGraduacao(nomeGraduação);
		this.setAnoIniGraduacao(anoIniGraduacao);
	}

	// Métodos acessores Getters and Setters
	protected int getQtdIdiomas() {
		return qtdIdiomas;
	}

	protected void setQtdIdiomas(int qtdIdiomas) {
		this.qtdIdiomas = qtdIdiomas;
		this.setNvlHora(getVlHora() + (qtdIdiomas * 3.80));
		salarioMensal();
	}

	protected String getNomeGraduacao() {
		return nomeGraduacao;
	}

	protected void setNomeGraduacao(String nomeGraduacao) {
		this.nomeGraduacao = nomeGraduacao;
	}

	protected String getAnoIniGraduacao() {
		return anoIniGraduacao;
	}

	protected void setAnoIniGraduacao(String anoIniGraduacao) {
		this.anoIniGraduacao = anoIniGraduacao;
	}
	
	protected double getSalarioMensal() {
		return salarioMensal;
	}
	
	protected void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	
	// Métodos.
	public void statusSecretaria() {
		System.out.println("\n               Dados do Secretária                ");
		System.out.println("--------------------------------------------------\n");
		statusFuncionarios();
		System.out.println("Quantidade de idiomas: " + this.qtdIdiomas);
		System.out.println("Graduação: " + this.nomeGraduacao);
		System.out.println("Ano inicial da Graduação: " + this.anoIniGraduacao);
		System.out.println("Salario mensal: RS " + this.salarioMensal);
	}
	
	public void salarioMensal() {
		double diasTrabalhados = this.getNvlHora() * 8;
		this.setSalarioMensal(diasTrabalhados * 30);
	}
	
	public void demissao() {
		this.setDtDemissao(LocalDate.now());
	}

}
