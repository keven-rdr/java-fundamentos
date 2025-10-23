package beecrowd.Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class EvenOddPositiveAndNegative {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Number> list = new ArrayList<>();

        int a = Integer.parseInt(br.readLine());
        list.add(a);
        int b = Integer.parseInt(br.readLine());
        list.add(b);
        int c = Integer.parseInt(br.readLine());
        list.add(c);
        int d = Integer.parseInt(br.readLine());
        list.add(d);
        int e = Integer.parseInt(br.readLine());
        list.add(e);

        int cont = 0;
        int cont2= 0;
        int cont3= 0;
        int cont4 = 0;
        for (Number number : list){
            if (number.intValue() % 2 == 0){
                cont++;
            }
            else if (Math.abs(number.intValue()) % 2 == 1){
                cont2++;
            }
            if(number.intValue() > 0){
                cont3++;
            }
            else if(number.intValue() < 0){
                cont4++;
            }
        }
        System.out.println(cont + " valor(es) par(es)");
        System.out.println(cont2 + " valor(es) impar(es)");
        System.out.println(cont3 + " valor(es) positivo(s)");
        System.out.println(cont4 + " valor(es) negativo(s)");
    }
}
