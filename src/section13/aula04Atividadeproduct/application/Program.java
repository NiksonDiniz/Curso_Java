package section13.aula04Atividadeproduct.application;

import section13.aula04Atividadeproduct.entities.Client;
import section13.aula04Atividadeproduct.entities.Order;
import section13.aula04Atividadeproduct.entities.OrderItem;
import section13.aula04Atividadeproduct.entities.Product;
import section13.aula04Atividadeproduct.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = sc.next().toUpperCase();

        Order order = new Order(new Date(), OrderStatus.valueOf(status), client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        Product product;
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String nameP = sc.next();
            System.out.print("Product price: ");
            double priceP = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantityP = sc.nextInt();

            product = new Product(nameP, priceP);
            order.addItem(new OrderItem(quantityP, priceP, product));
        }

        System.out.println("ORDER SUMMARY: ");
        System.out.println(order);


        sc.close();
    }
}
