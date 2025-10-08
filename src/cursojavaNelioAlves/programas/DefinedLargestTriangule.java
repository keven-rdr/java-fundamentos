package cursojavaNelioAlves.programas;

import cursojavaNelioAlves.entities.Triangle;

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

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f\n", areaX);
        System.out.printf("Triangle Y area: %.4f\n",areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }
    }
}
