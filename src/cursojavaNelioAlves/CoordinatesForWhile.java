package cursojavaNelioAlves;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoordinatesForWhile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] val = br.readLine().split(" ");
        int x = Integer.parseInt(val[0]);
        int y = Integer.parseInt(val[1]);

        while ( x != 0 && y != 0){
            if  (x > 0 && y > 0){
                System.out.println("primeiro");
            }
            else if (x < 0 && y > 0){
                System.out.println("segundo");
            }
            else if (x < 0 && y < 0){
                System.out.println("terceiro");
            }
            else if (x > 0 && y < 0){
                System.out.println("quarto");
            }
            String[] val1 = br.readLine().split(" ");
            x = Integer.parseInt(val1[0]);
            y = Integer.parseInt(val1[1]);
        }
    }
}
