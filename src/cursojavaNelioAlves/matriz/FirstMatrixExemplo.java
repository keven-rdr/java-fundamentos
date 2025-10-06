package cursojavaNelioAlves.matriz;

import java.io.IOException;
import java.util.Scanner;


public class FirstMatrixExemplo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        //percorrer a linha
        //n pode ser = i<mat.length = representar as linhas
        for (int i = 0; i < mat.length; i++) {
            //percorrer a coluna
            //n pode ser = j<mat[i].length = representar as colunas
            for(int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.print("Main diagonal: ");
        for (int i = 0; i < mat.length; i++){
            System.out.print(mat[i][i] + " ");
        }

        System.out.print("\nNegative numbers = ");
        int count = 0;
        for(int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (mat[i][j] < 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
