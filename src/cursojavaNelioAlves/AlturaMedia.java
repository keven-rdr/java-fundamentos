package cursojavaNelioAlves;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlturaMedia {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        ArrayList<Double> list = new ArrayList<>();
//
//        double nAlturas = Double.parseDouble(br.readLine());
//
//        double cont = 0;
//        for (int i = 0; i < nAlturas; i++){
//            double altura = Double.parseDouble(br.readLine());
//            list.add(altura);
//            cont += list.get(i)/nAlturas;
//        }
//        System.out.printf("AVERAGE HEIGHT = %.2f\n", cont);

        //Correção, resolução do professor Nelio
        int n = Integer.parseInt(br.readLine());
        double[] vect = new double[n];

        double sum = 0;
        for (int i = 0; i < n; i++){
            vect[i] = Double.parseDouble(br.readLine());
            sum += vect[i];
        }
        double avg = sum/n;
        System.out.printf("AVERAGE HEIGHT = %.2f%n", avg);
    }
}
