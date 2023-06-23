package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Person;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de pessoas: ");
		int numero = sc.nextInt();

		Person[] pessoas = new Person[numero];

		for (int i = 0; i < pessoas.length; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			pessoas[i] = new Person(name, age, height);
		}

		double somaHeight = 0.0;
		int menorDezesseis = 0;
	
		List<String> names = new ArrayList<>();

		for (int i = 0; i < pessoas.length; i++) {
			somaHeight += pessoas[i].getHeight();
			if (pessoas[i].getAge() < 16) {
				menorDezesseis += 1;
				names.add(pessoas[i].getName());
			}
		}

		double percentual = (menorDezesseis * 100) / pessoas.length;

		double mediaH = somaHeight / numero;

		System.out.printf("Altura média: %.2f\n", mediaH);
		System.out.printf("Menores de 16 anos: %.1f%%\n", percentual);
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		};
		
		for (String name: names) { //para cada elemento na collection print o elemento por vez
			System.out.println(name);
		}
		
		names.forEach(System.out::println); //referência de método (pegando minha lista de nomes e para cada elemento print)
		
		sc.close();

	}

}
