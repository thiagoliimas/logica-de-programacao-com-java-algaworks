package LogicaProgramacaoJava;

import java.util.Scanner;

public class AlunoAprovaReprovado {
	
		static final double NOTA_MINIMA = 7; // aqui em cima somente deve ser declarado dessa forma as constantes

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a nota do aluno: ");
		
		double nota = scanner.nextDouble();
		
		scanner.close();
		
		System.out.println(nota >= NOTA_MINIMA ? "Aprovado!" : "Reprovado!");
	}
}
