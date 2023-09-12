package section14.aula03Atividade;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> productList = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char choice = sc.next().charAt(0);
            System.out.print("Name: ");
            String nameP = sc.next();
            System.out.print("Price: ");
            double priceP = sc.nextDouble();

            if (choice == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                productList.add(new ImportedProduct(nameP, priceP, customsFee));
            } else if (choice == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(sc.next());
                productList.add(new UsedProduct(nameP, priceP, date));
            } else {
                productList.add(new Product(nameP, priceP));
            }

        }

        System.out.println("PRICE TAGS: ");
        for (Product product : productList) {
            System.out.println(product.priceTag());
        }


        sc.close();
    }
}
