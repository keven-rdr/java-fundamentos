package beecrowd.Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Quadrant {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();

        while (true){
            String[] v = br.readLine().split(" ");
            int x = Integer.parseInt(v[0]);
            int y = Integer.parseInt(v[1]);

            if (x == 0 || y == 0){
                break;
            }

            else if (x > 0 && y > 0){
                list.add("primeiro");
            }
            else if (x < 0 && y > 0){
                list.add("segundo");
            }
            else if (x < 0 && y < 0){
                list.add("terceiro");
            }
            else if (x > 0 && y < 0){
                list.add("quarto");
            }
        }
        for (String quadrant : list){
            System.out.println(quadrant);
        }
    }
}
