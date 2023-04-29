package lista;
import java.util.Scanner;

public class Exercico_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor1; 
		int valor2;
		int valor3;
		int valor4;
		int diferenca;
		
		System.out.print("Digite o 1º número: ");
		valor1 = sc.nextInt();
		System.out.print("Digite o 2º número: ");
		valor2 = sc.nextInt();
		System.out.print("Digite o 3º número: ");
		valor3 = sc.nextInt();
		System.out.print("Digite o 4º número: ");
		valor4 = sc.nextInt();
		
		diferenca = (valor1 * valor2) - (valor3 * valor4);
		
		System.out.println("Diferença = " + diferenca);
		
		sc.close();

	}
	
}
