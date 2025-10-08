package cursojavaNelioAlves.programas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class While {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        int soma = 0;
        while ( a != 0 ){
            soma += a;
            a = Integer.parseInt(br.readLine());
        }
        System.out.println(soma);
    }
}
