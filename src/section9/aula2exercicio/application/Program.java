package section9.aula2exercicio.application;


import section9.aula2exercicio.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n): ");
        char response = sc.next().charAt(0);

        if (response == 'n') {
            account = new Account(number, holder);
        } else {
            System.out.print("Enter initial deposit value: ");
            double initialValue = sc.nextDouble();
            account = new Account(number, holder, initialValue);
        }

        System.out.println("\nAccount data:");
        System.out.println(account);

        System.out.print("\nEnter a deposit value: ");
        double amount = sc.nextDouble();
        account.deposit(amount);

        System.out.println("\nUpdated Account data:");
        System.out.println(account);

        System.out.print("\nEnter a withdraw value: ");
        amount = sc.nextDouble();
        account.withdraw(amount);

        System.out.println("\nUpdated Account data:");
        System.out.println(account);

        sc.close();
    }
}
