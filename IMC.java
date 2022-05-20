package LogicaProgramacaoJava;

import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu peso: ");
		double peso = scanner.nextDouble();
		
		System.out.print("Digite sua altura: ");
		double altura = scanner.nextDouble();
		
		double imc = peso/(altura*altura);
		
		System.out.printf("Seu IMC é: %.2f" , imc);
		
		scanner.close();
	}

}
