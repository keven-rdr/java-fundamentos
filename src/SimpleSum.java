import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleSum {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        int  A,B,SOMA ;

        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());

        SOMA = A + B;

        System.out.println("SOMA = "+SOMA);

    }
}
