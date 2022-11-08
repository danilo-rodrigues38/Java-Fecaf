package br.com.fecaf.media;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaEscolar {

	public static void main(String[] args) {
		/* TIPOS DE VARIÁVEIS
		 * 
		 * String  - representa a entrada de texto, deve ser escrito com a primeira letra
		 * 			 maiúscula, pois representa uma classe
		 * Integer - representa a entrada de números positivos e negativos;
		 * Float   - representa a entrada de números positivos e negativos com casas decimais;
		 * Boolean - representa a entrada de dados verdadeiro ou false;
		 * Char    - representa a entrada de texto (quantidade de caracteres menor);
		 * Double  - representa a entrada de números positivos e negativos com casas decimais
		 *           (quantidades de números muito maior);
		 * Decimal - representa a entrada de números positivos e negativos com casas decimais
		 *           (quantidades de números muito maior);
		 * Short   - representa a entrada de números (quantidade de números menor);
		 * 
		 * 
		 * */
		// Declaração de variáveis
		float nota1, nota2, nota3, nota4, media;
		String nome;
		
		// Instancia de uma classe
		Scanner entradaDados = new Scanner(System.in);
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		
		// Entrada de dados pelo usuário
		// entradaDados.next()     - permite a entrada de apenas uma palavra 
		// entradaDados.nextline() - permite a entrada de palavras compostas
		System.out.print("Favor digitar o nome do aluno: ");
			nome = entradaDados.next();
		System.out.print("Favor digitar a 1ª nota: ");
			nota1 = entradaDados.nextFloat();
		System.out.print("Favor digitar a 2ª nota: ");
			nota2 = entradaDados.nextFloat();
		System.out.print("Favor digitar a 3ª nota: ");
			nota3 = entradaDados.nextFloat();
		System.out.print("Favor digitar a 4ª nota: ");
			nota4 = entradaDados.nextFloat();
		
		// Processamento da média do aluno
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		// Exibição do resultado
		System.out.println(String.format("O aluno %s, teve a média de %.2f.", nome, media));
		System.out.println("A média do aluno é " + numberFormat.format(media));
		// Na linha acima foi utilizado o instanciamento de decimal.
		
	}

}
