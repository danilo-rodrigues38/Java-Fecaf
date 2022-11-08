package br.com.fecaf.empresa;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpresaApp {
	
	private static ArrayList Funcionario() {
		Scanner teclado = new Scanner(System.in);
		ArrayList lista = new ArrayList();
		// teclado = new Scanner(System.in);
		System.out.print("Digite o nome: ");
		String nome = teclado.nextLine();
		lista.add(nome);
		System.out.print("Digite o número da matrícula: ");
		int matricula = teclado.nextInt();
		lista.add(matricula);
		System.out.print("Informe a data de nascimento: ");
		String dtNascimento = teclado.next();
		lista.add(dtNascimento);
		System.out.print("Digite o número do telefone: ");
		String numTelefone = teclado.next();
		lista.add(numTelefone);
		System.out.print("Digite o número do celular: ");
		String numCelular = teclado.next();
		lista.add(numCelular);
		System.out.print("Digite o valor da hora em R$: ");
		double vlHora = teclado.nextDouble();
		lista.add(vlHora);
		System.out.print("Digite o e-mail: ");
		String email = teclado.next();
		lista.add(email);
		System.out.print("Digite a data de admissão: ");
		String dtAdmissao = teclado.next();
		lista.add(dtAdmissao);
		return lista;
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		ArrayList lista = new ArrayList();
		String resp = "S";
		do {
			System.out.println("\n               Cadastro de funcionários");
			System.out.println("------------------------------------------------------\n");
			System.out.println("Escolha qual funcionário quer cadastrar:");
			System.out.println("1 - Motorista\n2 - Secretária");
			System.out.print("Digite: ");
			int escolha = teclado.nextInt();
			if (escolha == 1) {
				lista = Funcionario();
				System.out.print("Digite o número da CNH: ");
				int numCNH = teclado.nextInt();
				lista.add(numCNH);
				System.out.print("Digite a categora da CNH: ");
				String categoria = teclado.next().toUpperCase();
				lista.add(categoria);
				System.out.print("Digite a data da primeira habilitação: ");
				String dtPrimeiraHbilitacao = teclado.next();
				lista.add(dtPrimeiraHbilitacao);
				System.out.print("Digite a data de validade da CNH: ");
				String dtValidade = teclado.next();
				lista.add(dtValidade);
				ArrayList motorista = new ArrayList(lista);
				//System.out.println("\n\n\n" + lista);
			} else {
				lista = Funcionario();
				System.out.print("Digite o número de idiomas fluentes: ");
				int qtdIdiomas = teclado.nextInt();
				lista.add(qtdIdiomas);
				System.out.print("Digite a Graduação: ");
				String nomeGraduacao = teclado.next();
				lista.add(nomeGraduacao);
				System.out.print("Digite o ano de início da Graduação: ");
				String anoIniGraduacao = teclado.next();
				lista.add(anoIniGraduacao);
				Secretaria secretaria1 = new Secretaria();
				secretaria1.statusSecretaria();
				System.out.println("\n\n\n" + lista);
			}			
			System.out.print("\nQuer continuar a cadastrar mais funcionários? [S/N] ");
			resp = teclado.next().toUpperCase();
		} while (resp.equals("S"));
		teclado.close();

	}

}
