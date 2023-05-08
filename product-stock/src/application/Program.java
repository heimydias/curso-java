package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira os dados do produto: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		Product product = new Product(name, price);
		
		System.out.println();
		System.out.println("Dados do produto: " + product);
		
		System.out.println();
		System.out.print("Entre com número de produtos para serem adicionados ao estoque: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Atualização dos dados: " + product);
		
		System.out.println();
		System.out.print("Entre com número de produtos para serem removidos do estoque: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		 
		System.out.println();
		System.out.println("Atualização dos dados: " + product);
		
		sc.close();

	}

}
