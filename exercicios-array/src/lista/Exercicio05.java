package lista;

import java.util.Scanner;

import entities.Person;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de dados que irá inserir: ");
		int numero = sc.nextInt();
		
		int[] vect1 = new int[numero];
		int[] vect2 = new int [numero];
		
		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < vect1.length; i++) {
			vect1[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < vect2.length; i++) {
			vect2[i] = sc.nextInt();
		}
		
		int soma = 0;
		
		System.out.println("VETOR RESULTANTE:");
		for (int i = 0; i < vect1.length; i++) {
			soma = vect1[i] + vect2[i];
			System.out.println(soma);
		}

		sc.close();
	}

}
