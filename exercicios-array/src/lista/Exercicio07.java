package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
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
		
		double media = soma / numero;
		
		System.out.printf("MÉDIA: %.3f%n", media);
		
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
		for (int i = 0; i < vect.length; i++) {
			if(vect[i] < media) {
				System.out.printf("%.1f\n", vect[i]);
			}
		}
		
		sc.close();

	}

}
