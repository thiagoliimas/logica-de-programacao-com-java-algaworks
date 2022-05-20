package LogicaProgramacaoJava;

import java.util.Scanner;

public class ImpressãoDeNomeUsandoOScannerNextLine {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // Lembrar de dar o ctrl + shif + o para importar o Scanner;
		
		System.out.print("Bom dia! Qual o seu primeiro nome? ");
		String nome = scanner.nextLine();
		
		System.out.print("Agora me informe seu sobrenome ");
		String sobrenome = scanner.nextLine();
		
		System.out.println("Bem-vindo ao sistema, Sr(a) " + nome + " " + sobrenome + ".");
		
		scanner.close();
	}

}
