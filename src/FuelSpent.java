import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FuelSpent {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);


        int temp = Integer.parseInt(br.readLine());
        int vm = Integer.parseInt(br.readLine());

        float litros = (vm * temp)/ 12;

        System.out.printf("%.3f\n", litros );


    }
}
