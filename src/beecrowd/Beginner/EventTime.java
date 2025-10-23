package beecrowd.Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EventTime {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int w = Integer.parseInt(br.readLine().replaceAll("[^0-9]", ""));
        String [] valores = br.readLine().split(" : ");
        int x = Integer.parseInt(valores[0]);
        int y = Integer.parseInt(valores[1]);
        int z = Integer.parseInt(valores[2]);

        int w2 = Integer.parseInt(br.readLine().replaceAll("[^0-9]", ""));
        String [] valores2 = br.readLine().split(" : ");
        int x2 = Integer.parseInt(valores2[0]);
        int y2 = Integer.parseInt(valores2[1]);
        int z2 = Integer.parseInt(valores2[2]);

        int inicioSegundos = w * 24 * 60 * 60 + x * 60 * 60 + y * 60 + z;
        int fimSegundos = w2 * 24 * 60 * 60 + x2 * 60 * 60 + y2 * 60 + z2;

        int duracao = fimSegundos - inicioSegundos;

        int dias = duracao / (24 * 60 * 60);
        duracao = duracao % (24 * 60 * 60);
        int horas = duracao / (60 * 60);
        //pega o que sobrou que não completa uma hora para depois calcular o minutos e segundos
        duracao = duracao % (60 * 60);
        int minutos = duracao / 60;
        int segundos = duracao % 60;

        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos+ " minuto(s)");
        System.out.println(segundos + " segundo(s)");
    }
}
