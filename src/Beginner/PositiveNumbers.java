package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PositiveNumbers {
    public static void main (String[] args) throws IOException{
        List<Number> lista = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double a = Double.parseDouble(br.readLine());
        lista.add(a);
        double b = Double.parseDouble(br.readLine());
        lista.add(b);
        double c = Double.parseDouble(br.readLine());
        lista.add(c);
        double d = Double.parseDouble(br.readLine());
        lista.add(d);
        double e = Double.parseDouble(br.readLine());
        lista.add(e);
        double f = Double.parseDouble(br.readLine());
        lista.add(f);

        double maiorNumero = Double.MIN_VALUE;

        int count = 0;
        for (Number numero : lista){
            if (numero.doubleValue() > 0){
               count++;
            }
        }
        System.out.println(count +" valores positivos");




    }
}
