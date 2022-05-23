import java.util.ArrayList;
import java.util.List;

public class BankAccountData {

    List<BankAccount> bankAccountsData = new ArrayList<>();

    public void addBankAccountsData(BankAccount bankAccount){
        bankAccountsData.add(bankAccount);
    }

    public boolean containsBankAccountsData(int id){
        for (BankAccount bankAccount : bankAccountsData) {
            if(bankAccount.getId() == id){
                return true;
            }
        }
        return false;
    }

    public BankAccount getBankAccountsData(int id){
        for (BankAccount bankAccount : bankAccountsData) {
            if(bankAccount.getId() == id){
                return bankAccount;
            }
        }
        return null;
    }
}
