package feitosemaula;

import java.util.Scanner;

import util.Calcular;

//usando classe calculator com membros de instância e sem static

public class CalculadoraRaiov2 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Calcular calc = new Calcular();
		
		System.out.print("Entre com o raio: ");
		double raio = sc.nextDouble();
		
		double c = calc.circunferencia(raio);
		
		double v = calc.volume(raio);
		
		System.out.printf("Circunferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor do PI: %.2f%n", calc.PI);
		
		sc.close();

	}
	
}
