package Exercicio3;

import java.util.Scanner;

//Converter celsius em fahrenheit e vice versa:
//
//Crie duas funções para conversão de temperaturas: uma converterá celsius em fahrenheit e a outra fará o inverso.
//Saiba que 100c é igual a 212f.

public class Main {
	
	public static void main(String[] args) {
		
			
		int opcao = 0;
		
		while (opcao != 1 && opcao != 2) {
			
			System.out.println("Olá. Digite [1] se deseja celsius para fahrenheit ou [2] fahrenheit para celsius.");
			Scanner g_opcao = new Scanner(System.in);
			opcao = g_opcao.nextInt();
				
			
			if (opcao == 1) { 
				System.out.println("Qual a temperatura?");
				Scanner leitor = new Scanner(System.in);
				int celsius = leitor.nextInt();
				int cparaf =(celsius * 9 / 5) + 32;
				System.out.println("A conversão de celsius para fahrenheit é: " + cparaf);
			
			} else if (opcao == 2) {
				System.out.println("Qual a temperatura?");
				Scanner leitor = new Scanner(System.in);
				int fahrenheit = leitor.nextInt();
				int fparac =(fahrenheit - 32) * 5 / 9;
				System.out.println("A conversão de celsius para fahrenheit é: " + fparac);
			
			} else { 
				System.out.println("Opção invalida.");
		
		
		
		}
		
		
		
	}

}

}