package cursojavaNelioAlves.programas;

import cursojavaNelioAlves.entities.ProductVetor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PriceProductVector {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ProductVetor[] vect = new ProductVetor[n];

        double sum = 0;
        //vect.length e o mesmo que usar o n, para saber o tamanho do vetor
        for (int i = 0; i < vect.length; i++){
            String name = String.valueOf(br.readLine());
            double price = Double.parseDouble(br.readLine());
            vect[i] = new ProductVetor(name, price);
            sum += vect[i].getPrice();
        }
        double avg = sum / vect.length;
        System.out.println("AVERAGE PRICE = " + String.format("%.2f", avg));

    }
}
