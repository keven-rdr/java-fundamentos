package Beginner;

import java.io.IOException;

public class SequenceIJ4 {
    public static void main (String[] args) throws IOException{
        double i,j;
        for (i = 0; i <= 2.01; i += 0.2){
            for (j = 1; j <= 3; j++){
                if (i == 0 || i == 1 || i > 1.99) {
                    System.out.printf("I=%.0f J=%.0f%n", i, j + i);
                } else {
                    System.out.printf("I=%.1f J=%.1f%n", i, j + i);
                }
            }
        }
    }
}
