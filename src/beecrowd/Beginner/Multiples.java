package beecrowd.Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Multiples {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] val = br.readLine().split(" ");
        int a = Integer.parseInt(val[0]);
        int b = Integer.parseInt(val[1]);

        //o que resta da divisao de a com b for zero
        //o que resta da .. b com a for zero
        if (a % b == 0 || b % a == 0) {
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Nao sao Multiplos");
        }
    }
}
