import java.util.Scanner;

public class Account implements RateOfInterest
{
    long accountNumber;
    String accountHolder;
    double totalBalance;
    int age;
    AccountType accountType;
    int chequeNumber;

    //Initialising Constructor.
    public Account(long accountNumber, String accountHolder, double totalBalance, int age, AccountType accountType)
    {
       this.accountNumber = accountNumber;
       this.accountHolder = accountHolder.toUpperCase();
       this.age = age;
       this.totalBalance = totalBalance;
       this.accountType = accountType;
    }

    //The method below displays Account Details.
    public void displayAccountDetails(AccountType accountType)
    {
        System.out.println("Account Type :              " + accountType);
        System.out.println("Account Number :            " + this.accountNumber);
        System.out.println("Account Holder :            " + this.accountHolder);
        System.out.println("Account Holder's Age :      " + this.age);
        System.out.println("Total Balance :             " + this.totalBalance);
        System.out.println();
    }

    //The method below gets deposit request and alters te balance.
    public void depositMade()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the amount to be deposited : ");
        double deposit = scan.nextDouble();
        totalBalance = deposit + totalBalance;
        System.out.println("Deposit worth " + deposit + " is Successful.");
        System.out.println("Total Balance : " + this.totalBalance);
        System.out.println();

    }

    //The method below gets withdraw request and alters the balance.
    public void withdrawMade()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the amount to be withdraw : ");
        double withdraw = scan.nextDouble();
        totalBalance = totalBalance - withdraw;
        if (totalBalance <=0)
        {
            System.out.println("No balance in account. Can not withdraw money!");
            System.out.println();
        }
        else
        {
            System.out.println("Withdraw worth " + withdraw + " is Successful.");
            System.out.println("Total Balance : " + this.totalBalance);
            System.out.println();
        }

    }

    //The method below displays the balance of account.
    public void displayCheckBalance()
    {
        System.out.println("The balance is : " + totalBalance);
        System.out.println();
    }

    //The method below transfers fund and displays remaining balance.
    public void transferFunds()
    {
        Scanner scan = new Scanner(System.in);
        if (totalBalance <=0)
        {
            System.out.println("No balance in account. Can not transfer money!");
            System.out.println();
        }
        else
        {
            System.out.print("Please enter Beneficiary Account Number : ");
            long beneficiaryAccountNumber = scan.nextLong();
            System.out.print("Please enter the amount to be transferred : ");
            double transferAmount = scan.nextDouble();
            totalBalance = totalBalance - transferAmount;
            System.out.println("Fund Transfer worth " + transferAmount + " is Successful.");
            System.out.println("Total Balance : " + this.totalBalance);
            System.out.println();
        }
    }

    //The method below calculates interest based on type of account.
    @Override
    public double calculateInterest()
    {
               return (totalBalance + (totalBalance * interestRateOnSavings)/100);
    }
}
