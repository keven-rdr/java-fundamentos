package beecrowd.Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Interval2 {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int nAvaliados = Integer.parseInt(br.readLine());

        if (nAvaliados < 10000){
            int cont = 0;
            int cont2 = 0;
            for (int i = 0; i < nAvaliados; i++){
                int n = Integer.parseInt(br.readLine());

                if (n >= Math.pow(-10,7) && n<= Math.pow(10,7)){
                    if (n >= 10 && n <= 20){
                        cont++;
                    }
                    else{
                        cont2++;
                    }
                }
            }
            System.out.println(cont + " in");
            System.out.println(cont2 + " out");
        }
    }
}
