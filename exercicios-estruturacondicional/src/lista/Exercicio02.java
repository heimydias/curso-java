package lista;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int numero;
		
		System.out.print("Digite um número: ");
		numero = sc.nextInt();
		
		if(numero %2 == 0)
			System.out.print("PAR");
		else
			System.out.print("IMPAR");
		
		sc.close();

	}

}