package LogicaProgramacaoJava;

import java.util.Scanner;

public class BonificacaoDosFuncionarios {
	
	static int PORCETAGEM_PARA_BONUS = 80;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
			System.out.print("Digite o valor da meta: R$ ");
			double meta = scanner.nextDouble();
			
			System.out.print("\nDigite o valor alcançado: R$ ");
			double alcancado = scanner.nextDouble();
			
			System.out.print("\nDigite o valor da média salarial do funcionário: R$ ");
			double mediaSalarial = scanner.nextDouble();
		
		scanner.close();
		
		double porcentagemAtiginda = (alcancado/meta)*100;
		double porcentagemSalario = (mediaSalarial*porcentagemAtiginda)/100;
		
		if(alcancado >= meta) {
			
			System.out.printf("\nParabéns, a meta foi atiginda! O alcance foi de " + porcentagemAtiginda + "% \nBônus de R$ " + mediaSalarial + " para o funcionário.");
		} else if(porcentagemAtiginda >= PORCETAGEM_PARA_BONUS) {
			System.out.println("\nParabéns, a meta foi atiginda! O alcance foi de " + porcentagemAtiginda + "%  "+ " \nBônus de R$ " + porcentagemSalario + " para o funcionário.");
		} else {
			System.out.println("\nInfelizmente essa ano não terá bônus!");
		}

	}

}
