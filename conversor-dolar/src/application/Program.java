package application;

import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor do dollar? ");
		double dollar = sc.nextDouble();
		System.out.print("uantos dólares serão comprados? ");
		double comprados = sc.nextDouble();
		
		double pagar = CurrencyConverter.dollarPagar(dollar, comprados);
		
		System.out.printf("Valor a ser pago em reais: %.2f%n", pagar);
		
		sc.close();

	}

}
