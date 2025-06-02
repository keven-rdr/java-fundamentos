package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Consumption {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        double CONSUMPTION;
        //distancia percorrida total
        int X = Integer.parseInt(br.readLine());
        //total de gasto de combustivel
        double Y = Double.parseDouble(br.readLine());

        CONSUMPTION = X/Y;

        System.out.printf("%.3f km/l\n",CONSUMPTION);
    }
}
