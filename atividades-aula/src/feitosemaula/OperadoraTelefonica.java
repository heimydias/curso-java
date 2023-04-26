package feitosemaula;

import java.util.Scanner;

public class OperadoraTelefonica {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite os minutos utilizados: ");
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		
		if(minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		
		System.out.printf("O valor da conta = R$ %.2f%n", conta);
				
		sc.close();

	}

}
