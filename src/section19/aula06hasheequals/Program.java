package section19.aula06hasheequals;

public class Program {
   public static void main(String[] args) {
      /*
      hashCode e equals
      • São operações da classe Object utilizadas para comparar se um objeto é igual a outro
      • equals: lento, resposta 100%
      • hashCode: rápido, porém resposta positiva não é 100%
      • Tipos comuns (String, Date, Integer, Double, etc.) já possuem implementação para essas
         operações. Classes personalizadas precisam sobrepô-las.
       */

      String a = "Maria";
      String b = "Alex";

      System.out.println(a.equals(b)); // retorna true ou false
      System.out.println(b.equals(a)); // false

      System.out.println(a.hashCode()); //retorna um número inteiro
      System.out.println(b.hashCode()); // 2043454

      System.out.println("------------------------------------------");
      Client c1 = new Client("Maria", "maria@gmail.com");
      Client c2 = new Client("Maria", "maria@gmail.com");

      System.out.println(c1.hashCode());
      System.out.println(c2.hashCode());
      System.out.println(c1.equals(c2)); // true
      System.out.println(c1 == c2); // false pq compara a referencia de memoria (posições de memória diferente)

   }
}
