package leetCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TwoSun {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();

        System.out.print("Quantos numeros quer adicionar na lista: ");
        int n = Integer.parseInt(br.readLine());
        System.out.print("\nInsira o valor do Target: ");
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++){
            System.out.print("Insira o número " + (i + 1) + ": ");
            int x = Integer.parseInt(br.readLine());
            list.add(x);
        }

        for (int i = 0; i < list.size(); i++) {//escolhi um numero
            for (int j = i + 1; j < list.size(); j++) {//escolhe o segundo numero depois do i, vai fazer isso ate o final da lista
                if (list.get(i) + list.get(j) == t) {//se achar o valor igual t imprime
                    System.out.println("Output: [" + i + "," + j + "]");
                    System.out.println("Becouse nums[" + i + "] + nums[" + j + "] == " + t + ", we return [" + list.get(i) + ", " + list.get(j)+ "]");
                }
            }
        }

        br.close();
    }
}
