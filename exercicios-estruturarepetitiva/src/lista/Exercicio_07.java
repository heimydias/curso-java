package lista;

import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);


		System.out.print("Digite um número: ");
		int numero = sc.nextInt();
		sc.nextLine();
		
		
		for (int i = 0; i < numero; i++) {
			
			System.out.print("Digite dois numeros pares: ");
			String[] entrada = sc.nextLine().split(" ");
			int par1 = Integer.parseInt(entrada[0]);
			int par2 = Integer.parseInt(entrada[1]);
			
			if (par2 == 0) {
				System.out.println("Divisão impossível");
			}
			else {
				double div = (double) par1 / par2;
				System.out.printf("%.1f%n", div);
			}
		}
		
		sc.close();

	}

}
