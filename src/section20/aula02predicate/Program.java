package section20.aula02predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {
  public static void main(String[] args) {
    //    Interface funcional
    //É uma interface que possui um único método abstrato. Suas
    //implementações serão tratadas como expressões lambda.

    List<Product> list = new ArrayList<>();
    list.add(new Product("Tv", 900.00));
    list.add(new Product("Mouse", 50.00));
    list.add(new Product("Tablet", 350.50));
    list.add(new Product("HD Case", 80.90));

    //list.removeIf(p -> p.getPrice() >= 100.0);

    // usando a interface funcional Predicate
    //list.removeIf(new ProductPredicate());

    // usando referencia para  método static (Reference method)
    //list.removeIf(Product::staticProductPredicate);

    // usando referencia para  método não static (Reference method)
    //list.removeIf(Product::productPredicate);

    // Expressão lambda declarada
    Predicate<Product> pred = p -> p.getPrice() <= 100.0;

    list.removeIf(pred);

    // Expressão lambda inline
    list.removeIf(p -> p.getPrice() <= 100.0);

    list.forEach(System.out::println);

  }
}
