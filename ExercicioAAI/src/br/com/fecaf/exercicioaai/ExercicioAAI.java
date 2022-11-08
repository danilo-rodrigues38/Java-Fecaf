package br.com.fecaf.exercicioaai;

import java.util.Scanner;

public class ExercicioAAI {

	public static void main(String[] args) {
		
		String nome, reajuste;
		double salario, novosal;
		int anos;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o nome do funcionário: ");
		nome = teclado.nextLine();
		System.out.println("Digite a qtde de anos que o funcionario tem de empresa: ");
		anos = teclado.nextInt();
		System.out.println("Digite o salário do funcionario: ");
		salario = teclado.nextDouble();
		if (anos <= 5) {
			reajuste = "10%";
			novosal = salario + (salario * 0.10);
		} else if (anos <= 8) {
			reajuste = "20%";
			novosal = salario + (salario * 0.20);
		} else if (anos <= 15) {
			reajuste = "25%";
			novosal = salario + (salario * 0.25);
		} else {
			reajuste = "30%";
			novosal = salario + (salario * 0.30);
		}
		System.out.printf("\nO funcionario: %s", nome);
		System.out.printf("\nO reajuste foi de: %s", reajuste);
		System.out.printf("\nNovo salario e: %.2f", novosal);
		teclado.close();
	}

}
