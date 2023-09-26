package section19.aula02gendelimitados.service;

import java.util.List;

public class CalculationService {

   // vai trabalhar com T desde que seja qualquer tipo T
   public static <T extends Comparable<T>> T max(List<T> list) {
      if (list.isEmpty()) {
         throw new IllegalStateException("List can't be empty");
      }
      T max = list.get(0);
      for (T item : list) {
         if (item.compareTo(max) > 0) {
            max = item;
         }
      }
      return max;
   }
}
