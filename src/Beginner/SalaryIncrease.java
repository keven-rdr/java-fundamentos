package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SalaryIncrease {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double calculo, reajuste;
        double salario = Double.parseDouble(br.readLine());

        if (salario >= 0 && salario <= 400.00) {
            calculo = salario * 1.15;
            reajuste = calculo - salario;
            System.out.printf("Novo salario: %.2f\n", calculo);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 15%");
        }
        else if (salario <= 800.00) {
            calculo = salario * 1.12;
            reajuste = calculo - salario;
            System.out.printf("Novo salario: %.2f\n", calculo);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 12%");
        }
        else if (salario <= 1200.00) {
            calculo = salario * 1.10;
            reajuste = calculo - salario;
            System.out.printf("Novo salario: %.2f\n", calculo);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 10%");
        }
        else if (salario <= 2000.00) {
            calculo = salario * 1.07;
            reajuste = calculo - salario;
            System.out.printf("Novo salario: %.2f\n", calculo);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 7%");
        }
        else {
            calculo = salario * 1.04;
            reajuste = calculo - salario;
            System.out.printf("Novo salario: %.2f\n", calculo);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 4%");
        }

    }
}
