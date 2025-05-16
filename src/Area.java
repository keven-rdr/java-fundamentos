import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Area {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        double A,B,C, TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO;
        double π = 3.14159;

        String[] valores = br.readLine().split(" ");
        A = Float.parseFloat(valores[0]);
        B = Float.parseFloat(valores[1]);
        C = Float.parseFloat(valores[2]);

        TRIANGULO = (A*C)/2;
        CIRCULO = π * ( C * C) ;
        TRAPEZIO = (A+B)*C/2;
        QUADRADO = Math.pow(B,2);
        RETANGULO = A*B;

        System.out.printf("TRIANGULO: %.3f\n", TRIANGULO);
        System.out.printf("CIRCULO: %.3f\n", CIRCULO);
        System.out.printf("TRAPEZIO: %.3f\n", TRAPEZIO);
        System.out.printf("QUADRADO: %.3f\n", QUADRADO);
        System.out.printf("RETANGULO: %.3f\n", RETANGULO);
    }
}
