package section15.aula01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*
            • Em Java, uma exceção é um objeto herdado da classe:
                • java.lang.Exception - o compilador obriga a tratar ou propagar
                • java.lang.RuntimeException - o compilador não obriga a tratar ou propagar
         */

        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
        } catch (InputMismatchException e){
            System.out.println("Input error!");
        }

        System.out.println("End of program");


        sc.close();
    }
}
