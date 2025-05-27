import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Banknotes {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int N = Integer.parseInt(br.readLine());

            System.out.println(N);
            int A = (N / 100) * 100;

            int RESA = A / 100;
            System.out.println(RESA+" nota(s) de R$ 100,00");

            int RESB = (N % 100) / 50;
            System.out.println(RESB+" nota(s) de R$ 50,00");

            int RESC = ((N % 100) % 50) / 20;
            System.out.println(RESC+" nota(s) de R$ 20,00");

            int RESD = (((N % 100) % 50) % 20) / 10;
            System.out.println(RESD+" nota(s) de R$ 10,00");

            int RESE = ((((N % 100) % 50) % 20) % 10) / 5;
            System.out.println(RESE+" nota(s) de R$ 5,00");

            int RESF = (((((N % 100) % 50) % 20) % 10) % 5) / 2 ;
            System.out.println(RESF+" nota(s) de R$ 2,00");

            int RESG = ((((((N % 100) % 50) % 20) % 10) % 5) % 2) / 1;
            System.out.println(RESG+" nota(s) de R$ 1,00");
    }
}
