package LogicaProgramacaoJava;

import java.util.Scanner;

public class CalculandoQuadradoNumero {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor que deseja saber o quadrado: ");
		int numeroUsuario = scanner.nextInt();
		
		int resultado = numeroUsuario*numeroUsuario;
		
		System.out.println("O quadrado de " + numeroUsuario + " é " + resultado);
		
		scanner.close();
	}

}
