package Beginner;

import java.util.ArrayList;



public class Positivo {

    public static void main(String[] args) {
        Integer[] array = {1, -4, 7, 12};

        ArrayList<Integer> list = new ArrayList<Integer>();
        int soma = 0;

        for (int i = 0; i < array.length; i++) {
          if (array[i] > 0) {
              soma += array[i];
          }
        }
        System.out.println("A soma é " + soma);
    }
}
