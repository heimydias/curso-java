package lista;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de dados que irá inserir: ");
		int numero = sc.nextInt();

		double[] vect = new double[numero];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}

		double maior;
		int posmaior;
		
		maior = vect[0];
		posmaior = 0;

		for (int i = 1; i < vect.length; i++) {
			if (vect[i] > maior) {
				maior = vect[i];
				posmaior = i;
			}
		}

		System.out.printf("MAIOR VALOR = %.1f\n", maior);
		System.out.printf("POSIÇÃO DO MAIOR VALOR = %d\n", posmaior);

		sc.close();
	}

}
