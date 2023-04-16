import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a; 
		int b;
		int soma;
		
		System.out.print("Digite o 1º número: ");
		a = sc.nextInt();
		System.out.print("Digite o 2º número: ");
		b = sc.nextInt();
		
		soma = a+b;
		
		System.out.println("Soma = " + soma);
		
		sc.close();
		
	}
	
	
}
