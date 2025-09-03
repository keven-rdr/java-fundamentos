package cursojava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class ConversionTemperature {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        while ( true ) {
//            System.out.print("Digite a temperatura em Celsius: ");
//            double celsius = Double.parseDouble(br.readLine());
//
//            double formula = (9 * (celsius) / 5) + 32;
//            System.out.printf("Equivalente em Fahrenheit: %.1f\n", formula);
//
//            System.out.print("Deseja repetir (s/n)? ");
//            String repost = br.readLine();
//            if (!Objects.equals(repost, "s")){
//                break;
//            }
//        }

        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = Double.parseDouble(br.readLine());

            double formula = (9 * (celsius) / 5) + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f\n", formula);

            System.out.print("Deseja repetir (s/n)? ");
            String repost = br.readLine();
            if (!Objects.equals(repost, "s")){
                break;
            }
        } while (true);

    }
}
