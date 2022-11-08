package br.com.fecaf.empresa;

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
	private String dtDemissao;
	
	// Método construtor.
	public Funcionario(String nome, int numMatricula, String dtNasc, String numTel, String numCel, double vlHora,
			String email, String dtAdmissao) {
		super();
		this.nome = nome;
		this.numMatricula = numMatricula;
		this.dtNasc = dtNasc;
		this.numTel = numTel;
		this.numCel = numCel;
		this.vlHora = vlHora;
		this.email = email;
		this.dtAdmissao = dtAdmissao;
	}
	public Funcionario() {
		
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
	
	protected String email() {
		return email;
	}

	protected void email(String email) {
		this.email = email;
	}

	protected String getDtAdmissao() {
		return dtAdmissao;
	}

	protected void setDtAdmissao(String dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}

	protected String getDtDemissao() {
		return dtDemissao;
	}

	protected void setDtDemissao(String dtDemissao) {
		this.dtDemissao = dtDemissao;
	}
	
	// Métodos.
	public void statusFuncionarios() {
		
		System.out.println("Nome: " + this.nome);
		System.out.println("Matricula: " + this.numMatricula);
		System.out.println("Data Nascimento: " + this.dtNasc);
		System.out.println("Telefone: " + this.numTel);
		System.out.println("Celular: " + this.numCel);
		System.out.println("Valor por hora trabalhada:" + this.nvlHora);
		System.out.println("Email: " + this.email);
		System.out.println("Data de admissão: " + this.dtAdmissao);
		System.out.println("Data de demissão: " + this.dtDemissao);	
	}
	

}
