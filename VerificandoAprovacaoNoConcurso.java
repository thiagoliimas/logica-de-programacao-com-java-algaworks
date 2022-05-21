package LogicaProgramacaoJava;

import java.util.Scanner;

public class VerificandoAprovacaoNoConcurso {
	
	static int NOTA_MINIMA_POR_PROVA = 60;
	static int NOTA_MINIMA_SOMADA = 150;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
			System.out.print("Digite sua nota em Português: ");
			int notaPortugues = scanner.nextInt();
			
			System.out.print("Digite sua nota em Matemática: ");
			int notaMatematica = scanner.nextInt();
		
		scanner.close();
		int somaNotas = notaPortugues + notaMatematica;
		
		boolean passou = notaPortugues >= NOTA_MINIMA_POR_PROVA && notaMatematica >= NOTA_MINIMA_POR_PROVA && somaNotas >= NOTA_MINIMA_SOMADA;
		
		if(passou) {
		System.out.println("Parabéns! Você foi passou.");
		}else {
			System.out.println("Infelizmente você não passou.");
		}
	}
}
