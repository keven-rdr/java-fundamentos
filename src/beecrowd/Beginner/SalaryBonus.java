package beecrowd.Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SalaryBonus {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        double TOTAL, COMISSAO;

        String name = br.readLine();
        double salary = Double.parseDouble(br.readLine());
        double intialValue = Double.parseDouble(br.readLine());

        COMISSAO = (intialValue * 15)/100;
        TOTAL = COMISSAO + salary;

        System.out.printf("TOTAL = R$ %.2f\n",TOTAL);


    }
}
