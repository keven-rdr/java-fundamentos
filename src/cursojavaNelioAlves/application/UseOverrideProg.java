package cursojavaNelioAlves.application;

import cursojavaNelioAlves.entities.Account;
import cursojavaNelioAlves.entities.BusinessAccount;
import cursojavaNelioAlves.entities.SavingsAccount;

public class UseOverrideProg {
    public static void main(String[] args){

        Account acc = new Account(1001, "Alex", 1000.0);
        acc.withdraw(200.0);
        System.out.println(acc.getBalance());

        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());
    }

}
