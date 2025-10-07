package cursojavaNelioAlves.programas;

import cursojavaNelioAlves.entities.AlturaPessoa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculadoraDeAltura {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Quantas pessoas serão calculadas? ");
        int n = Integer.parseInt(br.readLine());
        AlturaPessoa[] vect = new AlturaPessoa[n];


        double cont = 0;
        double sum = 0;
        double porc = 0;
        for (int i = 0; i < n; i++){
            System.out.println("Dados da " +(i+1)+"º pessoa:");

            System.out.print("Nome: ");
            String name = String.valueOf(br.readLine());
            System.out.print("Idade: ");
            int age = Integer.parseInt(br.readLine());
            System.out.print("Altura: ");
            double height = Double.parseDouble(br.readLine());

            vect[i] = new AlturaPessoa(name, age, height);
            sum += vect[i].getHeight();
            if (vect[i].getAge() < 16){
                cont++;
            }
            porc = (cont*100)/vect.length;
        }
        double avg = sum / n;
        System.out.printf("\nAltura média: %.2f%n", avg);

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n",porc);

        for (int i = 0; i < n; i++){
            if (vect[i].getAge() < 16){
                System.out.println(vect[i].getName());
            }
        }
    }
}
