package cursojavaNelioAlves.application;

import cursojavaNelioAlves.entities.Account;
import cursojavaNelioAlves.entities.BusinessAccount;
import cursojavaNelioAlves.entities.SavingsAccount;

public class UseSavingsAccont {

    public static void main(String[] args){

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Bob", 0.0, 500.0);


        //UPCASTING
        //a conta empresarial e especifica e conta e global, estamos pegando um especifico e colocando em um global
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Maria", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Bob", 0.0, 0.01);


        //DOWNCASTING
        //a conta e global e pode ser usada em qualquer lugar, estamos pegando um global e colocando em um especifico
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

    }
}
