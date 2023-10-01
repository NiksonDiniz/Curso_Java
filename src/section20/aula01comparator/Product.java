package section20.aula01comparator;

//public class Product implements Comparable<Product> {
public class Product {
   // usando o comparator
   private String name;
   private Double price;

   public Product(String name, Double price) {
      this.name = name;
      this.price = price;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Double getPrice() {
      return price;
   }

   public void setPrice(Double price) {
      this.price = price;
   }

//   @Override
//   public int compareTo(Product o) {
//      return getName().toUpperCase().compareTo(o.getName().toUpperCase());
//   }

   @Override
   public String toString() {
      return "Name = " + getName() + " | Price = " + getPrice();
   }
}
