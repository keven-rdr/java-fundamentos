package cursojavaNelioAlves.programas;

import cursojavaNelioAlves.entities.ClientPensionato;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pensionato {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("How many rooms will be rented?: ");
        int n = Integer.parseInt(br.readLine());
        ClientPensionato[] vect = new ClientPensionato[10];

            for (int i = 1; i <= n; i++){
                System.out.println();
                System.out.println("Rent #"+i);
                System.out.print("Name: ");
                String name = String.valueOf(br.readLine());
                System.out.print("Email: ");
                String email = String.valueOf(br.readLine());
                System.out.print("Room: ");
                int roomNumber = Integer.parseInt(br.readLine());

                //receber o numero do quarto e inserir dentro do meu vetor
                vect[roomNumber] = new ClientPensionato(name, email);
            }
           System.out.println("\nBusy rooms :");
           for (int i = 1; i < 10; i++){
               if (vect[i] != null) {
                   System.out.println(i + " : "+vect[i]);
               }
           }
        }
}
