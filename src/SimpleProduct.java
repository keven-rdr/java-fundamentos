import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleProduct {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int A,B, PROD;

        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());

        PROD = (A * B);

        System.out.println("PROD = "+PROD);
    }
}
