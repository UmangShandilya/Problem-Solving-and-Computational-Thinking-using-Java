import java.util.Scanner;
import java.util.Random;

public class IDBCBank
{
    public static void main(String[] args)
    {
        IDBCBank call = new IDBCBank();
        System.out.println("Welcome to IDBC Bank Kiosk");
        call.displayMainMenu();
        call.getUserChoiceOnAccountType();
    }

    //The method below displays the main menu of the kiosk.
    public void displayMainMenu()
    {
        System.out.println("    MAIN MENU    ");
        System.out.println("SNo.        Account Type");
        System.out.println("1           Savings Account");
        System.out.println("2           Pay Account");
    }

    //The method below gets user input.
    public void getUserChoiceOnAccountType()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number corresponding to the account : ");
        int userChoice = scan.nextInt();
        if(userChoice < 1 || userChoice > 2)
        {
            System.out.println("Invalid choice.");
            System.out.print("Please enter the number corresponding to the account : ");
            userChoice = scan.nextInt();
        }
        directToAccountType(userChoice);

    }

    //This method directs according to user choice.
    public void directToAccountType(int userChoice)
    {
        Scanner scan = new Scanner(System.in);
        switch (userChoice)
        {
            case 1 ->
            {
                AccountType accountType = AccountType.SAVING;
                long accountNumber = generateAccountNumber();
                String accountHolderName = getAccountHolderName();
                int age = getBirthYear();
                if (age < 18)
                {
                    System.out.println("Sorry! You are not eligible to open an account.");
                }
                else
                {
                    SavingsAccount newSavingsAccount = new SavingsAccount(accountNumber, accountHolderName, 0.0d, age, accountType);
                    System.out.println();
                    newSavingsAccount.displayAccountDetails(accountType);
                    newSavingsAccount.displaySavingsMenu();
                    System.out.println();
                    System.out.print("To return to Savings Menu Press 1 else enter any digit : ");
                    int otherFacility = scan.nextInt();
                    while(otherFacility == 1)
                    {
                        System.out.println();
                        newSavingsAccount.displaySavingsMenu();
                        System.out.print("To return to Savings Menu Press 1 else enter any digit : ");
                        otherFacility = scan.nextInt();
                    }

                }
            }
            case 2 ->
            {
                AccountType accountType = AccountType.PAY;
                long accountNumber = generateAccountNumber();
                String accountHolderName = getAccountHolderName();
                int age = getBirthYear();
                if (age < 18)
                {
                    System.out.println("Sorry! You are not eligible to open an account.");
                }
                else
                {
                    PayAccount newPayAccount = new PayAccount(accountNumber, accountHolderName, 0.0d, age, accountType);
                    System.out.println();
                    newPayAccount.displayAccountDetails(accountType);
                    newPayAccount.displayPayMenu();
                    System.out.println();
                    System.out.print("To return to Pay Menu Press 1 else enter any digit : ");
                    int otherFacility = scan.nextInt();
                    while(otherFacility == 1)
                    {
                        System.out.println();
                        newPayAccount.displayPayMenu();
                        System.out.print("To return to Savings Menu Press 1 else enter any digit : ");
                        otherFacility = scan.nextInt();
                    }
                }

            }
        }
    }

    //This method generates 12-digit account number.
    private long generateAccountNumber()
    {
        Random rand = new Random();
        return rand.nextLong(100000000000L);
    }

    //This method gets Account Holder's Name.
    private String getAccountHolderName()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter Account Holder Name : ");
        return scan.nextLine();
    }

    //This method gets Account Holder's birth year and calculates age.
    private int getBirthYear()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter Account Holder's birth year : ");
        int birthYear = scan.nextInt();
        return  (2022 - birthYear);
    }
}
