package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Animal {
    public static void main (String[]  args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();

        if (Objects.equals(a, "vertebrado") && Objects.equals(b, "ave") && Objects.equals(c, "carnivoro")){
            System.out.println("aguia");
        }
        else if (Objects.equals(a, "vertebrado") && Objects.equals(b, "ave") && Objects.equals(c, "onivoro")){
            System.out.println("pomba");
        }
        else if (Objects.equals(a, "vertebrado") && Objects.equals(b, "mamifero") && Objects.equals(c, "onivoro")){
            System.out.println("homem");
        }
        else if (Objects.equals(a, "vertebrado") && Objects.equals(b, "mamifero") && Objects.equals(c, "herbivoro")){
            System.out.println("vaca");
        }
        else if (Objects.equals(a, "invertebrado") && Objects.equals(b, "inseto") && Objects.equals(c, "hematofago")){
            System.out.println("pulga");
        }
        else if (Objects.equals(a, "invertebrado") && Objects.equals(b, "inseto") && Objects.equals(c, "herbivoro")){
            System.out.println("lagarta");
        }
        else if (Objects.equals(a, "invertebrado") && Objects.equals(b, "anelideo") && Objects.equals(c, "hematofago")){
            System.out.println("sanguessuga");
        }
        else if (Objects.equals(a, "invertebrado") && Objects.equals(b, "anelideo") && Objects.equals(c, "onivoro")){
            System.out.println("minhoca");
        }
        else{
            System.out.println("Animal não consta na tabela");
        }

    }
}
