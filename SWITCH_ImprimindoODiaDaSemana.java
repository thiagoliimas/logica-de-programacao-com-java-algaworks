package LogicaProgramacaoJava;

import java.util.Scanner;

public class SWITCH_ImprimindoODiaDaSemana {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
			System.out.println("Digite um número de 1 - 7: ");
			int diaUsuario = scanner.nextInt();
		
		scanner.close();
		
		String dia;
		
		switch (diaUsuario){
			case 1: dia = "Domingo"; break;
			case 2: dia = "Segunda-feira"; break;
			case 3: dia =  "Terça-feira"; break;
			case 4: dia =  "Quarta-feira"; break;
			case 5: dia =  "Quinta-feira"; break;
			case 6: dia =  "Sexta-feira"; break;
			case 7: dia =  "Sábado"; break;
			default: dia =  "Digite um valor válido!";
		} 
		
		System.out.println(dia);
	}
}
