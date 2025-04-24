
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        BankAccount Den = new BankAccount(1111, 500);
        BankAccount Matwei = new BankAccount(2222, 1000);
        BankAccount Lexa = new BankAccount(3333, 100000);
        try {
            Lexa.transfer(Matwei, 1000);
        } catch (InsufficientFundsException | InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(Matwei.getBalance());
        System.out.println(Lexa.getBalance());
        try {
            Lexa.withdraw(100000);
        } catch (InsufficientFundsException | InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
        try {
            Matwei.transfer(Lexa, -11111);
        } catch (InsufficientFundsException | InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}