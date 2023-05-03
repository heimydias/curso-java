package feitosemaula;

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite três números:");
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		int numero3 = sc.nextInt();
		int maior = max(numero1, numero2, numero3);
		
		mostreResultado(maior);
		
		sc.close();
	}

	public static int max(int x, int y, int z) {
		int guardarV;
		if (x > y && x > z) {
			guardarV = x;
		} else if (y > z) {
			guardarV = y;
		} else {
			guardarV = z;
		}
		return guardarV;
	}

	public static void mostreResultado(int value) {
		System.out.println("Maior = " + value);
	}
}