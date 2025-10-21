package cursojavaNelioAlves.entities;

import cursojavaNelioAlves.entities.Enum.OrderStatus2;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderPedido {
    private Date moment;
    private OrderStatus2 status;
    private Customer customer;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    List<OrderItem> orderItems = new ArrayList<>();

    public OrderPedido(){
    }

    public OrderPedido(Date moment, OrderStatus2 status, Customer customer) {
        this.moment = moment;
        this.status = status;
        this.customer = customer;
    }

    public Date getMoment() {
        return moment;
    }

    public OrderStatus2 getStatus() {
        return status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void addItem(OrderItem item) {
        orderItems.add(item);
    }

    public void removeItem(OrderItem item) {
        orderItems.remove(item);
    }

    public Double total() {
        double sum = 0.0;
        for (OrderItem x : orderItems) {
            sum += x.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(customer + "\n");
        sb.append("Order items:\n");
        for (OrderItem item : orderItems) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
