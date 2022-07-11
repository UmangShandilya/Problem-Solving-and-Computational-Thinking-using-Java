import java.util.Scanner;

public class GarlicBreadMenu
{
    //The below method displays the garlic bread menu to user.
    public void displayGarlicBreadMenu()
    {
        System.out.println();
        System.out.printf("%10s %20s %30s", "Sr.No", "Bread", "Price\n");
        System.out.printf("%8s %37s %13s", "1", "Stuffed Garlic Bread", "90\n");
        System.out.printf("%8s %42s %8s", "2", "Plain Garlic Bread Sticks", "80\n");
        System.out.println();
        userChoice();
    }
    public void userChoice()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please choose the corresponding number from the menu : ");
        int breadChoice = scan.nextInt();
        while(breadChoice <= 0 || breadChoice > 2)
        {
            System.out.println("Invalid Choice.");
            System.out.print("Please choose the corresponding number from the menu : ");
            breadChoice = scan.nextInt();
        }


        MainPizzaOrderingSystem.totalBillForBread = MainPizzaOrderingSystem.totalBillForBread + breadCost(breadChoice);
        totalBillForBread();
    }
    //The below method takes user input for bread choice and returns the value as cost.
    public int breadCost(int breadChoice)
    {
        int costOfBread = 0;
        if (breadChoice == 1)
        {
            costOfBread = 90;
        }
        else if (breadChoice == 2)
        {
            costOfBread = 80;
        }
        else
        {
            System.out.println("Invalid Choice");
        }
        return costOfBread;
    }

    //The below method calculates total bill for garlic bread ordered.
    public void totalBillForBread()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Do you want to add more bread [yes/no]? : ");
        String addMore = scan.nextLine();
        if (addMore.equalsIgnoreCase("yes"))
        {
            userChoice();
        }
        else
        {
            System.out.println("The total bill for Garlic Bread is : " + MainPizzaOrderingSystem.totalBillForBread);
        }
    }
}
