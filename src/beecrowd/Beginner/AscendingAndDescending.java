package beecrowd.Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AscendingAndDescending {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();

        while (true){
            String[] line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);

            if (a == b){
                break;
            }

            if (a > b){
                String decres = "Decrescente";
                list.add(decres);
            }
            else{
                String cresc = "Crescente";
                list.add(cresc);
            }
        }
        for (String x : list){
            System.out.println(x);
        }
    }
}
