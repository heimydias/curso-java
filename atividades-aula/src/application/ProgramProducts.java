package application;

import java.util.Scanner;

import util.Products;

public class ProgramProducts {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		Products[] vect = new Products[numero];
		 
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Products(name, price);
		}
		
		double soma = 0.0;
		for(int i=0; i<numero; i++) {
			soma += vect[i].getPrice();
		}
		
		double avg = soma / numero;
		
		System.out.printf("AVAREGE PRICE = %.2f%n", avg);
		
		sc.close();
	}

}
