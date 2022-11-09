package br.com.fecaf.empresa;

import java.time.LocalDate;

public abstract class Funcionario {

	// Atributos.
	private String nome;
	private int numMatricula;
	private String dtNasc;
	private String numTel;
	private String numCel;
	private double vlHora;
	private double nvlHora;
	private String email;
	private String dtAdmissao;
	private LocalDate dtDemissao;
	
	// Método construtor.
	public Funcionario(String nome, int numMatricula, String dtNasc, String numTel, String numCel, double vlHora,
			String email, String dtAdmissao) {
		super();
		this.setNome(nome);
		this.setNumMatricula(numMatricula);
		this.setDtNasc(dtNasc);
		this.setNumTel(numTel);
		this.setNumCel(numCel);
		this.setVlHora(vlHora);
		this.setEmail(email);
		this.setDtAdmissao(dtAdmissao);
	}
	
	// Métodos acessores Getters and Setters.
	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected int getNumMatricula() {
		return numMatricula;
	}

	protected void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	protected String getDtNasc() {
		return dtNasc;
	}

	protected void setDtNasc(String dtNasc) {
		this.dtNasc = dtNasc;
	}

	protected String getNumTel() {
		return numTel;
	}

	protected void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	protected String getNumCel() {
		return numCel;
	}

	protected void setNumCel(String numCel) {
		this.numCel = numCel;
	}

	protected double getVlHora() {
		return vlHora;
	}

	protected void setVlHora(double vlHora) {
		this.vlHora = vlHora;
	}
	
	protected double getNvlHora() {
		return nvlHora;
	}
	protected void setNvlHora(double nvlhora) {
		this.nvlHora = nvlhora;
	}
	
	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

	protected String getDtAdmissao() {
		return dtAdmissao;
	}

	protected void setDtAdmissao(String dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}

	protected LocalDate getDtDemissao() {
		return dtDemissao;
	}

	protected void setDtDemissao(LocalDate dtDemissao) {
		this.dtDemissao = dtDemissao;
	}
	
	// Métodos.
	public void statusFuncionarios() {
		
		System.out.println("Nome: " + this.nome);
		System.out.println("Matricula: " + this.numMatricula);
		System.out.println("Data Nascimento: " + this.dtNasc);
		System.out.println("Telefone: " + this.numTel);
		System.out.println("Celular: " + this.numCel);
		System.out.println("Valor por hora: R$ " + this.vlHora);
		System.out.println("Novo valor da hora: R$ " + this.nvlHora);
		System.out.println("Email: " + this.email);
		System.out.println("Data de admissão: " + this.dtAdmissao);
		System.out.println("Data de demissão: " + this.dtDemissao);	
	}
	

}
