import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BhaskaraFormula {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] valores = br.readLine().split(" ");
        double A = Double.parseDouble(valores[0]);
        double B = Double.parseDouble(valores[1]);
        double C = Double.parseDouble(valores[2]);

        double delta = Math.pow(B,2) - (4*A*C);

        if (delta > 0 && A != 0){
            double x1 = (-B + Math.sqrt(delta))/(2*A);
            double x2 = (-B - Math.sqrt(delta))/(2*A);

            System.out.printf("R1 = %.5f\n", x1);
            System.out.printf("R2 = %.5f\n", x2);
        }else{
            System.out.println("Impossivel calcular");
        }


    }
}
