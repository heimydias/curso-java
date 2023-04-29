package lista;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int numero1;
		int numero2;
		
		System.out.print("Digite dois números: ");
		String[] entrada= sc.nextLine().split(" ");
		numero1 = Integer.parseInt(entrada[0]);
		numero2 = Integer.parseInt(entrada[1]);
		
		if(numero1 %numero2 == 0) 
			System.out.print("São Multiplos");
		else if (numero2 %numero1 == 0)
			System.out.print("São Multiplos");
		else
			System.out.print("Não são Multiplos");
		
		sc.close();
	}

}
