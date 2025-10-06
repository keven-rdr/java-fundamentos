package cursojavaNelioAlves.matriz;

import java.io.IOException;
import java.util.Scanner;

public class SecundMatrixExerc {
    public static void main (String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];

        for (int i = 0; i< m; i++){
            for (int j = 0; j < n; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Qual valor quer ler: ");
        int x = sc.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if (j < n-1) {
                        System.out.println("Rights: " + mat[i][j+1]);
                    }
                    if (i < m-1) {
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
            }
        }
    }
}
