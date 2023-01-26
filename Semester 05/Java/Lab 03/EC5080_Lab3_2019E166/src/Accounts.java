// I certify the code of this lab is entirely my own work,
// but I refer geeksforgeeks website for getting idea about reading text files.

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Accounts {
    private double balance;
    private int accountNumber;
    Scanner scanner = new Scanner(System.in);
    public Accounts()
    {

    }
    public Accounts( double initialBalance, int accountNumber)
    {
        accountNumber = this.accountNumber;
        if ( initialBalance > 0.0 )
            balance = initialBalance;
    }
    public void credit( String accountNumberUser,double amount ) throws IOException {
        FileWriter writer = new FileWriter("D:\\E FAC UOJ\\E FAC UOJ 2022 SEM.05\\EC 5080 SOFTWARE CONSTRUCTION\\Lab Reports\\Lab 03\\AccountDetailsATMDetails.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        balance = balance + amount;
        buffer.write(accountNumberUser + " " + balance);

        System.out.println("Added.");
        buffer.close();
    }
    public void withdraw(String accountNumberUser,double amount) throws IOException {
        FileWriter writer = new FileWriter("D:\\E FAC UOJ\\E FAC UOJ 2022 SEM.05\\EC 5080 SOFTWARE CONSTRUCTION\\Lab Reports\\Lab 03\\AccountDetailsATMDetails.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        balance = balance - amount;
        buffer.write(accountNumberUser + " " + balance);
        buffer.close();
    }
    public double getBalance()
    {
        return balance;
    }
    public int getAccountNumber() {

        return this.accountNumber;
    }
    public String[] findAccount(String userAccountNumber) throws Exception {
        ArrayList<String> accountNumbersArrayList = new ArrayList<String>();
        ArrayList<String> accountAmount = new ArrayList<String>();
        ArrayList<ArrayList<String>> accountDetailsAll = new ArrayList<>();
        String[] accountDetails = new String[2];

        try {
            scanner = new Scanner(new File("D:\\E FAC UOJ\\E FAC UOJ 2022 SEM.05\\EC 5080 SOFTWARE CONSTRUCTION\\Lab Reports\\Lab 03\\AccountDetails.txt"));
        } catch (Exception e) {
            System.out.println("File could not found.");
        }

        while (scanner.hasNext()) {
            String a = scanner.next();
            accountNumbersArrayList.add(scanner.next());
            accountAmount.add(scanner.next());
        }
        accountDetailsAll.add(accountNumbersArrayList);
        accountDetailsAll.add(accountAmount);
        int x = 0;
        boolean accountFound = false;
        while (x < accountNumbersArrayList.size())
        {
            if(accountNumbersArrayList.get(x).equals(userAccountNumber))
            {
                accountDetails[0] = accountNumbersArrayList.get(x);
                accountDetails[1] = accountAmount.get(x);
                accountFound = true;
                accountNumber = Integer.parseInt(accountNumbersArrayList.get(x));
                x++;
            }
            else {
                x++;
            }
        }
        if(accountFound == false)
        {
            accountDetails[0] = "000";
            accountDetails[1] = "000";
        }
        return accountDetails;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Accounts accounts = new Accounts();
        String accountNumber;
        double accountAmount;
        String[] userDetails = new String[2];
        System.out.println("Welcome");
        try{
            System.out.println("Enter your account number : ");
            int accountNumberInput = scanner.nextInt();
            accountNumber = String.valueOf(accountNumberInput);
            userDetails= accounts.findAccount(accountNumber);
        }
        catch (InputMismatchException e)
        {
            System.out.println("Entered account number has error.");
            System.out.println("Thank you for banking.");
            return;
        }

        accountNumber = userDetails[0];
        accountAmount = Double.parseDouble(userDetails[1]);
        if(accountNumber == "000")
        {
            System.out.println("Account could not find.");
            return;
        }
        Accounts accounts1 = new Accounts(accountAmount,Integer.parseInt(accountNumber));
        accountAmount = accounts.getBalance();
        int methodSelection = 0;
        while(methodSelection != 5) {
            try {
                System.out.println("For withdraw press 1 for credit press 2 for check account balance press 3  to exit press 5: ");
                methodSelection = scanner.nextInt();
            }
            catch (InputMismatchException e)
            {
                System.out.println("Enter only For withdraw press 1 for credit press 2 for check account balance press 3  to exit press 5: ");
            }
            if (methodSelection == 1) {
                    System.out.println("Enter the withdraw amount : ");
                    Double withdrawAmount = scanner.nextDouble();
                    try {
                        if (withdrawAmount < 0) {}
                    }catch (IllegalArgumentException e)
                    {
                        System.out.println("Negative amount inserted.");
                    }
                    accounts1.withdraw(accountNumber, withdrawAmount);
            } else if (methodSelection == 2) {
                System.out.println("Enter the credit amount : ");
                Double creditAmount = scanner.nextDouble();
                try {
                    if (creditAmount < 0) {}
                }catch (IllegalArgumentException e)
                {
                    System.out.println("Negative amount inserted.");
                }
                accounts1.credit(accountNumber,creditAmount);
            } else if (methodSelection == 3) {
                System.out.println("Your balance :  " + accounts1.getBalance());

            } else if(methodSelection == 5){
                System.out.println("Thank you banking with us.");
                return;
            }
            System.out.println("If you need any other service please continue.");
        }
    }
}
