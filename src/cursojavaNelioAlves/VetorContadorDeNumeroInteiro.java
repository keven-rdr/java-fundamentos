package cursojavaNelioAlves;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class VetorContadorDeNumeroInteiro {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

//        System.out.println("Quantas linhas você vai digitar?");
//        int n = Integer.parseInt(br.readLine());
//        if (n < 10){
//            int[] vect = new int[n];
//
//            for (int i = 0; i < n; i++){
//                System.out.print("Digite um numero: ");
//                vect[i] = Integer.parseInt(br.readLine());
//                if (vect[i] < 0 ){
//                   list.add(vect[i]);
//                }
//            }
//            System.out.println("NUMEROS NEGATIVOS:");
//            for (Integer integer : list) {
//                System.out.println(integer);
//            }
//        }

        System.out.println("Quantas linhas você vai digitar?");
        int n = Integer.parseInt(br.readLine());
        if (n < 10){
            int[] vect = new int[n];

            for (int i = 0; i < n; i++){
                System.out.print("Digite um numero: ");
                vect[i] = Integer.parseInt(br.readLine());
            }
            System.out.println("NUMEROS NEGATIVOS:");
            for (int i = 0; i < n; i++) {
                if (vect[i] < 0 ){
                    System.out.println(vect[i]);
                }
            }
        }
    }
}
