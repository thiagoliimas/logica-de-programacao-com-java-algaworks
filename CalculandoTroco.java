package LogicaProgramacaoJava;

import java.util.Scanner;

public class CalculandoTroco {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite o valor do cliente: ");
		double valorCliente = scanner.nextDouble();
		
		double troco = valorCliente - valorProduto;
		
		System.out.println("Valor do troco: R$ " + troco);
		
		scanner.close();
		

	}

}
