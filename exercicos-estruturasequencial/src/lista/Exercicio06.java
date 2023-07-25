package lista;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		double valor1;
		double valor2;
		double valor3;
		double triangulo;
		double circulo;
		double pi = 3.14159;
		double trapezio;
		double quadrado;
		double retangulo;
		
		System.out.print("Digite três valores: ");
		String[] entrada1= sc.nextLine().split(" ");
		valor1 = Double.parseDouble(entrada1[0]);
		valor2 = Double.parseDouble(entrada1[1]);
		valor3 = Double.parseDouble(entrada1[2]);
		
		triangulo = (valor1 * valor3) / 2;
		
		circulo = Math.pow(valor3, 2) * pi;
		
		trapezio = ((valor1 + valor2) * valor3) / 2;
		
		quadrado = Math.pow(valor2, 2);

		retangulo = valor1 * valor2;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close();
	}

}
