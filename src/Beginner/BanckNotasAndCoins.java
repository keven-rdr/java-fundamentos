package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BanckNotasAndCoins {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double input = Float.parseFloat(br.readLine());
        int N = (int) Math.round(input * 100);

        int[] notes = {10000, 5000, 2000, 1000, 500, 200};
        int[] coins = {100, 50, 25, 10, 5, 1};

        //para cada elemento de notas dentro da lista notas executa o comando abaixo
        System.out.println("NOTAS:");
        for (int note : notes){
            int count = N / note;
            System.out.printf("%d nota(s) de R$ %.2f\n", count, note / 100.0);
            N %= note;
        }

        //para cada elemento de coins dentro da lista coisn executa o comando abaixo
        System.out.println("MOEDAS:");
        for (int coin : coins){
            int count = N / coin;
            System.out.printf("%d moeda(s) de R$ %.2f\n", count, coin / 100.0);
            N %= coin;
        }
    }
}
