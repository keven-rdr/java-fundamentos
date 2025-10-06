package cursojavaNelioAlves;


import entities.Product2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LojaUsaProduct2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = String.valueOf(br.readLine());
        System.out.print("Price: ");
        double price = Double.parseDouble(br.readLine());

        Product2 product = new Product2(name, price);

        //exemplo para alterar o nome, usando o set e trazer com o get para apresentar
        product.setName("Computer");
        System.out.println("Updated name: " + product.getName());
        //alterando o preço
        product.setPrice(1200.00);
        System.out.println("Update price: "+ product.getPrice());
        //so pode alterar quando ouver entrada e saida, so vamos fazer a apresentação
        System.out.println(product.getQuantity() + " units");

        System.out.println("Product data: "+product);

        System.out.print("Enter the number of products to be added in stock: ");
        product.addProducts(Integer.parseInt(br.readLine()));
        System.out.println("Updated data: "+product);

        System.out.print("Enter the number of products to be removed from stock: ");
        product.removeProducts(Integer.parseInt(br.readLine()));
        System.out.println("Updated data: "+product);
    }
}
