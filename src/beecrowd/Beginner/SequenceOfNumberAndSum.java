package beecrowd.Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SequenceOfNumberAndSum {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> resultsToPrint = new ArrayList<>();

        while (true) {
            String[] line = br.readLine().split(" ");
            int m = Integer.parseInt(line[0]);
            int n = Integer.parseInt(line[1]);

            if (m <= 0 || n <= 0) {
                break;
            }

            int smaller = Math.min(m, n);
            int bigger = Math.max(m, n);
            int sum = 0;

            StringBuilder outputLine = new StringBuilder();
            for (int i = smaller; i <= bigger; i++) {
                outputLine.append(i).append(" ");
                sum += i;
            }
            outputLine.append("Sum=").append(sum);

            resultsToPrint.add(outputLine.toString());
        }

        for (String result : resultsToPrint) {
            System.out.println(result);
        }
    }
}