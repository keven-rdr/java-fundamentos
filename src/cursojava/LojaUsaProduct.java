package cursojava;

import entities.Product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LojaUsaProduct {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Product product = new Product();

        System.out.println("Enter product data:");

        System.out.print("Name: ");
        product.name = String.valueOf(br.readLine());
        System.out.print("Price: ");
        product.price = Double.parseDouble(br.readLine());
        System.out.print("Quantity in stock: ");
        product.quantity = Integer.parseInt(br.readLine());
        System.out.println(product);

        System.out.print("Enter the number of products to be added in stock: ");
        product.addProducts(Integer.parseInt(br.readLine()));
        System.out.println(product);

        System.out.print("Enter the number of products to be removed from stock:");
        product.removeProducts(Integer.parseInt(br.readLine()));
        System.out.println(product);
    }
}
