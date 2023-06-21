package lista;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int numero = sc.nextInt();

		int[] vect = new int[numero];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}

		int n, somapares = 0, npares = 0;
		double media;

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				somapares = somapares + vect[i];
				npares++;
			}
		}

		if (npares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			media = (double) somapares / npares;

			System.out.printf("MEDIA DOS PARES = %.1f\n", media);
		}

		sc.close();

	}

}