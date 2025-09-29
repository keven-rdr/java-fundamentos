package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HighestAndPosition {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        int n = 100;
        for (int i = 0; i < n; i++){
            int x = Integer.parseInt(br.readLine());
            list.add(x);
        }
        Integer max = list.stream().max(Comparator.naturalOrder()).orElse(null);
        System.out.println(max);
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).equals(max)){
                System.out.println(i+1);
                break;
            }
        }
}
}
