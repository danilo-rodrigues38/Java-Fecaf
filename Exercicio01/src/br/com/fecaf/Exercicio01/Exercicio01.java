package br.com.fecaf.Exercicio01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		// Declaração das variáveis
		float nota1 = 0;
		float nota2 = 0;
		float nota3 = 0;
		float nota4 = 0;
		float media = 0;
		float exame = 0;
		float mediaFinal = 0;
		String nomeAluno, nomeProfessor, sexoAluno, sexoProfessor, nomeCurso, situacao, disc = null;
		boolean teste = true;
		
		// Declaração das instancias
		Scanner entradaDados = new Scanner(System.in);
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		
		//Programa principal
		System.out.println("    FECAF - Faculdade Capital Federal"     );
		System.out.println("Sistema para inclusão das notas dos alunos");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("");
		System.out.print("Digite o nome do aluno: ");
			nomeAluno = entradaDados.next();
		System.out.print("Sexo do aluno: [M/F] ");
			sexoAluno = entradaDados.next().toUpperCase();
		System.out.print("Digite o nome do professor: ");
			nomeProfessor = entradaDados.next();
		System.out.print("Sexo do professor: [M/F] ");
			sexoProfessor = entradaDados.next().toUpperCase();
		System.out.print("Digite o nome do curso: ");
			nomeCurso = entradaDados.next();
		System.out.print("Digite a Disciplina: ");
			disc = entradaDados.next();
		
		// Inicio do teste lógico das notas
		System.out.println("");
		System.out.println("Para lançamento das notas, somente serão aceitas as notas entre 0 e 100.");
		
		while (teste) {
		System.out.print("Digite a 1ª nota: ");
			nota1 = entradaDados.nextFloat();
			if (nota1 >= 0 && nota1 <= 100)
				teste = false;
			else
				{
					System.out.println("ERRO!!! Nota digitada inválida.");
					System.out.println("Tente novamente!");
				}
		}
		
		teste = true;
		while (teste) {
		System.out.print("Digite a 2ª nota: ");
			nota2 = entradaDados.nextFloat();
			if (nota2 >= 0 && nota2 <= 100)
				teste = false;
			else
			{
				System.out.println("ERRO!!! Nota digitada inválida.");
				System.out.println("Tente novamente!");
			}
				
		}
				
		teste = true;
		while (teste) {
		System.out.print("Digite a 3ª nota: ");
			nota3 = entradaDados.nextFloat();
			if (nota3 >= 0 && nota3 <= 100)
				teste = false;
			else
			{
				System.out.println("ERRO!!! Nota digitada inválida.");
				System.out.println("Tente novamente!");
			}
		}
		
		teste = true;
		while (teste) {
		System.out.print("Digite a 4ª nota: ");
			nota4 = entradaDados.nextFloat();
			if (nota4 >= 0 && nota4 <= 100)
				teste = false;
			else
			{
				System.out.println("ERRO!!! Nota digitada inválida.");
				System.out.println("Tente novamente!");
			}
		}
		
		// Calculo da média
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (media < 50)
		{
			situacao = "REPROVADO";
		}
		else if (media > 70)
		{
			situacao = "APROVADO";
		}
		else
		{
			System.out.println("");
			situacao = "de EXAME";
			System.out.println("A média do aluno é " + media + " e está " + situacao);
			System.out.println("");
			System.out.print("Digite a nota do exame: ");
			exame = entradaDados.nextFloat();
			mediaFinal = (media + exame) / 2;
			
			if (mediaFinal > 60)
			{
				situacao = "APROVADO";
			}
			else
			{
				situacao = "REPROVADO";
			}
		}
		
		// Exibição do rolatório
		System.out.println("");
		System.out.println("Relatório do aluno:");
		System.out.println("");
		
		if (sexoAluno.equals("M"))
		{
			System.out.println("O aluno " + nomeAluno + " está " + situacao + " na disciplina " + disc + ".");
		}
		else
		{
			System.out.println("A aluna " + nomeAluno + " está " + situacao + " na disciplina " + disc + ".");
		}
			
		System.out.println("Curso: " + nomeCurso);
		
		if (sexoProfessor.equals("M"))
		{
			System.out.println("Professor: " + nomeProfessor);
		}
		else
		{
			System.out.println("Professora: " + nomeProfessor);
		}
		
		if (media > 50 && media < 70)
		{
			System.out.println("Notas do aluno: " + nota1 + ", " + nota2 + ", " + nota3 + ", " + nota4 + ", " + exame);
			System.out.println("Média final: " + media);
			System.out.println("Média final do exame: " + mediaFinal);
		}
		else
		{
			System.out.println("Notas do aluno: " + nota1 + ", " + nota2 + ", " + nota3 + ", " + nota4 + ", ");
			System.out.println("Média final: " + media);
		}
		
		
				
	}

}
