package lab6;

public class SavingsAccount extends BankAccount {
    private static final double RATE = 0.025; 
    private int savingsNumber = 0;
    private String accountNumber;

    public SavingsAccount(String name, double initialBalance) {
        super(name, initialBalance);
        accountNumber = getAccountNumber() + "-" + savingsNumber;
    }

    public void postInterest() {
        double monthlyInterest = getBalance() * (RATE / 12);
        deposit(monthlyInterest);
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    public SavingsAccount(SavingsAccount originalAccount, double initialBalance) {
        super(originalAccount.getOwner(), initialBalance);
        this.savingsNumber = originalAccount.savingsNumber + 1;
        this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }
}
