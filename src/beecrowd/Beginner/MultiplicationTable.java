package beecrowd.Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplicationTable {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if (n > 2  && n < 1000){
            for (int i = 1; i <= 10; i++){
                int result = i * n;
                System.out.println(i + " x " + n + " = " + result);
            }
        }
    }
}
