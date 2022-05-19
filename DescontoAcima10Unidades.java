package LogicaProgramacaoJava;

import java.util.Scanner;

public class DescontoAcima10Unidades {

	public static void main(String[] args) {
		
		int percentualDesconto = 0;
		double valorFinal = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto :");
		double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite a quantida do produto: ");
		int quantidadeProduto = scanner.nextInt();
		
		scanner.close();
		
		double subTotal = valorProduto*quantidadeProduto;
		
		if(quantidadeProduto >= 10) {
			
			percentualDesconto += 10;
		} 
			double Desconto = subTotal*percentualDesconto/100;
			valorFinal = subTotal- Desconto;
			System.out.println("Desconto de " + percentualDesconto + "% aplicado. Valor final da compra: R$ " + valorFinal);
	}
}
