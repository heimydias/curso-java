package lista;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero, mIdade, posicaoM;

		System.out.print("Quantas pessoas voce vai digitar? ");
		numero = sc.nextInt();

		String[] nomes = new String[numero];
		int[] idades = new int[numero];

		for (int i = 0; i < numero; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
		}

		mIdade = idades[0];
		posicaoM = 0;

		for (int i = 1; i < numero; i++) {
			if (idades[i] > mIdade) {
				mIdade = idades[i];
				posicaoM = i;
			}
		}

		System.out.printf("PESSOA MAIS VELHA: %s\n", nomes[posicaoM]);

		sc.close();
	}
}