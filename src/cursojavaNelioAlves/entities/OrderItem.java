package cursojavaNelioAlves.entities;


public class OrderItem {
    private Integer quantity;
    private Double price;
    private ProductOrder product;

    public OrderItem(){
    }

    public OrderItem(Integer quantity, Double price, ProductOrder product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public ProductOrder getProduct() {
        return product;
    }

   public Double subTotal(){
        return quantity * price;
   }

   @Override
   public String toString(){
        return getProduct().getName()
                +", $"
                +String.format("%.2f", price)
                +", Quantity: "
                +quantity
                +", Subtotal: $"
                +String.format("%.2f", subTotal());
   }
}
