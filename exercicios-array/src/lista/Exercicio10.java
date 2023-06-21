package lista;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int numero;
		double media;

		System.out.print("Quantos alunos serao digitados? ");
		numero = sc.nextInt();

		String[] nomes = new String[numero];
		double[] notas1 = new double[numero];
		double[] notas2 = new double[numero];

		for (int i = 0; i < numero; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
			sc.nextLine();
			nomes[i] = sc.nextLine();
			notas1[i] = sc.nextDouble();
			notas2[i] = sc.nextDouble();
		}

		System.out.println("Alunos aprovados:");

		for (int i = 0; i < numero; i++) {
			media = (notas1[i] + notas2[i]) / 2;

			if (media >= 6.0) {
				System.out.printf("%s\n", nomes[i]);
			}
		}

		sc.close();
	}
}