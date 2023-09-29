package section19.aula09exercicioproposto;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Set<Integer> A = new TreeSet<>();
    Set<Integer> B = new TreeSet<>();
    Set<Integer> C = new TreeSet<>();

    System.out.print("How many students for course A? ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      A.add(sc.nextInt());
    }

    System.out.print("How many students for course B? ");
    n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      B.add(sc.nextInt());
    }

    System.out.print("How many students for course C? ");
    n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      C.add(sc.nextInt());
    }

    Set<Integer> total = new HashSet<>(A);
    total.addAll(B);
    total.addAll(C);

    System.out.println("Total students: " + total.size());

    sc.close();
  }
}
