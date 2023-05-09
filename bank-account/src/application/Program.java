package application;

import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o número da conta: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Entre com o nome do titular da conta: ");
		String name = sc.nextLine();
		System.out.print("Existe um depósito inicial (y/n)? ");
		char caracter = sc.next().charAt(0);
		double deposit;
	
		Account account = new Account(number, name);
		
		if(caracter == 'y') {
			System.out.print("Entre com o valor de depósito inicial: ");
			deposit = sc.nextDouble();
			account.addValue(deposit);
		}
		
		System.out.println();
		System.out.println("Dados da Conta: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Entre com o valor do depósito: ");
		deposit = sc.nextDouble();
		account.addValue(deposit);
		System.out.println("Dados atualizados da Conta:" );
		System.out.println(account);
		
		System.out.println();
		System.out.print("Entre com o valor do saque: ");
		double withdraw = sc.nextDouble();
		account.removeValue(withdraw);
		System.out.println("Dados atualizados da Conta:" );
		System.out.println(account);
		
		sc.close();

	}

}
