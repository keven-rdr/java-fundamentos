package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Salary {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int A, B;
        float C, SALARY;

        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        C = Float.parseFloat(br.readLine());

        SALARY = B * C;
        System.out.println("NUMBER = "+ A);
        System.out.printf("SALARY = U$ %.2f\n",SALARY);
    }
}
