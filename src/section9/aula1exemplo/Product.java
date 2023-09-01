package section9.aula1exemplo;

public class Product {
    private String name;
    private Double price;
    private Integer quantity;

    public Product() {
    }

    public Product(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double totalValueStock() {
        return getPrice() * getQuantity();
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return "Product data: "
                + getName() + ", $ "
                + String.format("%.2f", getPrice())
                + ", " + getQuantity() + " units, Total: $ "
                + String.format("%.2f", totalValueStock());
    }
}
