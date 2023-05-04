package application;

import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Salario bruto: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Taxa: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Dados do produto: " + employee);
		
		System.out.println();
		System.out.print("Em qual percentual aumentar salario: ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Atualização dos dados: " + employee);
		
		sc.close();
	}

}
