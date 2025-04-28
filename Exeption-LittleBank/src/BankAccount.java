public class BankAccount {
    private int accountNumber;
    private double balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public BankAccount(int accountNumber, double balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException();
        }
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException();
        }
        if (this.balance >= amount) {
            this.balance -= amount;
        }
        if (this.balance < amount) {
            throw new InsufficientFundsException();
        }


    }

    public void transfer(BankAccount acc, double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException();
        }
        if (this.balance < amount) {
            throw new InsufficientFundsException();
        }
        if (this.balance >= amount) {
            this.balance -= amount;
            acc.deposit(amount);
        }

    }

}


