package beecrowd.Beginner;

import java.io.IOException;

public class EvenNumbers {
    public static void main (String[] args) throws IOException {

        for (int i = 1; i < 101 ; i++ ){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
