package application;

import entities.LegalPerson;
import entities.Person;
import entities.PhysicalPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Person> list = new ArrayList<>();

        System.out.print("Enter the number of payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            if (ch == 'i') {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Anual income: ");
                double income = sc.nextDouble();
                System.out.print("Health expenditures: ");
                double health = sc.nextDouble();

                list.add(new PhysicalPerson(name, income, health));
            } else {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Anual income: ");
                double income = sc.nextDouble();
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();

                list.add(new LegalPerson(name, income, employees));
            }
        }

        System.out.println();
        double total = 0;
        System.out.println("TAXES PAID:");
        for (Person person : list) {
            total += person.taxCalculation();
            System.out.println(person.getName() + String.format(": $ %.2f", person.taxCalculation()));
        }

        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f", total);

        sc.close();
    }
}
