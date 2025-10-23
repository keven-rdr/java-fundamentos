package beecrowd.Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoordinatesOfaPoint {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] valores = br.readLine().split(" ");
        double x = Double.parseDouble(valores[0]);
        double y = Double.parseDouble(valores[1]);

        if (x > 0 && y > 0){
            System.out.println("Q1");
        }
        else if (x < 0 && y > 0){
            System.out.println("Q2");
        }
        else if (x < 0 && y < 0 ){
            System.out.println("Q3");
        }
        else if ( x > 0 && y < 0 ){
            System.out.println("Q4");
        }
        else if (x == 0 && y == 0 ){
            System.out.println("Origem");
        }
        else if (x == 0 ){
            System.out.println("Eixo Y");
        }
        else if (y == 0 ){
            System.out.println("Eixo X");
        }


    }
}
