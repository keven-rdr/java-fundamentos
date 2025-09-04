package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Taxes {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double calc,calc2, calc3, soma;
        double salary = Double.parseDouble(br.readLine());

        if ( salary >= 0 && salary <= 2000 ) {
            System.out.println("Isento");
        }
        else if (salary > 2000 && salary <= 3000){
            calc = (salary - 2000) * 0.08;
            System.out.printf("R$ %.2f\n", calc);

        } else if (salary > 3000 && salary <= 4500) {
            calc = 1000 * 0.08;
            calc2 = (salary - 3000) * 0.18;
            soma = calc + calc2;
            System.out.printf("R$ %.2f\n", soma);
        } else if (salary > 4500) {
            calc = 1000 * 0.08;
            calc2 = 1500 * 0.18;
            calc3 = (salary - 4500) * 0.28;
            soma = calc + calc2 + calc3;
            System.out.printf("R$ %.2f\n", soma);
        } else {
            System.out.println("Valor inserido invalido");
        }
    }
}
