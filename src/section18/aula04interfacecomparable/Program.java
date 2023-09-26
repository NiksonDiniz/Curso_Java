package section18.aula04interfacecomparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String path = "C:\\temp\\input.csv";
        List<Employee> namesList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(",");
                String name = fields[0];
                double salary = Double.parseDouble(fields[1]);
                namesList.add(new Employee(name, salary));

                line = br.readLine();
            }

            Collections.sort(namesList);
            for (Employee names : namesList) {
                System.out.println(names.getName() + "," + String.format("%.2f", names.getSalary()));
            }

            System.out.println();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Method compareTo:
        //Returns:
        //a negative integer, zero, or a positive integer as this object is less than,
        // equal to, or greater than the specified object.
    }
}
