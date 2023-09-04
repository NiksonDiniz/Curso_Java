package section10.aula03exercicio.application;

import section10.aula03exercicio.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEmployee #" + i + ": ");
            System.out.print("ID: ");
            int id = sc.nextInt();
            while (hasId(employees, id)) {
                System.out.println("ID already taken! Try again: ");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            employees.add(new Employee(id, name, salary));
        }

        System.out.print("Enter the employee id that will have salary increase : ");
        int id = sc.nextInt();

        Employee emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (emp != null) {
            System.out.print("\nEnter the percentage: ");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        } else {
            System.out.println("This id does not exist!");
        }

        System.out.println("\nList of employees: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        sc.close();
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
