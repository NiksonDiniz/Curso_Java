package section8.aula2membrosestaticos.atividade1explicativav2;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Tivemos que instânciar a Calculator para usar: circumference(), volume() e PI
        Calculator calc = new Calculator();

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = calc.circumference(radius);
        double v = calc.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", calc.PI);

        sc.close();
    }


}
