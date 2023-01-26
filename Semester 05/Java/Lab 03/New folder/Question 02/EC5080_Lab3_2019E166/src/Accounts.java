// I certify the code of this lab is entirely my own work,
// but i refer geeksforgeeks website for getting idea about reading text files.
import java.io.IOException;
import java.util.Scanner;

public class Accounts {
    private double balance;
    private int accountNumber;
    Scanner scanner = new Scanner(System.in);
    public Accounts( double initialBalance, int accountNumber )
    {
        if ( initialBalance > 0.0 )
            balance = initialBalance;
    }
    public void credit( double amount )
    {
        balance = balance + amount;
    }
    public void withdraw(double amount)
    {
        balance = balance - amount;
    }
    public double getBalance()
    {
        return balance;
    }
    public int getAccountNumber()
    {
        return this.accountNumber;
    }
    public static void main(String[] args) throws Exception {
        Accounts accounts = new Accounts(100000,1532);
        BufferedReaderClass bufferedReaderClass = new BufferedReaderClass();
        bufferedReaderClass.readFile();
    }
}
