package section14.aula06exerciciofixacao.application;

import section14.aula06exerciciofixacao.entities.Company;
import section14.aula06exerciciofixacao.entities.Individual;
import section14.aula06exerciciofixacao.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        List<TaxPayer> taxPayerList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                taxPayerList.add(new Individual(name, annualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                taxPayerList.add(new Company(name, annualIncome, numberOfEmployees));
            }
        }

        System.out.println("\nTAXES PAID: ");
        for (TaxPayer taxP : taxPayerList) {
            System.out.println(taxP.getName() + ": $ " + String.format("%.2f", taxP.tax()));
        }

        double sum = 0.0;
        System.out.println("\nTAXES PAID: ");
        for (TaxPayer taxP : taxPayerList) {
            sum += taxP.tax();
        }
        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f%n", sum);

        sc.close();
    }
}
