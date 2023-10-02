package section20.aula02predicate;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {
  @Override
  public boolean test(Product product) {
    return product.getPrice() >= 100.0;
  }
}
