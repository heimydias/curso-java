package lista;

import java.util.Scanner;

public class Exercico04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de dados que irá inserir: ");
		int numero = sc.nextInt();

		int[] vect = new int[numero];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}

		int pares = 0;
		
		System.out.print("NÚMEROS PARES: ");

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] %2 == 0) {
				System.out.print(vect[i] + " ");
				pares++;
			}
		}
		
		System.out.print("\nQUANTIDADE DE PARES = " + pares);

		sc.close();

	}

}
