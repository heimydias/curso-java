package feitosemaula;

import java.util.Scanner;

public class Ternaria {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o preço: ");
		double preco = sc.nextDouble();
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.printf("O seu desconto é: %.2f%n", desconto);
		
		sc.close();

	}

}
