package Beginner;

import java.io.IOException;

public class SequencelJ3 {
    public static void main (String[] args) throws IOException{
        for (int i = 1; i<= 9; i+=2){
            for (int j = i + 6; j >= i + 4; j--){
                System.out.println("I=" + i + " J=" + j);
            }
        }
    }
}
