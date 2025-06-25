package cursojava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PasswordWhile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int senhaValide = 2002;
        int senha = Integer.parseInt(br.readLine());

        while (senhaValide != senha) {
            System.out.println("Senha Invalida");
            senha = Integer.parseInt(br.readLine());
        }
        System.out.println("Acesso Permitido");

    }
}
