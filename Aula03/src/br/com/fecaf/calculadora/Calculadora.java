package br.com.fecaf.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		try {
			// Declaração de variáveis
			float num1, num2;
			double res = 0;
			String operacao;
			boolean erro = false;
			
			// Instanciar as classes
			Scanner entradaDados = new Scanner(System.in);
			
			// Entrada de Dados
			System.out.print("Entre com o 1º número: ");
				num1 = entradaDados.nextFloat();
			System.out.print("Entre com o 2º número: ");
				num2 = entradaDados.nextFloat();
			System.out.println("Escreva a operação a ser realizada:\n"
					+ "[Somar | Subtrair | Multiplicar | Dividir] ");
			operacao = entradaDados.next().toUpperCase();

			/*
			 * toUpperCase() - converte uma String em MAIÚSCULA;
			 * toLowerCase() - converte uma String em minúscula;
			 * 
			 * 
			 * Operadores de comparação
			 * ==  comparação de igualdade
			 * !=  comparação de diferança
			 * <   comparação de menor
			 * >   comparação de maior
			 * <=  comparação de menor ou igual
			 * >=  comparação de maior ou igual
			 * === comparação de igual e tipo de dados igual das variáveis
			 * !== comparação de conteudo diferente e tipo de dados igual das variáriveis
			 * 
			 * Obs: APENAS NO JAVA: Se a comparação for realizadda por uma variavel do tipo
			 * "String" não será permitido usar "==", deveremos utilizar o metodo "equals()"
			 * 
			 * // Estrutura condicional
			 * if (operacao.equals("SOMAR") || operacao.equals("+"))
			 * { res = num1 + num2; }
			 * else if (operacao.equals("SUBTRAIR") || operacao.equals("-"))
			 * { res = num1 - num2; }
			 * else if (operacao.equals("MULTIPLICAR") || operacao.equals("*"))
			 * { res = num1 * num2; }
			 * else if (operacao.equals("DIVIDIR") || operacao.equals("/"))
			 * { res = num1 / num2; }
			 * else
			 * {
			 * System.out.println("Favor escolher  uma operação válida!!!");
			 * erro = true;
			 * }
			 * 
			 * */
			
			res = calculoMatematico(num1, num2, operacao);
			
			System.out.println("A operação de " + operacao + " entre "
						+ num1 + " e " + num2 + " é " + res);
			
		} catch (Exception e) {
			System.out.println("O calculo não foi realizado, devido a algum valor incorreto!");
		}
		
				
		}

	public static double calculoMatematico(double numero1, double numero2, String tipoCalculo ) {
		/*
		 *  Função para realizar o calculo matemático
		 *  public - significa que a função ou método será pública dentro do projeto,
		 *  		 ou seja, qualquer parte do projeto poderá utilizar.
		 *  void - significa que a função ou método não retornará nenhum valor.
		 *  
		 *  Toda função ou método que retorna algum valor, precisa ser especificado no momento
		 *  da criação da função, ou seja, se é string, boolean, int, float ou outro tipo.
		 * */
		
		/*
		 * Declaração de variáveis no escopo local da function, que recebe os dados
		 * encaminhados nos argumentos da function.
		 * */
		double num1 = numero1;
		double num2 = numero2;
		double res = 0;
		String operacao = tipoCalculo;
		boolean erro = false;
		
		// Código em switchCase
		switch (operacao) {
		case "SOMAR", "+":
			res = num1 + num2;
			break;
		case "SUBTRAIR", "-":
			res = num1 - num2;
			break;			
		case "MULTIPLICAR", "*":
			res = num1 * num2;
			break;			
		case "DIVIDIR", "/":
			res = num1 / num2;
			break;
		default:
			System.out.println("Favor escolher  uma operação válida!!!");
			erro = true;
			break;
		}
		/*
		 * Se acontecer algum erro dentro da função, ela irá retornar null,
		 * porém o null não é um tipo de dado compatível com o double, portanto
		 * realizamos um processo de conversão de null para que o couble possa
		 * aceitar ***** (Double).
		 * */
		if (erro)
			return (Double) null; 
		else
			return res;
	}
}
