package Beginner;

import java.io.IOException;

public class SequenceIJ1 {
    public static void main (String[] args) throws IOException {
        int i = 1;
        int j = 60;

        while (j >= 0) {
            System.out.println("I==" + i + " J==" + j);
            i +=3;
            j -= 5;
        }
    }
}
