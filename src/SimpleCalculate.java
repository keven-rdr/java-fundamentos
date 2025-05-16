import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleCalculate {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        float VAL1, VAL2, SOMA;
        int QUANT1, QUANT2, COD1,COD2;

        String[] produto1 = br.readLine().split(" ");
        COD1 = Integer.parseInt(produto1[0]);
        QUANT1 = Integer.parseInt(produto1[1]);
        VAL1 = Float.parseFloat(produto1[2]);

        String[] produto2 = br.readLine().split(" ");
        COD2 = Integer.parseInt(produto2[0]);
        QUANT2 = Integer.parseInt(produto2[1]);
        VAL2 = Float.parseFloat(produto2[2]);

        SOMA = (VAL1*QUANT1) + (VAL2*QUANT2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", SOMA);
    }
}
