package exercicio16.entities;

public class Product {
    private String name;
    private Double price;
    private Integer quantity;

    public Product(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(){
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

    public Double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return  "Nome: " +
                getName() + "\n" +
                "Preço: R$ " + String.format("%.2f", price) + "\n" +
                "Quantidade em estoque: " + getQuantity() + " unidades \n"
                + "Total: R$ " + String.format("%.2f", totalValueInStock()) + "\n" +
                "--------------------------------";
    }
}
