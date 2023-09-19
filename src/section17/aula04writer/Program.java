package section17.aula04writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        // • Cria/recria o arquivo: new FileWriter(path)
        //• Acrescenta ao arquivo existente: new FileWriter(path, true)

        String[] lines = new String[]{
                "Good morning",
                "Good afternoon",
                "Good night"};

        String path = "C:\\ws-eclipse\\Curso_Java\\out.txt";

        try (BufferedWriter bw =
                     new BufferedWriter(
                             new FileWriter(path, true))) {

            for (String line : lines) {
                bw.write(line);
                bw.newLine();// quebra de linha
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
