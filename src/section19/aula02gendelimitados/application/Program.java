package section19.aula02gendelimitados.application;

import section19.aula02gendelimitados.entities.Product;
import section19.aula02gendelimitados.service.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
   public static void main(String[] args) {
      Locale.setDefault(Locale.US);

      List<Product> products = new ArrayList<>();
      String path = "C:\\temp\\input.txt";

      try (BufferedReader br = new BufferedReader(new FileReader(path))) {
         String line = br.readLine();
         while (line != null) {
            String[] fields = line.split(",");
            String name = fields[0];
            double price = Double.parseDouble(fields[1]);
            products.add(new Product(name, price));

            line = br.readLine();
         }

         Product x = CalculationService.max(products);
         System.out.println("Most expensive: ");
         System.out.println(x);

      } catch (IOException e) {
         System.out.println("Error: " + e.getMessage());
      }
   }
}
