package LogicaProgramacaoJava;

import java.util.Scanner;

public class VerificacaoParaAposentadoria {
	
	static final int IDADE_MINIMA_PARA_APOSENTADORIA = 35;
	static final int TEMPO_DE_CONTRIBUICAO_MINIMO = 25;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			
			System.out.print("Digite sua idade: ");
			int idade = scanner.nextInt();
			
			System.out.print("\nDigite o tempo de contribuição: ");
			int contribuicao = scanner.nextInt();
		
		scanner.close();
		
		boolean requisitos = idade >= IDADE_MINIMA_PARA_APOSENTADORIA && 
				contribuicao >= TEMPO_DE_CONTRIBUICAO_MINIMO;
		
		if(requisitos) {
			System.out.println("\nAposentadoria concedida!");
		} else {
			System.out.println("\nAposentadoria não concedida!");
		}

	}

}
