package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class SimpleSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] valores = br.readLine().split(" ");
        int n = Integer.parseInt(valores[0]);
        int m = Integer.parseInt(valores[1]);
        int d = Integer.parseInt(valores[2]);

        int[] original = {n,m,d};

        Integer [] numeros = {n,m,d};
        Arrays.sort(numeros);

        for (int num : numeros) {
            System.out.println(num);
        }

        System.out.println();

        for (int num : original) {
            System.out.println(num);
        }

    }
}
