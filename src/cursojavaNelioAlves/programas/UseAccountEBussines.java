//PROGRAMA QUE RODA AS ENTIDADES ACCOUNT E BUSINESS QUE USÃO A HERENÇA
package cursojavaNelioAlves.programas;

import cursojavaNelioAlves.entities.BusinessAccount;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class UseAccountEBussines {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BusinessAccount account = new BusinessAccount();

        System.out.print("Entre com o nome do Usuário: ");
        account.setHolder(br.readLine());
        System.out.print("Entre com o número da conta: ");
        account.setNumber(Integer.parseInt(br.readLine()));
        System.out.print("Entre com o valor do deposito: ");
        account.deposit(Double.parseDouble(br.readLine()));

        System.out.print("Entre com o limite da conta: ");
        account.setLoanLimit(Double.parseDouble(br.readLine()));

        System.out.print("Entre com o valor do saque: ");
        account.withdraw(Double.parseDouble(br.readLine()));

        System.out.print("Deseja emprestar uma valor? (s/n): ");
        if (br.readLine().equals("s")){
            System.out.print("Entre com o valor do empréstimo: ");
            account.loan(Double.parseDouble(br.readLine()));
        }

        System.out.println("Dados da conta:"+ account);

    }
}
