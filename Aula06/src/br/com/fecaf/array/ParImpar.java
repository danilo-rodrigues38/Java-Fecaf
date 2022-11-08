package br.com.fecaf.array;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class ParImpar {

	public static void main(String[] args) {
		int valorInicial;
		int valorFinal;
		int cont=0;
		
		Scanner entradaDados = new Scanner (System.in);
		
		System.out.print("Digite o número Inicial: ");
		valorInicial = entradaDados.nextInt();
		
		System.out.print("Digite o número Final: ");
		valorFinal = entradaDados.nextInt();
		
		//Recebe o array de numeros pares da função e guarda
		//em um array local com as mesmas caracteristicas
		System.out.println("\nLista dos numeros pares.");
		int [] pares = getPares(valorInicial, valorFinal);
		while (cont < pares.length)
		{
			System.out.printf("%d ", pares[cont]);
			cont++;
		}
		System.out.println("\n\nLista dos numeros impares.");
		ArrayList<Integer> impares = getImpares(valorInicial, valorFinal);
		//System.out.println(impares);
		for (int item : impares)
		{
			System.out.printf("%d ", item);
		}

	}
	// Função que retorna os números pares utilizando array
	public static int[] getPares (int numeroInicial, int numeroFinal)
	{
		int valorInicial = numeroInicial;
		int valorFinal = numeroFinal;
		//int indice = valorFinal - valorInicial;
		//Criação de uma variavel do tipo array
		int [] pares = new int[10];
		int cont = 0;
		
		while(valorInicial <= valorFinal)
		{
			if(valorInicial % 2 == 0)
			{
				pares[cont] = valorInicial;
				cont++;
			}
			valorInicial++;
		}
		return pares;
	}

	public static ArrayList<Integer> getImpares (int numeroInicial, int numeroFinal)
	{
		int valorInicial = numeroInicial;
		int valorFinal = numeroFinal;
		
		// Instancia da classe ArrayList para criar um elemento do tipo array (inteiro)
		ArrayList<Integer> impares = new ArrayList<Integer>();
		
		// impares.add() - Adiciona um novo elemento no array.
		// impares.remove() - Remove um elemento do array.
		// impares.size() - Retorna a quantidade de um array.
		// impares.get() - Retorna um valor baseado em um indice.
		// impares.indexOf() - Busca um conteudo no array e retorma o seu indice.
		//				Obs.: (Se encontrar, retorna o indice do elemento, senão encontar ele retorna -1). 
		// impares.contains() - Busca um conteudo no array e retorna true ou false.
		// impares.set() - Atualizar um conteudo do array baseado no indice.
		// impares.clear() ou .removeAll() - Apaga o conteudo de array.
		
		while (valorInicial <= valorFinal)
		{
			if (valorInicial % 2 != 0)
			{
				impares.add(valorInicial);
			}
			valorInicial++;
		}
		
		return impares;
	}
}
