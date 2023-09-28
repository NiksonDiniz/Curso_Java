package section19.aula07set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
   public static void main(String[] args) {
      /*
       Principais implementações:
      • HashSet - mais rápido (operações O(1) em tabela hash) e não ordenado
      • TreeSet - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo compareTo do objeto (ou Comparator)
      • LinkedHashSet - velocidade intermediária e elementos na ordem em que são adicionados
      Alguns métodos importantes
      • add(obj), remove(obj), contains(obj) • Baseado em equals e hashCode
      • Se equals e hashCode não existir, é usada comparação de ponteiros
      • clear()
      • size()
      • removeIf(predicate)
      • addAll(other) - união: adiciona no conjunto os elementos do outro conjunto, sem repetição
      • retainAll(other) - interseção: remove do conjunto os elementos não contitos em other
      • removeAll(other) - diferença: remove do conjunto os elementos contidos em other
       */

      Set<String> set = new HashSet<>();
      set.add("TV");
      set.add("Tablet");
      set.add("Notebook");
      set.add("PC");

      set.remove("Tablet");
      set.removeIf(x -> x.length() <= 2);
      set.removeIf(x -> x.charAt(0) == 'N');

      for (String p : set) {
         System.out.println(p);
      }
   }
}
