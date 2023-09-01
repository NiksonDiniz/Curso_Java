package section10.aula02exercicio.desafiopensionato;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] rents = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int room = sc.nextInt();

            rents[room] = new Rent(name, email);
        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i < rents.length; i++) {
            if (rents[i] != null) {
                System.out.println(i + ": " + rents[i]);
            }
        }
        sc.close();
    }
}
