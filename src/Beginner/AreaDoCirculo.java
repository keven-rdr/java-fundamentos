package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaDoCirculo {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        double A = 0;
        double π = 3.14159;
        double R = 0;

        R = Double.parseDouble(br.readLine());

        A = π * (R * R);

        System.out.printf("A=%.4f\n", A);


    }
}
