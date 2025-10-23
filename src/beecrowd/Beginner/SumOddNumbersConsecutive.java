package beecrowd.Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class SumOddNumbersConsecutive {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            int somaDosImpares = 0;
            String[] v = br.readLine().split(" ");
            int a = Integer.parseInt(v[0]);
            int b = Integer.parseInt(v[1]);

            int min = Math.min(a, b);
            int max = Math.max(a, b);

            for (int x = min + 1; x < max; x++) {
                if (x % 2 != 0) {
                    somaDosImpares += x;
                }
            }
            list.add(String.valueOf(somaDosImpares));
        }
        for (String valor : list) {
            System.out.println(valor);
        }
    }
}
