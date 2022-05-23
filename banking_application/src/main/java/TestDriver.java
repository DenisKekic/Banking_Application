import java.util.Scanner;

public class TestDriver {
    public static void main(String[] args) {

        BankAccountData bankAccountData = new BankAccountData();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihren Namen ein...");
        String name = scanner.nextLine();
        System.out.println("Bitte geben Sie Ihre ID ein...");
        int id = scanner.nextInt();

        if(!bankAccountData.containsBankAccountsData(id)){
            BankAccount bankAccount = new BankAccount(name, id);
            bankAccount.output();

        }
        else{
            System.out.println("Im bestehenden Konto erfolgreich eingeloggt!");
            BankAccount bankAccount = bankAccountData.getBankAccountsData(id);
            bankAccount.output();
        }
    }
}
