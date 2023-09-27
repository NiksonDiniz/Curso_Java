package section19.aula03tiposcuringa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
  public static void main(String[] args) {
    //Generics são invariantes
    //List<Object> não é o supertipo de qualquer tipo de lista:
    List<Object> myObjs = new ArrayList<Object>();
    List<Integer> myNumbers = new ArrayList<Integer>();
    //myObjs = myNumbers; // erro de compilação

    //O supertipo de qualquer tipo de lista é List<?>. Este é um tipo curinga:
    List<?> myObjs1 = new ArrayList<Object>();
    List<Integer> myNumbers1 = new ArrayList<Integer>();
    myObjs1 = myNumbers1;

    //Com tipos curinga podemos fazer métodos
    //que recebem um genérico de "qualquer tipo":
    List<Integer> myInts = Arrays.asList(5, 2, 10);
    printList(myInts);

    List<String> myStrs = Arrays.asList("Maria", "Pedro", "jão");
    printList(myStrs);

    //Porém não é possível adicionar dados a uma
    //coleção de tipo curinga
    //list.add(3); // erro de compilação
  }

  public static void printList(List<?> list) {
    for (Object obj : list) {
      System.out.println(obj);
    }
  }
}
