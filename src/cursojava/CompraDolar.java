package cursojava;

import entities.CurrencyConverter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompraDolar {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        CurrencyConverter currencyConverter = new CurrencyConverter();

        System.out.print("What is the dollar price? ");
        currencyConverter.dollar = Double.parseDouble(br.readLine());
        System.out.print("How many dollars will be bought? ");
        currencyConverter.buy = Double.parseDouble(br.readLine());

        System.out.println("Amount to be paid in reais = "+ String.format("%.2f" , currencyConverter.resultBought()));
    }
}
