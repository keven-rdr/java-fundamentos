package cursojavaNelioAlves.programas;

import java.io.IOException;

public class StringManipulation {
    public static void main (String[] args) throws IOException{

        String original = "abcde FGHIJ ABC abc DEFG   ";

        System.out.println("Minusculo: "+ original.toLowerCase());
        System.out.println("Maisculo: "+original.toUpperCase());
        System.out.println("Separar: "+original.trim());
        //pegar o caracter da posição em diante, não definiu o final passando apenas 1 parametro
        System.out.println("Nova lista: "+original.substring(2));
        //definir o final para nova lista, passando 2 parametros
        System.out.println("Final definido: "+original.substring(0,6));
        //quando for letra a minuscula mudar para E maisculo
        System.out.println("Letra trocada: "+original.replace("a", "X"));
        //passando sub string
        System.out.println("Conjunto trocado: "+original.replace("abc", "Y"));
        //Qual a primeira posição do substring "bc"
        System.out.println("Posição do Substring: "+original.indexOf("bc"));
        //Ultima posição do substring do bc
        System.out.println("Ultima posição: "+original.lastIndexOf("bc"));


        //Separador de lista
        String s = "potato apple lemon";

        String[] vect = s.split(" ");
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
    }
}
