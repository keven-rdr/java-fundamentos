package cursojava;

import entities.Triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DefinedLargestTriangule {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X:");
        String [] val = br.readLine().split(" ");
        x.a = Double.parseDouble(val[0]);
        x.b = Double.parseDouble(val[1]);
        x.c = Double.parseDouble(val[2]);

        System.out.println("Enter the measures of triangle Y");
        String [] val2 = br.readLine().split(" ");
        y.a = Double.parseDouble(val2[0]);
        y.b = Double.parseDouble(val2[1]);
        y.c = Double.parseDouble(val2[2]);

        double p1 = (x.a+ x.b+ x.c)/2;
        double area1 = Math.sqrt(p1*(p1-x.a)*(p1-x.b)*(p1-x.c));
        double p2 = (y.a+y.b+ y.c)/2;
        double area2 = Math.sqrt(p2*(p2-y.a)*(p2-y.b)*(p2-y.c));

        System.out.printf("Triangle X area: %.4f\n", area1);
        System.out.printf("Triangle Y area: %.4f\n",area2);

        if (area1 > area2) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }
    }
}
