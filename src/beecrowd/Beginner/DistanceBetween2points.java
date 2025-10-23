package beecrowd.Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DistanceBetween2points {
   public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    String [] p1 = br.readLine().split(" ");
    double x1 = Double.parseDouble(p1[0]);
    double y1 = Double.parseDouble(p1[1]);

    String[] p2 = br.readLine().split(" ");
    double x2 = Double.parseDouble(p2[0]);
    double y2 = Double.parseDouble(p2[1]);

    //sqrt = raiz quadrada || pow = elevado a potencia 2 nesse caso
    double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));

    System.out.printf("%.4f\n", distance );

   }
}
