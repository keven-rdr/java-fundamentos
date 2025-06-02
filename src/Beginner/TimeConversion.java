package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        //N representa os segundos
        int N = Integer.parseInt(br.readLine());

        int H = N / 3600;
        int M = (N % 3600) / 60;
        int S = (N % 3600) % 60;

        System.out.println(H + ":" + M + ":" + S);
    }
}
