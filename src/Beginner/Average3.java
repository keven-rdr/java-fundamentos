package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Average3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] valores = br.readLine().split(" ");
        double A = Double.parseDouble(valores[0]);
        double B = Double.parseDouble(valores[1]);
        double C = Double.parseDouble(valores[2]);
        double D = Double.parseDouble(valores[3]);

        double peso1 = A * 2;
        double peso2 = B * 3;
        double peso3 = C * 4;
        double peso4 = D * 1;

        double media = (peso1 + peso2 + peso3 + peso4) / 10;
        //precisei colocar o Math.floor para arredondar o resultado para baixo, sem ele arredonda para 4.9, breecowd quer receber 4,8
        System.out.printf("Media: %.1f\n", Math.floor(media * 10) / 10);

        if (media >= 7){
            System.out.println("Aluno aprovado.");
        } else if (media < 5) {
            System.out.println("Aluno reprovado.");
        } else if (media >= 5 && media < 6.9) {
            System.out.println("Aluno em exame.");
            double exame = Double.parseDouble(br.readLine());
            System.out.println("Nota do exame: " + exame);
            double soma2 = (exame + media) /2;
            if (soma2 >= 5){
                System.out.println("Aluno aprovado.");
            }
            else if (soma2 <= 4.9){
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", soma2);
        }
    }
}
