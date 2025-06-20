package cursojava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CondicionalTernaria {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double preco = Double.parseDouble(br.readLine());

        double desconto = ( preco < 20.0) ? preco * 0.1 : preco * 0.5;
        System.out.printf("Desconto: R$ %.2f\n", desconto);
    }
}
