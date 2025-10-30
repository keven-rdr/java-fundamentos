package beecrowd.AD_HOC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ToCarryornotCarry {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        List<Number> finalList = new ArrayList<>();
//
//        int n = 2;
//        for (int i = 0; i < n ; i++){
//            List<Number> list = new ArrayList<>();
//            List<Number> list2 = new ArrayList<>();
//            List<Number> soma = new ArrayList<>();
//
//            String[] par = br.readLine().split(" ");
//            int a = Integer.parseInt(par[0]);
//            int b = Integer.parseInt(par[1]);
//
//            while(a > 0 || b > 0){
//                list.add(a % 2);
//                a = a /2;
//
//                list2.add(b % 2);
//                b = b /2;
//            }
//
//            int size = Math.max(list.size(), list2.size());
//            while (list.size() < size) list.add(0);
//            while (list2.size() < size) list2.add(0);
//
//            for (int x = 0; x < size; x++) {
//                int posicao = list.get(x).equals(list2.get(x)) ? 0 : 1;
//                soma.add(posicao);
//            }
//
//            double valor = 0;
//            for (int x = soma.size() - 1, y = 0; x >= 0 && y < soma.size(); x--, y++) {
//                valor += soma.get(x).intValue() * Math.pow(2,y);
//            }
//            finalList.add(valor);
//        }
//
//        for (Number x : finalList){
//            System.out.printf("%.0f\n",x);
//        }
        String line;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            String[] parts = line.split(" ");
            long a = Long.parseLong(parts[0]);
            long b = Long.parseLong(parts[1]);

            // soma sem carry = operação XOR
            System.out.println(a ^ b);
        }
    }

}
