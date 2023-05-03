package application;

import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;	
		
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Digite as medidas do triângulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite as medidas do triângulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		
		double areaY = y.area();
		
		System.out.printf("Triangulo X área: %.4f%n", areaX);
		System.out.printf("Triangulo Y área: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Maior área: Triangulo X");
		}
		else {
			System.out.println("Maior área: Triangulo Y");
		}
		
		sc.close();
	}

}
