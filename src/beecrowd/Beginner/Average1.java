package beecrowd.Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Average1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        double A,B,MEDIA,CALC1, CALC2, VL1, VL2, SOMA ;

        A = Double.parseDouble(br.readLine());
        B = Double.parseDouble(br.readLine());

        VL1 = 3.5;
        VL2 = 7.5;
        SOMA = VL1 + VL2;

        CALC1 = A * VL1;
        CALC2 = B * VL2;

        MEDIA = (CALC1+CALC2)/SOMA;

        System.out.printf("MEDIA = %.5f\n",MEDIA);
    }
}
