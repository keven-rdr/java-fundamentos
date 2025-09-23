package cursojava;

import entities.ContaBanck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaixaDoBanck {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ContaBanck contaBanck;

        System.out.print("Enter account data: ");
        int number = Integer.parseInt(br.readLine());
        System.out.print("Enter account holder: ");
        String holder = br.readLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = br.readLine().charAt(0);
        if( response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = Double.parseDouble(br.readLine());
            contaBanck = new ContaBanck(number, holder, initialDeposit);
        }
        else {
            contaBanck = new ContaBanck(number, holder);
        }

        System.out.println("Account data: \n"+contaBanck);

        System.out.print("Enter a deposit value: ");
        contaBanck.addDeposit(Double.parseDouble(br.readLine()));
        System.out.println("Updated account data: \n"+contaBanck);

        System.out.print("Enter a withdraw value: ");
        contaBanck.subtractDeposit(Double.parseDouble(br.readLine()));
        System.out.println("Updated account data: \n"+contaBanck);

    }
}
