package cursojavaNelioAlves;

import java.io.IOException;

public class ForEach {
    public static void main (String[] args) throws IOException{

        String[] vect = new String[] {"Maria", "Bob", "Alex"};

        for (int i = 0; i < vect.length; i++){
            System.out.println(vect[i]);
        }

        // 1º: Tipo, 2º apelido, 3º Nome da coleção
        for (String obj : vect){
            System.out.println(obj);
        }
    }
}
