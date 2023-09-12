package section14.aula04classeabstrata;

import section14.aula04classeabstrata.Account;
import section14.aula04classeabstrata.BusinessAccount;
import section14.aula04classeabstrata.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
       /* São classes que não podem ser instanciadas
        • É uma forma de garantir herança total: somente subclasses não
        abstratas podem ser instanciadas, mas nunca a superclasse abstrata */

        // não pode instanciar a account por ser abstrata
        // Account acc1 = new Account(1001, "Alex", 1000.0);
        Account acc2 = new SavingsAccount(1002, "mAria", 1000.0, 0.01);
        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1004, "Alex", 500.0, 0.01));
        list.add(new BusinessAccount(1005, "Maria", 1000.0, 400.0));
        list.add(new SavingsAccount(1006, "Pedro", 300.0, 0.01));
        list.add(new BusinessAccount(1007, "Anna", 500.0, 500.0));

        double sum = 0.0;
        for (Account acc : list) {
            sum += acc.getBalance();
        }
        System.out.printf("Total balance: %.2f%n", sum);

        for (Account acc : list) {
            acc.deposit(10.0);
        }

        sum = 0.0;
        for (Account acc : list) {
            sum += acc.getBalance();
        }
        System.out.printf("Total balance: %.2f%n", sum);


    }
}
