package cursojavaNelioAlves.programas;

import cursojavaNelioAlves.entities.Customer;
import cursojavaNelioAlves.entities.Enum.OrderStatus2;
import cursojavaNelioAlves.entities.OrderItem;
import cursojavaNelioAlves.entities.OrderPedido;
import cursojavaNelioAlves.entities.ProductOrder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class CaixaLoja {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String name = br.readLine();
        System.out.print("Email: ");
        String email = br.readLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        LocalDate birthDate = LocalDate.parse(br.readLine(), fmt);

        Customer customer = new Customer (name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus2 orderStatus = OrderStatus2.valueOf(br.readLine());
        OrderPedido order = new OrderPedido(new Date(), orderStatus, customer);

        System.out.print("How many items to this order?: ");
        int m = Integer.parseInt(br.readLine());

            for (int j = 0; j < m; j++){
                System.out.println("Enter #"+(j+1)+" item data:");
                System.out.print("Product name: ");
                String productName = br.readLine();
                System.out.print("Product price: ");
                double price = Double.parseDouble(br.readLine());
                System.out.print("Quantity: ");
                int quantity = Integer.parseInt(br.readLine());

                ProductOrder product = new ProductOrder(productName, price);
                OrderItem it = new OrderItem(quantity, price, product);
                order.addItem(it);
            }
            System.out.println("\n"+order);
    }
}
