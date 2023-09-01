package section10.aula01vetoresp2;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos produtos: ");
        int n = sc.nextInt();

        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nome do produto: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Preço do produto: ");
            double price = sc.nextDouble();

            products[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += products[i].getPrice();
        }

        double avg = sum / products.length;

        System.out.printf("AVERAGE PRICE = %.2f%n", avg);

        sc.close();
    }
}
