package LogicaProgramacaoJava;

import java.util.Scanner;

public class JurosNaVendaaPrazo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int juros = 0; 
		Double valorFinal;
		
		System.out.print("Valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.println("Digite: 1 - Venda à vista | 2 - Venda a prazo ");
		int tipoVenda = scanner.nextInt();
		
		scanner.close();
		
		
		if(tipoVenda == 2) {
			
			juros = 10;
			
		}
		
			valorFinal = valorProduto + (valorProduto * juros)/100;
			
			System.out.println("O valor da venda final da venda é: " + valorFinal);

	}

}
