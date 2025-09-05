package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class Month {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());

        Map<Integer, String> month = Map.ofEntries(
                        Map.entry(1, "January"),
                        Map.entry(2, "February"),
                        Map.entry(3, "March"),
                        Map.entry(4, "April"),
                        Map.entry(5, "May"),
                        Map.entry(6, "June"),
                        Map.entry(7, "July"),
                        Map.entry(8, "August"),
                        Map.entry(9, "September"),
                        Map.entry(10, "October"),
                        Map.entry(11, "November"),
                        Map.entry(12, "December")
        );
        System.out.println(month.getOrDefault(number, "Month invalid"));
    }
}
