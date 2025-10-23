package beecrowd.Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameTimeWithMinutes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] values = br.readLine().split(" ");
        int Ah = Integer.parseInt(values[0]);
        int Bm = Integer.parseInt(values[1]);
        int Ch = Integer.parseInt(values[2]);
        int Dm = Integer.parseInt(values[3]);

        int inicio = Ah * 60 + Bm;
        int fim = Ch * 60 + Dm;

        int duracao = fim - inicio;
        if (duracao <= 0){
            duracao += 24 * 60;
        }

        int horas = duracao / 60;
        int minutos = duracao % 60;


        System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");


    }
}
