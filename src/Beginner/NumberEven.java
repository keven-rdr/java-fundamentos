package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class NumberEven {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Number> list = new ArrayList<>();

        double a = Double.parseDouble(br.readLine());
        list.add(a);
        double b = Double.parseDouble(br.readLine());
        list.add(b);
        double c = Double.parseDouble(br.readLine());
        list.add(c);
        double d = Double.parseDouble(br.readLine());
        list.add(d);
        double e = Double.parseDouble(br.readLine());
        list.add(e);

        int cont = 0;
        for (Number numero : list){
            if (numero.doubleValue() % 2 == 0){
                cont++;
    }}
        System.out.println(cont + " valores pares");
}
}
