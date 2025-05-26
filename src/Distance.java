import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Distance {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int xv = Integer.parseInt(br.readLine());
        int distance = xv * 2;

        System.out.println(distance+" minutos");
    }
}
