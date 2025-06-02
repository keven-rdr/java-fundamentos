package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class The_Greatest {
   public static void main(String[] args) throws IOException {
       InputStreamReader isr = new InputStreamReader(System.in);
       BufferedReader br = new BufferedReader(isr);

       int A, B, C, MAIORAB, MAIOR;

       String[] valor = br.readLine().split(" ");
       A = Integer.parseInt(valor[0]);
       B = Integer.parseInt(valor[1]);
       C = Integer.parseInt(valor[2]);
        //abs significa que é o valor absoluto de x, ele mantem se for positivo e se for negatio mudar para positivo
       //no final sempre vai ficar positio o valor de x

       //1. primeiro verifiquei quem e o maio entre A = 7 e B = 14
       MAIORAB = (A+B+Math.abs(A-B))/2;
       //2. segundo verifiquei quem e o maior da verificação = 14 anterior com o C = 106
       MAIOR = (MAIORAB+C+Math.abs(MAIORAB-C))/2;

       System.out.println(MAIOR+" eh o maior");
   }
}
