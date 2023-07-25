package lista;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		double numero = sc.nextDouble();
		
		if(numero < 0 || numero > 100)
			System.out.print("Fora de intervalo");
		else if (numero <= 25.0)
			System.out.print("Intervalo entre 0 e 25");
		else if (numero <= 50.0)
			System.out.print("Intervalo entre 25 e 50");
		else if (numero <= 75.0)
			System.out.print("Intervalo entre 50 e 75");
		else
			System.out.print("Intervalo entre 75 e 100");
		
		sc.close();
	}

}
