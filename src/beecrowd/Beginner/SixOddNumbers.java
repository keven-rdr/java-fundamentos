package beecrowd.Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SixOddNumbers {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int limite = 100;

        int cont = 0;
        for (int i = 0; i < limite ; i++){
            if ( i >= a && i % 2 == 1){
                System.out.println(i);
                cont++;
            }
            if (cont == 6 ){
                break;
            }
        }
    }
}
