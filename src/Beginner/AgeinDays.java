package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AgeinDays {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int dias = Integer.parseInt(br.readLine());

       //removendo os anos
       int anos = dias / 365;
       System.out.println(anos+" ano(s)");

       //quantos meses inteiros depois de remover os anos
       int meses = (dias % 365) / 30;
       System.out.println(meses+" mes(es)");

       //quantos dias inteiros depois de remover os anos e meses
       int diasRestantes = (dias % 365) % 30;
       System.out.println(diasRestantes+" dia(s)");
    }
}
