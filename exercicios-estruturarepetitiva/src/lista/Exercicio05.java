package lista;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = sc.nextInt();
		
		System.out.println("\nInsira os valores");
		
		int in = 0;
		int out = 0;
		
		for (int i = 0; i < numero; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in = in + 1;
			}
			else {
				out = out + 1;
			}
		}
		
		System.out.println("\n" + in + " in");
		System.out.println(out + " out");
		
		sc.close();

	}

}
