package br.com.fecaf.exercicio02;

import java.util.Scanner;

public class Exercicio0201 {
	
	public static void tabuada() {
		
		int tabinicial, tabfinal, ninicial, nfinal;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("\n                 TABUADA  ");
		System.out.println("--------------------------------------------\n");
		System.out.println("Valores aceitos para o intervalo: 2 a 100");
		System.out.println("Todos os campos deverão ser preencidos!");
		System.out.println("Intervalo de calculo da tabuada e de 1 a 50.\n");
		System.out.print("Quer ver a tabuada inicial de qual valor: ");
		tabinicial = teclado.nextInt();
		System.out.print("Quer ver até qual intervalor de valor: ");
		tabfinal = teclado.nextInt();
		System.out.print("Digite o valor inicial da tabuada: ");
		ninicial = teclado.nextInt();
		System.out.print("Digite o valor final da tabuada: ");
		nfinal = teclado.nextInt();
		if(tabinicial < 2 || tabfinal > 100) {
			System.out.println("\nSomente serão aceitos valores entre 2 e 100.");
		} else if (ninicial < 1 || nfinal > 50) {
			System.out.println("\nSomente serão aceitos valores entre 1 e 50.");
		} else {
			for (int contador = tabinicial; contador <= tabfinal; contador++) {
				System.out.printf("\nTabuada do [%d]\n", contador);
				for (int cont = ninicial; cont <= nfinal; cont++) {
					System.out.printf("%d x %2d = %3d\n", contador, cont, contador * cont);
				}
			}
		}
	}

	public static void main(String[] args) {
		
		tabuada();

	}

}
