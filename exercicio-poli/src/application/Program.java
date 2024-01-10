package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();
        List<ImportedProduct> list1 = new ArrayList<>();
        List<UsedProduct> list2 = new ArrayList<>();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int quantity = sc.nextInt();

        for (int i = 1; i <= quantity; i++) {
            System.out.println("Product #" + i + " data:");

            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);

            if (ch == 'c') {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                sc.nextLine();

                list.add(new Product(name, price));
            } else if (ch == 'u') {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                sc.nextLine();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.nextLine());

                list2.add(new UsedProduct(name, price, manufactureDate));
            } else {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                sc.nextLine();

                list1.add(new ImportedProduct(name, price, customsFee));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product product : list) {
            System.out.println(product.priceTag());
        }
        for (UsedProduct usedProduct : list2) {
            System.out.println(usedProduct.priceTag());
        }
        for (ImportedProduct importedProduct : list1) {
            System.out.println(importedProduct.priceTag());
        }
    }
}
