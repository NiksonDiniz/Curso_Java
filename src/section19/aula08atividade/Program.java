package section19.aula08atividade;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat();

    Set<LogEntry> logs = new HashSet<>();
    //String path = "C:\\temp\\in.txt";
    System.out.print("Enter file full path: ");
    String path = sc.next();

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      String line = br.readLine();
      while (line != null) {
        String[] fields = line.split(" ");
        String username = fields[0];
        Date moment = Date.from(Instant.parse(fields[1]));
        logs.add(new LogEntry(username, moment));
        line = br.readLine();
      }

      System.out.println("Total users: " + logs.size());
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }
    sc.close();

  }
}
