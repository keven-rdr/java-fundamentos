import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SelectionTest1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String [] valores = br.readLine().split(" ");
        int A = Integer.parseInt(valores[0]);
        int B = Integer.parseInt(valores[1]);
        int C = Integer.parseInt(valores[2]);
        int D = Integer.parseInt(valores[3]);

        int soma1 = C + D;
        int soma2 = A + B;

       if (B > C && D > A && soma1 > soma2 && C >=0 && D >=0 && A%2 == 0 ){
           System.out.println("Valores aceitos");
       }
       else{
           System.out.println("Valores nao aceitos");
       }
    }
}
