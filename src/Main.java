//tenho que receber o numeros
//tenho que verificar os numeros - caso o numero /2 = 0 conta

import java.util.ArrayList;

public class Main{

public static void main(String[] args) {

    Integer[] array = {1,2,3,4,5,6};

    ArrayList<Integer> list = new ArrayList<Integer>();
    int contador = 0;

    for (int i = 0; i < array.length; i++ ) {
        if (array[i] % 2 == 0) {
            contador++;
        }
    }
    System.out.println("Existem "+contador+" pares nessa lista");

}

}