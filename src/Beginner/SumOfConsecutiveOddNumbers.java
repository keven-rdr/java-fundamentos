package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfConsecutiveOddNumbers {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        int min = Math.min(x, y);
        int max = Math.max(x, y);

        int somaDosImpares = 0;
        for (int i= min + 1 ; i < max; i++ ){
            if ( i % 2 != 0){
                somaDosImpares += i;
            }
        }
        System.out.println(somaDosImpares);
    }
}
