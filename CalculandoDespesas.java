package LogicaProgramacaoJava;

import java.util.Scanner;

public class CalculandoDespesas {

	public static void main(String[] args) {
		
		double despesas = 0;
		
		Scanner scanner = new Scanner(System.in);
			
			System.out.print("Digite o valor da conta de luz: R$ ");
			despesas += scanner.nextDouble();
			
			System.out.print("Digite o valor da conta de �gua: R$ ");
			despesas += scanner.nextDouble();
			
			System.out.print("Digite o valor da conta de telefone: R$ ");
			despesas += scanner.nextDouble();
			
			System.out.print("Digite o valor da conta de escola: R$ ");
			despesas += scanner.nextDouble();
			
			System.out.print("Digite o valor da conta do cart�o: R$ ");
			despesas += scanner.nextDouble();
			
			System.out.print("Digite o valor da conta de supermercado: R$ ");
			despesas += scanner.nextDouble();
			
		scanner.close();
		
		System.out.printf("\nO valor total das despesas do m�s foi de : R$ %.2f" , despesas);

	}

}
