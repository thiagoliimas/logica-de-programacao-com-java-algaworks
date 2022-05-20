package LogicaProgramacaoJava;

import java.util.Scanner;

public class IdadeCarteiraMotorista {
	
	static final int IDADE_MINIMA_PARA_HABILITACAO = 18; // a palvara "final" antes do tipo classifica essa vari�vel como constante, tornando impossivel a altera��o do seu valor em outra parte do c�digo.
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // Lembrando de sempre importar o Scanner usando o "ctrl+shift+o"
		
		System.out.print("Bom dia. Qual sua idade? ");
		int idade = scanner.nextInt();
		scanner.close(); // sempre lembrar de fechar o scanner
		
		boolean apto = idade >= IDADE_MINIMA_PARA_HABILITACAO;
		
		if(apto) {
			System.out.println("Voc� j� est� em idade de tirar a habilita��o.");
		} else {
			System.out.println("Voc� ainda � muito novo para dirigir!");
		}
	}

}
