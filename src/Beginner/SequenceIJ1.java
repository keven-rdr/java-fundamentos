package Beginner;

import java.io.IOException;

public class SequenceIJ1 {
    public static void main (String[] args) throws IOException {
       for (int i = 1, j = 60; j >=0; i+=3, j -=5){
           System.out.println("I=" + i + " J=" + j);
       }
    }
}
