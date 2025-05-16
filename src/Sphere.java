import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sphere {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int R = Integer.parseInt(br.readLine());
        double π = 3.14159;
        double VOLUME;

        VOLUME = (4.0/3) * π * Math.pow(R, 3);

        System.out.printf("VOLUME = %.3f\n",VOLUME);
    }
}
