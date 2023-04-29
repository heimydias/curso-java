package lista;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int numero;
		
		System.out.print("Digite um número: ");
		numero = sc.nextInt();
		
		if(numero < 0)
			System.out.print("NEGATIVO");
		else
			System.out.print("NÃO NEGATIVO");
		
		sc.close();

	}

}
