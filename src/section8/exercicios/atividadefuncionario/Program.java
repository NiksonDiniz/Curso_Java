package section8.exercicios.atividadefuncionario;


import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Gross salary: ");
        double salary = sc.nextDouble();
        System.out.print("Tax: ");
        double tax = sc.nextDouble();

        Employee employee = new Employee(name, salary, tax);

        System.out.println("Employee: " + employee);

        sc.close();
    }
}
