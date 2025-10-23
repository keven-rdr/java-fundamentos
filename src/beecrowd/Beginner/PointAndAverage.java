package beecrowd.Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PointAndAverage {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Number> lista = new ArrayList<>();

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

        int count = 0;
        for (Number numero : lista){
            if (numero.doubleValue() > 0){
               count++;
            }
        }

        double calc = 0;
        for (Number numero : lista){
            if (numero.doubleValue() > 0){
                calc += numero.doubleValue()/ count;
            }
        }

        System.out.println(count+ " valores positivos");
        System.out.printf("%.1f\n", calc);
    }
}
