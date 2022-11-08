package br.com.fecaf.encapsulamento;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);
		
		//System.out.print("Escolha o Curso [C - Colégio, G - Graduação, P - Pós Graduação]:");
		
		//Instanciar a classe Aluno
		Aluno aluno1 = new Aluno();

		
		System.out.print("Digite o RA:");
		aluno1.setRa(entradaDados.next());
		System.out.print("Digite o Nome:");
		aluno1.setNome(entradaDados.next());
		System.out.print("Digite o SobreNome:");
		 // Cria uma nova instancia do objeto para resolver o bug do nextLine()
		entradaDados = new Scanner (System.in);
		aluno1.setSobreNome(entradaDados.nextLine());
		System.out.print("Digite o sexo [M | F]:");
		aluno1.setSexo(entradaDados.next());
		System.out.print("Digite a data de nascimento:");
		aluno1.setDataNascimento(entradaDados.next());
		//aluno1.setTipoCurso("P");
		
		aluno1.getDadosAluno();
		
		//Instancia da classe colegio
		AlunoColegio aluno2 = new AlunoColegio();
		aluno2.setRa("123");
		aluno2.setNome("Ricardo");
		aluno2.setSobreNome("Sousa");
		aluno2.setDataNascimento("01/08/2005");
		aluno2.setSexo("M");
		aluno2.setNomeResponsavel("Maria de Sousa");
		aluno2.setCelularResponsavel("11987878787");
		aluno2.setEmailResponsavel("maria@gmail.com");
		aluno2.setTelefoneResponsavel("47789898");
		
		aluno2.getDadosAlunoColegio();
	}

}
