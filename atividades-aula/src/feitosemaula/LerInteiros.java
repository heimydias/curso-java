package feitosemaula;

import java.util.Scanner;

public class LerInteiros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de números que irá somar: ");
		int numero = sc.nextInt();
		int soma = 0;
		
		for (int i = 0; i < numero; i++) {
			int x = sc.nextInt();
			soma = soma + x;	
		}
		
		System.out.println("A soma dos números é = " + soma);		
		
		sc.close();

	}

}
