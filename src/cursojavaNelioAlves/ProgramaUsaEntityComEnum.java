package cursojavaNelioAlves;

import entities.Enum.OrderStatus;
import entities.Order;

import java.io.IOException;
import java.util.Date;

public class ProgramaUsaEntityComEnum {
    public static void main (String[] args) throws IOException{
        Order order = new Order(1090, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os1+"\n"+os2);
    }
}
