package section20.aula01comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program {
   public static void main(String[] args) {

      List<Product> list = new ArrayList<>();

      list.add(new Product("TV", 900.0));
      list.add(new Product("Notebook", 1900.0));
      list.add(new Product("Tablet", 700.0));

//      Comparator<Product> comp = new Comparator<Product>() {
//         @Override
//         public int compare(Product p1, Product p2) {
//            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//         }
//      };

      // mesma classe como arrow function
      Comparator<Product> comp = (p1, p2) -> {
         return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
      };

      //Collections.sort(list);

      //usando comparator
      //list.sort(new MyComparator());

      // usando comparator com classe anônima
      //list.sort(comp);

      // usando direto com expressão lambda
      list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

      for (Product p : list) {
         System.out.println(p);
      }
   }
}
