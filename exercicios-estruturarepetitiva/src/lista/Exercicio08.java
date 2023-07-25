package lista;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero = sc.nextInt();
		
		int fatorial = 1;
		
		for (int i = 1; i <= numero; i++) {
			fatorial = fatorial * i;
		}
		
		System.out.println(fatorial);
		
		sc.close();

	}

}
