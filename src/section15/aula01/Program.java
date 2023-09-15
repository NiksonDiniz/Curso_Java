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

        method1();
        System.out.println("End of program");

    }

    public static void method1() {
        System.out.println("***METHOD1 START***");
        method2();
        System.out.println("***METHOD1 END***");

    }

    public static void method2() {
        System.out.println("***METHOD2 START***");
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
        } catch (InputMismatchException e) {
            System.out.println("Input error!");
        }
        sc.close();
        System.out.println("***METHOD2 END***");

        /*
        temos o bloco finally{
            • É um bloco que contém código a ser executado independentemente de ter
            ocorrido ou não uma exceção.
            • Exemplo clássico: fechar um arquivo, conexão de banco de dados, ou outro
            recurso específico ao final do processamento.
        }
         */

    }
}
