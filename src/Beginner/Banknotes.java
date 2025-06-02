package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Banknotes {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int N = Integer.parseInt(br.readLine());

       System.out.println(N);

       int[] notes = {100, 50, 20, 10, 5, 2, 1};

       //para cada elemento de note dentro da Lista notes executa o comando abaixo
       for (int note : notes){
           int count = N / note;
           System.out.println(count + " nota(s) de R$ " + note + ",00");
           N %= note;
       }
    }
}
