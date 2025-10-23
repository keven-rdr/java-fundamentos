package beecrowd.Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Average2 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        double A, B, C, MEDIA, PESOA, PESOB, PESOC, SOMA, CALC1, CALC2, CALC3;

        A = Double.parseDouble(br.readLine());
        B = Double.parseDouble(br.readLine());
        C = Double.parseDouble(br.readLine());

        PESOA = 2;
        PESOB = 3;
        PESOC = 5;
        SOMA = PESOA + PESOB + PESOC;

        CALC1 = PESOA * A;
        CALC2 = PESOB * B;
        CALC3 = PESOC * C;

        MEDIA = (CALC1+CALC2+CALC3)/SOMA;

        System.out.printf("MEDIA = %.1f\n", MEDIA);
    }
}
