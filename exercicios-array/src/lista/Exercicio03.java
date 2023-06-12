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

		Person[] vect = new Person[numero];

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			vect[i] = new Person(name, age, height);
		}

		double somaH = 0.0;
		int mDezesseis = 0;
		List<String> names = new ArrayList<>();

		for (int i = 0; i < vect.length; i++) {
			somaH += vect[i].getHeight();
			if (vect[i].getAge() < 16) {
				mDezesseis += 1;
				names.add(vect[i].getName());
			}
		}

		double percentual = (mDezesseis * 100) / vect.length;

		double mediaH = somaH / numero;

		System.out.printf("Altura média: %.2f\n", mediaH);
		System.out.printf("Menores de 16 anos: %.1f%%\n", percentual);
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		};
		
		sc.close();

	}

}
