package lista;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero = sc.nextInt();
		sc.nextLine();
		

		for (int i = 0; i < numero; i++) {
			
			double media = 0.0;
			
			System.out.print("Digite a nota de 3 disciplinas de um aluno: ");
			String[] entrada = sc.nextLine().split(" ");
			double peso2 = Double.parseDouble(entrada[0]);
			double peso3 = Double.parseDouble(entrada[1]);
			double peso5 = Double.parseDouble(entrada[2]);

			media = (((peso2 * 2.0) + peso3 * 3.0) + peso5 * 5.0) / 10;
			
			System.out.printf("%.1f%n", media);
		}
		
		sc.close();

	}

}
