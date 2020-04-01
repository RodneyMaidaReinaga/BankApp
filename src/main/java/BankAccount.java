public class BankAccount {

    private final String owner;
    private final String accountNumber;
    private double total = 1000;

    public BankAccount(String owner, String accountNumber) {
        this.owner = owner;
        this.accountNumber = accountNumber;
    }

    public void withdraw(double retiro) {
        total = total - retiro;
    }

    public double getBalance() {
        return total;
    }

}
