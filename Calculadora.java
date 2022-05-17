package LogicaProgramacaoJava;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Double resultado=null;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		Double valor1 = scanner.nextDouble();
		
		System.out.print("Digite: 1 - Soma | 2 - Subtração | 3 - Multiplicação | 4 - Divisão ");
		Integer  operacao = scanner.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		Double valor2 = scanner.nextDouble();
		
		scanner.close();
		
		if(operacao.equals(1)) {
			resultado = valor1 + valor2;
		} else if(operacao.equals(2)) {
			resultado = valor1 - valor2;
		} else if(operacao.equals(3)) {
			resultado = valor1 * valor2;
		} else if(operacao.equals(4)) {
			 resultado = valor1 / valor2;
		}
		
		System.out.println("Resultado: " + resultado);
	}
}
