package LogicaProgramacaoJava;

import java.util.Scanner;

public class VerificandoAprovacaoNoConcurso {
	
	static int NOTA_MINIMA_POR_PROVA = 60;
	static int NOTA_MINIMA_SOMADA = 150;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
			System.out.print("Digite sua nota em Portugu�s: ");
			int notaPortugues = scanner.nextInt();
			
			System.out.print("Digite sua nota em Matem�tica: ");
			int notaMatematica = scanner.nextInt();
		
		scanner.close();
		int somaNotas = notaPortugues + notaMatematica;
		
		boolean passou = notaPortugues >= NOTA_MINIMA_POR_PROVA && notaMatematica >= NOTA_MINIMA_POR_PROVA && somaNotas >= NOTA_MINIMA_SOMADA;
		
		if(passou) {
		System.out.println("Parab�ns! Voc� foi passou.");
		}else {
			System.out.println("Infelizmente voc� n�o passou.");
		}
	}
}
