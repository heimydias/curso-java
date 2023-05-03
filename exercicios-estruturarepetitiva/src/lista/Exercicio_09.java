package lista;

import java.util.Scanner;

public class Exercicio_09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número para encontrar seus divisores: ");
		int numero = sc.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
