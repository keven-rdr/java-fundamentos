package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class WeightedAverages {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Double> list = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++){
            String[] valor = String.valueOf(br.readLine()).split(" ");
            double a = Double.parseDouble(valor[0]);
            double b = Double.parseDouble(valor[1]);
            double c = Double.parseDouble(valor[2]);

            double media = ((a * 2) + (b * 3) + (c * 5))/10;
            list.add(media);
        }
        for (int i = 0; i < n; i++){
            System.out.printf("%.1f%n",list.get(i));
        }
    }
}
