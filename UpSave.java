public class UpSave implements BankAccountDecorator {
    private BankAccount bankAccount;

    public UpSave(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String showAccountType() {
        return "UpSave";
    }

    public double getInterestRate() {
        return 0.04;
    }

    public double getBalance() {
        return bankAccount.getBalance();
    }

    public String showBenefits() {
        return bankAccount.showBenefits() + ", With Insurance";
    }

    public double computeBalanceWithInterest() {
        return getBalance() + (getBalance() * getInterestRate());
    }

    public String showInfo() {
        return bankAccount.showInfo();
    }
}
