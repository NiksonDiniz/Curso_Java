package section19.aula10map;

import java.util.Map;
import java.util.TreeMap;

public class Program {
  public static void main(String[] args) {
    /*
    Alguns métodos importantes
    • put(key, value), remove(key), containsKey(key), get(key)
    • Baseado em equals e hashCode
    • Se equals e hashCode não existir, é usada comparação de ponteiros
    • clear()
    • size()
    • keySet() - retorna um Set<K>
    • values() - retornaa um Collection<V>
     */

    Map<String, String> cookies = new TreeMap<>();
    cookies.put("username", "maria");
    cookies.put("email", "maria@gmail.com");
    cookies.put("phone", "99771122");
    cookies.remove("email");
    cookies.put("phone", "99771133");
    System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
    System.out.println("Phone number: " + cookies.get("phone"));
    System.out.println("Email: " + cookies.get("email"));
    System.out.println("Size: " + cookies.size());

    System.out.println("ALL COOKIES:");
    for (String key : cookies.keySet()) {
      System.out.println(key + ": " + cookies.get(key));
    }
  }
}
