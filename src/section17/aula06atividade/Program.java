package section17.aula06atividade;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //String path = "C:\temp";

        List<Product> products = new ArrayList<>();

        //System.out.println("Enter file path: ");
        String srcFileStr = "C:\\temp\\input.csv";

        File sourceFile = new File(srcFileStr);
        String srcFolderStr = sourceFile.getParent();

        boolean success = new File(srcFolderStr + "\\out").mkdir();
        System.out.println("Folder created: " + success);

        String targetFileStr = srcFolderStr + "\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(srcFileStr))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");

                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                products.add(new Product(name, price, quantity));

                line = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr, true))) {
                for (Product p : products) {
                    bw.write(p.getName() + "," + String.format("%.2f", p.total()));
                    bw.newLine();// quebra de linha
                }

                System.out.println(targetFileStr + "CREATED");
            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

    }
}
