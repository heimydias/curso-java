package lista;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de dados que irá inserir: ");
		int numero = sc.nextInt();

		double[] vect = new double[numero];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}

		double soma = 0.0;
		
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i];
		}
		
		System.out.print("VALORES: ");
		
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("%.2f ", vect[i]);
		}
		
		System.out.printf("\nSOMA: %.2f%n", soma);
		
		double media = soma / numero;
		
		System.out.printf("MÉDIA: %.2f%n", media);

		sc.close();
		
	}

}
