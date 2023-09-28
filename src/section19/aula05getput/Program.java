package section19.aula05getput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
   public static void main(String[] args) {
      List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
      List<Double> myDoubles = Arrays.asList(3.14, 6.28);
      List<Object> myObjs = new ArrayList<Object>();


      copy(myInts, myObjs);
      printList(myObjs);
      copy(myDoubles, myObjs);
      printList(myObjs);
   }

   // lista de entrada, qualquer tipo que extends number (int,byte, long, short,float,double)
   // lista de saída, qualquer tipo super number (Object)
   public static void copy(List<? extends Number> source, List<? super Number> destiny) {
      destiny.addAll(source);
//      for (Number number : source) {
//         destiny.add(number);
//      }
   }

   public static void printList(List<?> list) {
      for (Object obj : list) {
         System.out.print(obj + " ");
      }
      System.out.println();
   }
}
