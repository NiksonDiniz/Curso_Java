package section19.aula01generics;

import java.util.Locale;
import java.util.Scanner;

public class Program {
   public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

      PrintService<Integer> ps = new PrintService<>();

      System.out.print("How many values? ");
      int n = sc.nextInt();

      //ps.addValue("Maria"); não permitirá mais add tipo String

      for (int i = 0; i < n; i++) {
         int value = sc.nextInt();
         ps.addValue(value);
      }


      ps.print();
      System.out.println("First: " + ps.first());

      sc.close();
   }
}
