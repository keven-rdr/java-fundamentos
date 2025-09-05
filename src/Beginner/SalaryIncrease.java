package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SalaryIncrease {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double perc1 = 0.15;
        double perc2 = 0.12;
        double perc3 = 0.10;
        double perc4 = 0.07;
        double perc5 = 0.04;
        double calculo, reajuste;

        double salary = Double.parseDouble(br.readLine());

        if ( salary >= 0 && salary <= 400 ) {
            calculo = salary + ( salary * perc1);
            reajuste = Math.abs(calculo - salary);
            System.out.printf("Novo salario: %.2f\n", calculo);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual: %.0f %%%n", (perc1 * 100));
        }
        else if (salary <= 800){
            calculo = salary + ( salary * perc2);
            reajuste = Math.abs(calculo - salary);
            System.out.printf("Novo salario: %.2f\n", calculo);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual: %.0f %%%n", (perc2 * 100));
        }
        else if (salary <= 1200){
            calculo = salary + ( salary * perc3);
            reajuste = Math.abs(calculo - salary);
            System.out.printf("Novo salario: %.2f\n", calculo);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual: %.0f %%%n", (perc3 * 100));
        }
        else if (salary <= 2000){
            calculo = salary + ( salary * perc4);
            reajuste = Math.abs(calculo - salary);
            System.out.printf("Novo salario: %.2f\n", calculo);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual: %.0f %%%n", (perc4 * 100));
        }
        else {
            calculo = salary + ( salary * perc5);
            reajuste = Math.abs(calculo - salary);
            System.out.printf("Novo salario: %.2f\n", calculo);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual: %.0f %%%n", (perc5 * 100));
        }
    }
}
