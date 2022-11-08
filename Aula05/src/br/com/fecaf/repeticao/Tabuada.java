package br.com.fecaf.repeticao;

import java.util.Scanner;

public class Tabuada {
	
	public static int menu() {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Quer fazer a tabuada utilizando o\n          WHILE ou FOR?\n");
		System.out.println("1 - WHILE ou 2 - FOR\n");
		System.out.print("Resposta: ");
		int resp = teclado.nextInt();
		return resp;
	}
	
	public static void dois(int num) {
		
		System.out.println("Exemplo utilizando a estrutura FOR...");
		for (int cont = 0; cont < 11; cont++) {
			System.out.printf("%2d x %d = %2d\n", cont, num, (num * cont));
		}

	}
	
	public static void um(int num) {
		
		int c = 0;
		System.out.println("Exemplo utilizando a estrutura WHILE...");
		while (true) {
			if (c <= 10) {
				System.out.printf("%2d x %2d = %2d\n", c, num, (num * c));
				c++;
			}
			
		}

	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("\nTABUADA");
		System.out.println("-------\n");
		System.out.print("Digite um valor: ");
		int num = teclado.nextInt();
		System.out.println("");
		int resp = menu();
		if (num > 0) {
			if (resp == 2) {
				dois(num);
			} else {
				um(num);
			}
				
		} else {
				System.out.println("Valor informado inválido!");
		}

	}
		
}
