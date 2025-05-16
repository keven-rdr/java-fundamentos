import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teste2 {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        int A, B, X;

        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());

        X = A + B;

        System.out.println("X = "+X);
    }
}
