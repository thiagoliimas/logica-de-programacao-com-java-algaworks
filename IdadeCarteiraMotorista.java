package LogicaProgramacaoJava;

import java.util.Scanner;

public class IdadeCarteiraMotorista {
	
	static final int IDADE_MINIMA_PARA_HABILITACAO = 18; // a palvara "final" antes do tipo classifica essa variável como constante, tornando impossivel a alteração do seu valor em outra parte do código.
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // Lembrando de sempre importar o Scanner usando o "ctrl+shift+o"
		
		System.out.print("Bom dia. Qual sua idade? ");
		int idade = scanner.nextInt();
		scanner.close(); // sempre lembrar de fechar o scanner
		
		boolean apto = idade >= IDADE_MINIMA_PARA_HABILITACAO;
		
		if(apto) {
			System.out.println("Você já está em idade de tirar a habilitação.");
		} else {
			System.out.println("Você ainda é muito novo para dirigir!");
		}
	}

}
