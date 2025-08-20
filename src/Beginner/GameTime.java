package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameTime {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int BEGIN, FINAL, DIA;

        String[] values = br.readLine().split(" ");
        int A = Integer.parseInt(values[0]);
        int B = Integer.parseInt(values[1]);

        int duration;

        if (A < B) {
            duration = B - A;
        } else if (A > B) {
            duration = (24 - A) + B;
        } else {
            duration = 24;
        }

        System.out.println("O JOGO DUROU " + duration + " HORA(S)");
    }
}
