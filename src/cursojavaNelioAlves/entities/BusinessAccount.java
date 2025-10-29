//RECEBE DA CLASSE PAI OS ATRIBUTOS EM COMUM
package cursojavaNelioAlves.entities;

public class BusinessAccount extends Account {
    private Double loanLimit;

    public BusinessAccount(){
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if (amount <= loanLimit){
            balance += amount - 10.0;
        }
    }

    @Override
    public String toString() {
        return "\nCliente: "
                + getHolder()
                + "\nConta: "
                + getHolder()
                + "\nSaldo Final: "
                + String.format("%.2f", getBalance())
                + "\nValor do Limite da conta: "
                + String.format("%.2f", loanLimit);
    }
}
