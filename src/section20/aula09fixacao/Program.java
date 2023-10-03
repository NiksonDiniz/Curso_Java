package section20.aula09fixacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    List<Employee> employeeList = new ArrayList<>();
    //String path = "C:\\temp\\input.csv";

    System.out.print("Enter file path: ");
    String path = sc.next();

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      String line = br.readLine();
      while (line != null) {
        String[] fields = line.split(",");
        String name = fields[0];
        String email = fields[1];
        Double salary = Double.parseDouble(fields[2]);

        employeeList.add(new Employee(name, email, salary));
        line = br.readLine();
      }

      System.out.print("Enter salary: ");
      double salary = sc.nextDouble();

      //double salary = 2000.000;

      System.out.printf("Email of people whose salary is more than %.2f: ", salary);
      System.out.println();

      List<String> emails = employeeList.stream()
              .filter(p -> p.getSalary() > salary)
              .map(p -> p.getEmail())
              .sorted()
              .collect(Collectors.toList());

      emails.forEach(System.out::println);

      double sumSalary = employeeList.stream()
              .filter(p -> p.getName().charAt(0) == 'M')
              .map(p -> p.getSalary())
              .reduce(0.0, (x, y) -> x + y);

      System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", sumSalary));

    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }


    sc.close();
  }
}
