package LogicaProgramacaoJava;

import java.util.Scanner;

public class FreteNaCompra {
	
	public static void main(String[] args) {
		
		double valorDoFrete = 0;
		
		Scanner scanner = new Scanner(System.in);
		
			System.out.print("Digite o valor do produto: R$ ");
			double valorDoProduto = scanner.nextDouble();
		
		scanner.close();
		
		boolean frete = valorDoProduto >= 100;
		
		if(frete) {
			valorDoFrete = 15.00;	
		}
		
		double valorTotal = valorDoProduto+valorDoFrete;
		
		System.out.printf("\nValor do produto: R$ %.2f" , valorDoProduto);
		
		System.out.printf("\nValor do frete: R$ %.2f" , valorDoFrete);
		
		System.out.printf("\n\nValor total da compra: R$ %.2f" , valorTotal);
	}
}
