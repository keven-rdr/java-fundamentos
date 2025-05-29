package cursojava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaTrapezio {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double b = Double.parseDouble(br.readLine());
        double B = Double.parseDouble(br.readLine());
        double h = Double.parseDouble(br.readLine());

        double area = ((b+B)/2.0)*h;
        System.out.println(area);
    }
}
