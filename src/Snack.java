import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Snack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] valores = br.readLine().split(" ");
        //codigo
        int X = Integer.parseInt(valores[0]);
        //quantidade
        int Y = Integer.parseInt(valores[1]);

        double PRICE = 4.00;

        if (X == 1){
            PRICE = 4.00;
        }
        else if (X == 2){
            PRICE = 4.50;
        }
        else if (X == 3){
            PRICE = 5.00;
        }
        else if (X == 4){
            PRICE = 2.00;
        }
        else if (X == 5){
            PRICE = 1.50;
        }
        else{
            System.out.println("Invalid Code");
        }

        double resul = PRICE * Y;

        System.out.printf("Total: R$ %.2f\n", resul);

    }
}
