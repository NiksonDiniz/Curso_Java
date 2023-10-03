package section20.aula08atividade;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    //System.out.print("Enter full file path: ");
    //String path = sc.next();

    List<Product> list = new ArrayList<>();
    String path = "C:\\temp\\input.csv";

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      String line = br.readLine();
      while (line != null) {
        String[] fields = line.split(",");
        list.add(new Product(fields[0], Double.parseDouble(fields[1])));
        line = br.readLine();
      }

      double avg = list.stream()
              .map(p -> p.getPrice())
              .reduce(0.0, (x, y) -> x + y) / list.size();

      Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

      List<String> names = list.stream()
              .filter(p -> p.getPrice() < avg)
              .map(p -> p.getName())
              .sorted(comp.reversed())
              .collect(Collectors.toList());

      System.out.println("Average price: " + String.format("%.2f", avg));
      names.forEach(System.out::println);


    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }

    sc.close();
  }
}
