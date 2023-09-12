package section14.aula05metodoabstrato;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*
            São métodos que não possuem implementação.
            Métodos precisam ser abstratos quando a classe
            é genérica demais para conter sua
            implementação.
         */
        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        List<Shape> shapeList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            String color = sc.next().toUpperCase();
            //Color color = Color.valueOf(sc.next());

            if (ch == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();

                shapeList.add(new Rectangle(Color.valueOf(color), width, height));
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                shapeList.add(new Circle(Color.valueOf(color), radius));
            }

        }

        System.out.println("\nSHAPE AREAS: ");
        for (Shape shape : shapeList) {
            System.out.printf("%.2f%n", shape.area());
        }

        sc.close();
    }
}
