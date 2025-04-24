import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<BankAccount> accounts = new ArrayList<BankAccount>();

    public void plusAccount(BankAccount account) {
        accounts.add(account);
    }

    public void findAccountbynumber(int accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                System.out.println(accounts.indexOf(account));
            }
        }
    }

}
