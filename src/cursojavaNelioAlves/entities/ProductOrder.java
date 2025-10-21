package cursojavaNelioAlves.entities;

public class ProductOrder {
    private String name;
    private Double price;

    public ProductOrder(){
    }

    public ProductOrder(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
