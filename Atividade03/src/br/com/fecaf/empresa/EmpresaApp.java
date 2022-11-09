package br.com.fecaf.empresa;

import java.util.Scanner;

public class EmpresaApp {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String resp = "S";
		do {
			System.out.println("\n               Cadastro de funcionários");
			System.out.println("------------------------------------------------------\n");
			System.out.println("Escolha qual funcionário quer cadastrar:");
			System.out.println("1 - Motorista\n2 - Secretária");
			System.out.print("Digite: ");
			int escolha = teclado.nextInt();
			if (escolha == 1) {
				teclado = new Scanner(System.in);
				System.out.print("Digite o nome: ");
				String nome = teclado.nextLine();
				System.out.print("Digite o número da matrícula: ");
				int numMatricula = teclado.nextInt();
				System.out.print("Informe a data de nascimento: ");
				String dtNasc = teclado.next();
				System.out.print("Digite o número do telefone: ");
				String numTel = teclado.next();
				System.out.print("Digite o número do celular: ");
				String numCel = teclado.next();
				System.out.print("Digite o valor da hora em R$: ");
				double vlHora = teclado.nextDouble();
				System.out.print("Digite o e-mail: ");
				String email = teclado.next();
				System.out.print("Digite a data de admissão: ");
				String dtAdmissao = teclado.next();
				System.out.print("Digite o número da CNH: ");
				int numCNH = teclado.nextInt();
				System.out.print("Digite a categora da CNH: ");
				String categoria = teclado.next().toUpperCase();
				System.out.print("Digite a data da primeira habilitação: ");
				String dtPrimeiraHbilitacao = teclado.next();
				System.out.print("Digite a data de validade da CNH: ");
				String dtValidade = teclado.next();
				Motorista motorista1 = new Motorista(nome, numMatricula, dtNasc,
						numTel, numCel, vlHora, email, dtAdmissao, numCNH, categoria,
						dtPrimeiraHbilitacao, dtValidade);
				motorista1.demissao();
				motorista1.statusMotorista();
			} else if (escolha == 2){
				teclado = new Scanner(System.in);
				System.out.print("Digite o nome: ");
				String nome = teclado.nextLine();
				System.out.print("Digite o número da matrícula: ");
				int numMatricula = teclado.nextInt();
				System.out.print("Informe a data de nascimento: ");
				String dtNasc = teclado.next();
				System.out.print("Digite o número do telefone: ");
				String numTel = teclado.next();
				System.out.print("Digite o número do celular: ");
				String numCel = teclado.next();
				System.out.print("Digite o valor da hora em R$: ");
				double vlHora = teclado.nextDouble();
				System.out.print("Digite o e-mail: ");
				String email = teclado.next();
				System.out.print("Digite a data de admissão: ");
				String dtAdmissao = teclado.next();
				System.out.print("Digite o número de idiomas fluentes: ");
				int qtdIdiomas = teclado.nextInt();
				System.out.print("Digite a Graduação: ");
				String nomeGraduacao = teclado.next();
				System.out.print("Digite o ano de início da Graduação: ");
				String anoIniGraduacao = teclado.next();
				Secretaria secretaria1 = new Secretaria(nome, numMatricula, dtNasc,
						numTel, numCel, vlHora, email, dtAdmissao, qtdIdiomas, nomeGraduacao,
						anoIniGraduacao);
				secretaria1.demissao();
				secretaria1.statusSecretaria();
			}			
			System.out.print("\nQuer continuar? [S/N] ");
			resp = teclado.next().toUpperCase();
		} while (resp.equals("S"));
		teclado.close();

	}

}
