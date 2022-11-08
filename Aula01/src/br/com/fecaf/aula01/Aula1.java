package br.com.fecaf.aula01;

import java.util.Scanner;

public class Aula1 {

	public static void main(String[] args) {
		
		// Criando uma variável para armazenar o nome do usuário.
		String nome = null;
		
		// Comentário em linha.
		
		/*
		 * Comentário em bloco.
		 * */
		
		// Comando para exibir uma mensagem na tela.
		System.out.println("Olá, Mundo!");
		System.out.println("Me livrei da maudição!!!");
		
		//Instanciar uma class.
		Scanner entradaDados = new Scanner(System.in);
		
		System.out.println("Favor digitar seu nome: ");
		nome = entradaDados.next();
		
		// Mostra na tela uma mensagem de boas vindas mostrando o nome do usurário.
		System.out.println("Bem vindo ao meu sistema, " + nome + ".");
		
	}

}
