package cursojava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForCont {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int soma = 0;
        //(define o inicia); condicao; e o (incremeto)
            for (int i = 0; i < n; i++){
                int x = Integer.parseInt(br.readLine());
                soma += x;
            }

        System.out.println(soma);
    }
}
