package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] value = br.readLine().split(" ");
        double A = Double.parseDouble(value[0]);
        double B = Double.parseDouble(value[1]);
        double C = Double.parseDouble(value[2]);

        if ((A + B) > C && (A + C) > B && (B + C) > A) {
            double p = A + B + C;
            System.out.printf("Perimetro = %.1f\n", p);
        }
        else{
            double a = (A + B) * (C / 2);
            System.out.printf("Area = %.1f\n", a);
        }
    }
}
