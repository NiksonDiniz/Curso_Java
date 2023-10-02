package section20.aula04function;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
   public static void main(String[] args) {
      Locale.setDefault(Locale.US);

      List<Product> list = new ArrayList<>();
      list.add(new Product("Tv", 900.00));
      list.add(new Product("Mouse", 50.00));
      list.add(new Product("Tablet", 350.50));
      list.add(new Product("HD Case", 80.90));

      // Implementação da interface
      // map() aplica uma função a cada elemento da stream
      List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

      // Reference method com método estático
      List<String> names1 = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

      // Reference method com método não estático
      List<String> names2 = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

      // Expressão lambda declarada
      Function<Product, String> func = p -> {
         return p.getName().toUpperCase();
      };
      List<String> names3 = list.stream().map(func).collect(Collectors.toList());

      // Expressão lambda inline
      List<String> names4 = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

      names4.forEach(System.out::println);
   }
}
