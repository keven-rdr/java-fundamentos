package beecrowd.Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FuelSpent {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);


        double temp = Double.parseDouble(br.readLine());
        double vm = Double.parseDouble(br.readLine());

        double litros = (vm * temp)/ 12;

        System.out.printf("%.3f\n", litros );
    }
}
