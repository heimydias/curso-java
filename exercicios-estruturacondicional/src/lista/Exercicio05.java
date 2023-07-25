package lista;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("****************************************");
		System.out.println("* CÓDIGO     ESPECIFICAÇÃO      PREÇO  *");
		System.out.println("*   1        Hot Dog            R$4,00 *");
		System.out.println("*   2        X-Salada           R$4,50 *");
		System.out.println("*   3        X-Bacon            R$5,00 *");
		System.out.println("*   4        Torrada            R$2,00 *");
		System.out.println("*   5        Refrigerante       R$1,50 *");
		System.out.println("****************************************");
		
		System.out.print("Digite o código do produto e a quantidade: ");
		String[] entrada= sc.nextLine().split(" ");
		int codigo = Integer.parseInt(entrada[0]);
		int quantidade = Integer.parseInt(entrada[1]);
		
		if(codigo == 1) 
			System.out.printf("Total: R$ %.2f", quantidade * 4.0);
		else if(codigo == 2) 
		System.out.printf("Total: R$ %.2f", quantidade * 4.5);
		else if(codigo == 3) 
			System.out.printf("Total: R$ %.2f", quantidade * 5.0);
		else if(codigo == 4) 
			System.out.printf("Total: R$ %.2f", quantidade * 2.0);
		else if (codigo == 5)
			System.out.printf("Total: R$ %.2f", quantidade * 1.5);
		else
			System.out.print("O código não existe!");
		
		sc.close();
	}

}
