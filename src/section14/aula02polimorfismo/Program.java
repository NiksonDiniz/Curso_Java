package section14.aula02polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        List<Employee> emps = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data: ");
            System.out.print("Outsourced (y/n)? ");
            char choice = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (choice == 'y') {
                System.out.print("Additional charge: ");
                double additional = sc.nextDouble();
                emps.add(new OutsourcedEmployee(name, hours, valuePerHour, additional));
            } else {
                emps.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println("\nPAYMENTS: ");
        for (Employee emp : emps) {
            System.out.println(emp.getName()
                    + " - $"
                    + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }
}
