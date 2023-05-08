package feitosemaula;

import java.util.Scanner;

import util.Calcular;

//usando classe calculator com método estático

public class CalculadoraRaiov3 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o raio: ");
		double raio = sc.nextDouble();
		
		double c = Calcular.circunferencia(raio);
		
		double v = Calcular.volume(raio);
		
		System.out.printf("Circunferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor do PI: %.2f%n", Calcular.PI);
		
		sc.close();

	}
	
}
