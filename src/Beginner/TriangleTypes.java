package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class TriangleTypes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] val = br.readLine().split(" ");
        double a = Double.parseDouble(val[0]);
        double b = Double.parseDouble(val[1]);
        double c = Double.parseDouble(val[2]);

        double[] numeros = {a,b,c};
        Arrays.sort(numeros);

        //posso usar dessa forma para apresentar em ordem decrescente
        a = numeros[2];
        b = numeros[1];
        c = numeros[0];

        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (a * a == b * b + c * c) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (a * a > b * b + c * c) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (a * a < b * b + c * c) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (a == b && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (a == b || b == c || a == c) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}