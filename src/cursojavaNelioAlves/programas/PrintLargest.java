package cursojavaNelioAlves.programas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PrintLargest {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter three numbers: ");
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int higher = max(a, b, c);

        showResult(higher);
    }

    public static int max(int x, int y, int z){
        int aux;
        if (x > y && x > z){
            aux = x;
        } else if (y > z) {
          aux = y;
        }
        else {
            aux = z;
        }
        return aux;
    }

    public static void showResult(int value){
        System.out.println("Higher = "+ value);
    }
}
