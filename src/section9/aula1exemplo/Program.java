package section9.aula1exemplo;

import section8.aula1IntroducaoOO.atividade2explicativa.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = sc.nextLine().toUpperCase();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println();
        System.out.println(product);

        System.out.print("\nEnter the number of products o be added in stock: ");
        int number = sc.nextInt();
        product.addProducts(number);

        System.out.println();
        System.out.println(product);

        System.out.print("\nEnter the number of products o be removed in stock: ");
        number = sc.nextInt();
        product.removeProducts(number);

        System.out.println();
        System.out.println(product);

        sc.close();
    }
}
