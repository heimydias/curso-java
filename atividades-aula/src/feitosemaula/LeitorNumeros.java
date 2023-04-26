package feitosemaula;

import java.util.Scanner;

public class LeitorNumeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int x = sc.nextInt();
		int soma = 0;
		
		while (x != 0) {
			soma = soma + x;
			System.out.print("Digite um número: ");
			x = sc.nextInt();
		}
		
		System.out.println("Soma:" + soma);
		
		sc.close();
	}

}
