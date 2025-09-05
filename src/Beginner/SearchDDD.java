package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class SearchDDD {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int d = Integer.parseInt(br.readLine());

//        if (Objects.equals(d, 61)){
//            System.out.println("Brasilia");
//        }
//        else if (Objects.equals(d, 71)){
//            System.out.println("Salvador");
//        }
//        else if (Objects.equals(d, 11)){
//            System.out.println("São Paulo");
//        }
//        else if (Objects.equals(d, 21)){
//            System.out.println("Rio de Janeiro");
//        }
//        else if (Objects.equals(d, 32)){
//            System.out.println("Juiz de Fora");
//        }
//        else if (Objects.equals(d, 19)){
//            System.out.println("Campinas");
//        }
//        else if (Objects.equals(d, 27)){
//            System.out.println("Vitoria");
//        }
//        else if (Objects.equals(d, 31)){
//            System.out.println("Belo Horizonte");
//        }
//        else{
//            System.out.println("DDD nao cadastrado");
//        }
        //Ou utilizar o MAP para criar um dicionario
        Map<Integer, String> dds = Map.of(
                61, "Brasilia",
                71, "Salvador",
                11, "São Paulo",
                21, "Rio de Janeiro",
                32, "Juiz de Fora",
                19, "Campinas",
                27, "Vitoria",
                31, "Belo Horizonte"
        );

        System.out.println(dds.getOrDefault(d, "DDD nao cadastrado"));
    }
}
