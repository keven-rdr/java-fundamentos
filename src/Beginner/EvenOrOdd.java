package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOrOdd {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] vect = new int[n];

        if (n < 10000){
            for (int i = 0; i < n; i++){
                int x = Integer.parseInt(br.readLine());
                if (Math.pow(-10,7) < x || x < Math.pow(10,7)){
                    vect[i] = x;
                }
            }

            for (int i = 0; i < n; i++){
                if (vect[i] % 2 == 0 && vect[i] > 0){
                    System.out.println("EVEN POSITIVE");
                }
                else if (vect[i] % 2 == 0 && vect[i] < 0){
                    System.out.println("EVEN NEGATIVE");
                }
                else if (vect[i] % 2 != 0  && vect[i] > 0) {
                    System.out.println("ODD POSITIVE");
                }
                else if (vect[i] % 2 != 0 && vect[i] < 0) {
                    System.out.println("ODD NEGATIVE");
                }
                else if (vect[i] == 0) {
                    System.out.println("NULL");
                }
            }
        }
    }
}
