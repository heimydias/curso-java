package lista;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("****************************");
		System.out.println("* CÓDIGO     COMBUSTIVEL   *");
		System.out.println("*   1        Álcool        *");
		System.out.println("*   2        Gasolina      *");
		System.out.println("*   3        Diesel        *");
		System.out.println("*   4        Fim           *");
		System.out.println("****************************");
		
		System.out.println("Com o que você abastece seu automovél? ");
		int x = sc.nextInt();
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while (x != 4) {
			
			if (x == 1) {
				alcool = alcool + x;
				x = sc.nextInt();
			}
			else if (x == 2) {
				gasolina = gasolina + x;
				x = sc.nextInt();
			}
			else if (x == 3) {
				diesel = diesel + x;
				x = sc.nextInt();
			}
			else 
				System.out.println("Digite novamente: ");
				x = sc.nextInt();
			}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}
}