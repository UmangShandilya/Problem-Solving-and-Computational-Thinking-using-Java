import java.util.Scanner;

public class SavingsAccount extends Account
{


    //Initialising constructor.
    public SavingsAccount(long accountNumber, String accountHolder, double totalBalance, int age, AccountType accountType)
    {
        super(accountNumber, accountHolder, totalBalance, age,accountType);
    }

    //This method displays menu for savings account.
    public void displaySavingsMenu()
    {
        System.out.println("        SAVINGS MENU        ");
        System.out.println("SNo.        Facilities");
        System.out.println("1           Deposit");
        System.out.println("2           Withdraw");
        System.out.println("3           Check Balance");
        System.out.println("4           Transfer Funds");
        System.out.println("5           Calculate Interest");
        System.out.println();
        userChoice();
    }
    // This method gets user input and performs respective function.
    public void userChoice()
    {
        Scanner scan = new Scanner(System.in);
        Scanner scanDepositType = new Scanner(System.in);
        System.out.print("Enter the number corresponding to the facility : ");
        int choice = scan.nextInt();
        switch(choice)
        {
            case 1 ->
            {
                System.out.print("Please enter the type of deposit [CASH / CHEQUE] : ");
                String depositType = scanDepositType.nextLine();
                if(depositType.equalsIgnoreCase("CHEQUE"))
                {
                    System.out.print("Please enter cheque number : ");
                    chequeNumber = scan.nextInt();
                }
                depositMade();
            }
            case 2 ->
            {
                withdrawMade();
            }
            case 3 ->
            {
                displayCheckBalance();
            }
            case 4 ->
            {
                transferFunds();
            }
            case 5 ->
            {
                double amount = calculateInterest();
                System.out.println("The amount after one year (based on current balance) with interest rate of " + interestRateOnSavings +" : " + amount);
            }


        }
    }
}
