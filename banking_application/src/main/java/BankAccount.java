import java.util.Map;
import java.util.Scanner;

public class BankAccount {
    private double balance;
    private double previousTransaction;

    Scanner scanner = new Scanner(System.in);

    private String name;
    private int id;

    public BankAccount(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void getPreviousTransaction() {
        if(previousTransaction < 0){
            System.out.println("Abgebucht: " + Math.abs(previousTransaction));
        }
        else if(previousTransaction > 0){
            System.out.println("Aufgeladen: " + Math.abs(previousTransaction));
        }
        else{
            System.out.println("Es wurden keine Transaktionen durchgefuehrt!");
        }
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void deposit(double amount){
        if(amount != 0){
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    public void withdraw(double amount){
        if(amount != 0){
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    public void output(){

        char c = '\0';
        double money = 0.0;
        String lines = "______________________________________________________________";

        do{
            System.out.println("Daten:");
            System.out.println(lines);
            System.out.println("Name: " + this.name);
            System.out.println("ID: " + this.id);
            System.out.println(lines);

            System.out.println("\n");
            System.out.println("A - Kontostand ueberpruefen");
            System.out.println("B - Aufladen");
            System.out.println("C - Abheben");
            System.out.println("D - Vorherige Transaktion");
            System.out.println("E - Abbrechen");
            System.out.println("\n");
            System.out.println(lines);

            System.out.println("Geben Sie einen Befehl ein: ");

            c = scanner.next().charAt(0);

            switch (c){
                case 'A':
                    System.out.println(lines);
                    System.out.println("Your current balance is: " + this.getBalance());
                    System.out.println(lines);
                    break;
                case 'B':
                    System.out.println(lines);
                    System.out.println("Geben Sie die Summe ein die überwiesen werden soll:");
                    money = scanner.nextDouble();
                    deposit(money);
                    System.out.println(lines);
                    System.out.println("Die Summe " + money + " wurde erfolgreich aufgeladen.");
                    System.out.println(lines);
                    break;
                case 'C':
                    System.out.println(lines);
                    System.out.println("Geben Sie die Summe ein die abgehoben werden soll:");
                    money = scanner.nextDouble();
                    withdraw(money);
                    System.out.println(lines);
                    System.out.println("Die Summe " + money + " wurde erfolgreich überwiesen.");
                    System.out.println(lines);
                    break;
                case 'D':
                    getPreviousTransaction();
                    System.out.println(lines);
                    break;
                case 'E':
                    break;
            }

        }while (c != 'E');
    }
}
