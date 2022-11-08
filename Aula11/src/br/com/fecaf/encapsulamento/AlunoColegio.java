package br.com.fecaf.encapsulamento;

public class AlunoColegio extends Aluno{
	//Atributos			//extends realiza o processo de herança da classe Aluno
	private String nomeResponsavel;
	private String emailResponsavel;
	private String telefoneResponsavel;
	private String celularResponsavel;
	
	//Construtor
	public AlunoColegio () {
		this.setTipoCurso("Colégio");
	}
	
	//set nome resposanvel
	public void setNomeResponsavel (String nomeResponsavel) {
		this.nomeResponsavel  = nomeResponsavel;
	}
	//get nome resposanvel
	public String getNomeResponsavel () {
		return this.nomeResponsavel;
	}
	
	//set email responsavel
	public void setEmailResponsavel (String emailResponsavel) {
		this.emailResponsavel  = emailResponsavel;
	}
	//get email responsavel
	public String getEmailResponsavel () {
		return this.emailResponsavel;
	}
	
	//set telefone resposanvel
	public void setTelefoneResponsavel (String telefoneResponsavel) {
		this.telefoneResponsavel  = telefoneResponsavel;
	}
	//get telefone resposanvel
	public String getTelefoneResponsavel () {
		return this.telefoneResponsavel;
	}
	
	//set celular resposanvel
	public void setCelularResponsavel (String celularResponsavel) {
		this.celularResponsavel  = celularResponsavel;
	}
	//get celular resposanvel
	public String getCelularResponsavel () {
		return this.celularResponsavel;
	}
	public void getDadosAlunoColegio() {
		this.getDadosAluno();
		System.out.println("Nome do Responsavel: " + this.getNomeResponsavel());
		System.out.println("Celular do Responsável: " + this.getCelularResponsavel());
		System.out.println("E-mail do Responsável: " + this.getEmailResponsavel());
		System.out.println("Telefone do Responsável: " + this.getTelefoneResponsavel());
	}
	
	
}
