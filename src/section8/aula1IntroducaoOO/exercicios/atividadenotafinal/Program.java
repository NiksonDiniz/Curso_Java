package section8.aula1IntroducaoOO.exercicios.atividadenotafinal;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student;

        String name = sc.nextLine();
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();

        student = new Student(name, nota1, nota2, nota3);
        System.out.println("FINAL GRADE = " + student.total());

        if (student.total() >= 60.0) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", 60.0 - student.total());
        }

        sc.close();
    }
}
