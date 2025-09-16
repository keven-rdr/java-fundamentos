package entities;

public class ContaBanck {
    private int number;
    private String holder;
    private double balance;

    public ContaBanck(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        addDeposit(initialDeposit);
    }

    public ContaBanck(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public void addDeposit(double deposit) {
        balance += deposit;
    }

    public void subtractDeposit(double deposit){
        balance -= (deposit + 5.0);
    }

    public String toString(){
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}
