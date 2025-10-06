package cursojavaNelioAlves;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Telefone {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        double valor1 = 50.00;

        if ( n >= 0 && n <= 100){
            System.out.printf("Valor a pagar: R$ %.2f\n", valor1);
        }
        else if(n > 100){
            int resul = Math.abs(n - 100);
            double soma2 = resul * 2.00;
            double soma = valor1 + soma2 ;
            System.out.println("Valor a pagar: R$"+ soma);
        }else if(n < 0){
            System.out.println("Valor inválido");
        }
    }
}
