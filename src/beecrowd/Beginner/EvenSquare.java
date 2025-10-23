package beecrowd.Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenSquare {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int cont = 0;
        for (int i = 1; i <= n; i++){
            if (i % 2 == 0){
                cont++;
                double result = Math.pow(i,2);
                System.out.printf(i+"^2 = %.0f\n",result);
            }
        }
    }
}
