public class GSave implements BankAccountDecorator {
    private BankAccount bankAccount;

    public GSave(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String showAccountType() {
        return "GSave";
    }

    public double getInterestRate() {
        return 0.025;
    }

    public double getBalance() {
        return bankAccount.getBalance();
    }

    public String showBenefits() {
        return bankAccount.showBenefits() + ", GCash transfer";
    }

    public double computeBalanceWithInterest() {
        return getBalance() + (getBalance() * getInterestRate());
    }

    public String showInfo() {
        return bankAccount.showInfo();
    }
}