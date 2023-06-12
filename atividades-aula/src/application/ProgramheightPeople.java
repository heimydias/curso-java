	package application;

import java.util.Scanner;

public class ProgramheightPeople {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de dados que irá inserir: ");
		int numero = sc.nextInt();
		
		double[] vect = new double[numero];
		
		for (int i=0; i<numero; i++) {
			System.out.print("Digite a altura: ");
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for (int i=0; i<numero; i++) {
			soma += vect[i];
		}
		
		double avg = soma / numero;
		
		System.out.printf("AVERAEGE HEIGHT: %.2f%n", avg);
		
		sc.close();
	}

}
