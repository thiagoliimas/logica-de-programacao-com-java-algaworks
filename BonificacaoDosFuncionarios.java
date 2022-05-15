package LogicaProgramacaoJava;

import java.util.Scanner;

public class BonificacaoDosFuncionarios {
	
	static int PORCETAGEM_PARA_BONUS = 80;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
			System.out.print("Digite o valor da meta: R$ ");
			double meta = scanner.nextDouble();
			
			System.out.print("\nDigite o valor alcan�ado: R$ ");
			double alcancado = scanner.nextDouble();
			
			System.out.print("\nDigite o valor da m�dia salarial do funcion�rio: R$ ");
			double mediaSalarial = scanner.nextDouble();
		
		scanner.close();
		
		double porcentagemAtiginda = (alcancado/meta)*100;
		double porcentagemSalario = (mediaSalarial*porcentagemAtiginda)/100;
		
		if(alcancado >= meta) {
			
			System.out.printf("\nParab�ns, a meta foi atiginda! O alcance foi de " + porcentagemAtiginda + "% \nB�nus de R$ " + mediaSalarial + " para o funcion�rio.");
		} else if(porcentagemAtiginda >= PORCETAGEM_PARA_BONUS) {
			System.out.println("\nParab�ns, a meta foi atiginda! O alcance foi de " + porcentagemAtiginda + "%  "+ " \nB�nus de R$ " + porcentagemSalario + " para o funcion�rio.");
		} else {
			System.out.println("\nInfelizmente essa ano n�o ter� b�nus!");
		}

	}

}
