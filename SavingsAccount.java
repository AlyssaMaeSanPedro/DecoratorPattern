public class SavingsAccount implements BankAccount {
    private int accountNumber;
    private String accountName;
    private double balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String showAccountType() {
        return "Savings Account";
    }

    public double getInterestRate() {
        return 0.01;
    }

    public double getBalance() {
        return this.balance;
    }

    public String showBenefits() {
        return "Standard Savings Account";
    }

    public double computeBalanceWithInterest() {
        return getBalance() + (getBalance() * getInterestRate());
    }

    public String showInfo() {
        return "Account Number: " + this.accountNumber + "\nAccount Name: " + this.accountName + "\nBalance: " + this.balance;
    }
}
