package beecrowd.Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FixedPassword {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();

        int validPassword = 2002;

        while (true){
            int password = Integer.parseInt(br.readLine());

            if (password == validPassword){
                String right= "Acesso Permitido";
                list.add(right);
                break;
            }

            String denied = "Senha Invalida";
            list.add(denied);
        }
        for (String x : list){
            System.out.println(x);
        }
    }
}
