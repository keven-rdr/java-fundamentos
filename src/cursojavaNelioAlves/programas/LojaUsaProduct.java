package cursojavaNelioAlves.programas;

import cursojavaNelioAlves.entities.  Product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LojaUsaProduct {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = String.valueOf(br.readLine());
        System.out.print("Price: ");
        double price = Double.parseDouble(br.readLine());


        //objeto iniciado, agora exigindo os parametros
        Product product = new Product(name, price);

        System.out.println("Product data: "+product);

        System.out.print("Enter the number of products to be added in stock: ");
        product.addProducts(Integer.parseInt(br.readLine()));
        System.out.println("Updated data: "+product);

        System.out.print("Enter the number of products to be removed from stock: ");
        product.removeProducts(Integer.parseInt(br.readLine()));
        System.out.println("Updated data: "+product);
    }
}
