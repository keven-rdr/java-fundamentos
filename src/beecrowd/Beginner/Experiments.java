package beecrowd.Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Experiments {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int total = 0;
        int rabbit = 0;
        int rat = 0;
        int frog = 0;

        for (int i = 0; i < n; i++){
           String[] v = br.readLine().split(" ");
           int x = Integer.parseInt(v[0]);
           String animalType = v[1].toLowerCase();

            if ( x >=1 && x <= 15){
               total += x;

              switch (animalType){
                  case "c":
                      rabbit += x;
                      break;
                  case "r":
                      rat += x;
                      break;
                  case "s":
                      frog += x;
                      break;
              }

            }
        }
        System.out.println("Total: "+total+" cobaias");
        System.out.println("Total de coelhos: "+rabbit);
        System.out.println("Total de ratos: "+rat);
        System.out.println("Total de sapos: "+frog);

        System.out.printf("Percentual de coelhos: %.2f %%%n", (double) rabbit / total * 100.0);
        System.out.printf("Percentual de Ratos: %.2f %%%n", (double) rat / total * 100.0);
        System.out.printf("Percentual de Sapos: %.2f %%%n", (double) frog / total * 100.0);
    }
}
