package application;

import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		int number = sc.nextInt();

		Student[] room = new Student[10];
		

		for (int i = 0; i < number; i++) {
			System.out.println();
			System.out.printf("Rent #%d:\n", i + 1);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			room[roomNumber] = new Student(name, email);
		}
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i = 0; i < room.length; i++) {
			if(room[i] != null) {
				System.out.println(i + ": " + room[i]);
			}
			
		}

		sc.close();
	}

}
