package lista;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double raio; 
		double pi = 3.14159; 
		double area;
		
		System.out.print("Digite o valor do raio do circulo: ");
		raio = sc.nextDouble();
		
		raio = Math.pow(raio, 2);
		
		area = raio * pi;
		
		System.out.printf("A = %.4f", area);
		
		sc.close();

	}

}
