package br.com.fecaf.exercicio02;

import java.util.Scanner;

public class Exercicio0202 {
	
	public static void Par(int i, int f) {
		
		int total = 0;
		System.out.println("\nLista dos numeros PARES.");
		for(int cont = i; cont <= f; cont++) {
			if(cont % 2 == 0) {
				System.out.printf("%4d ", cont);
				total += 1;
				if (total % 20 == 0) {
					System.out.println("");
				}
			}
		}
		System.out.printf("\nA quantidade de numeros encontrados: %d", total);
		System.out.println(" ");
	}
	
	public static void Impar(int i, int f) {
		
		int total = 0;
		System.out.println("\nLista dos numeros IMPARES.");
		for( int cont = i; cont <= f; cont++) {
			if(cont %2 == 1) {
				System.out.printf("%4d ", cont);
				total += 1;
				if(total % 20 == 0) {
					System.out.println("");
				}
			}
		}
		System.out.printf("\nA quantidade de numeros encontrados: %d", total);
		System.out.println(" ");
	}

	public static void main(String[] args) {
		
		int ninicial, nfinal, escolha;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("\n       Numeros PAR e IMPAR       ");
		System.out.println("---------------------------------\n");
		System.out.println("Numero inicial entre 0 e 500.");
		System.out.println("numero final entre 100 e 1000.\n");
		System.out.print("Digite o valor inicial do intervalo: ");
		ninicial = teclado.nextInt();
		System.out.print("Digite o valor final do intervalo: ");
		nfinal = teclado.nextInt();
		if(ninicial > nfinal || ninicial < 0 || ninicial > 500 || nfinal < 100 || nfinal > 1000) {
			System.out.println("\nERRO!!! O calculo não poderá ser executado!");
			System.out.println("Voce digitou algum numero fora dos parametros acima.");
			System.out.println("Reinicie o sistema novamente.");
		} else {
			System.out.print("\nDigite:\n"
					+ "1 para ver somente numeros pares\n"
					+ "2 para ver somente numeros impares\n"
					+ "3 para ver os pares e impares juntos\n");
			System.out.print("Escolha: ");
			escolha = teclado.nextInt();
			switch (escolha) {
			case 1:
				Par(ninicial, nfinal);
				break;
			
			case 2:
				Impar(ninicial, nfinal);
				break;
			
			case 3:
				Par(ninicial, nfinal);
				Impar(ninicial, nfinal);
				break;

			default:
				System.out.println("\nERRO!!!");
				System.out.println("Valor informado inválido!!!");
				System.out.println("Reinicie o sistema novamente.");
				break;
			}
		}

	}

}
