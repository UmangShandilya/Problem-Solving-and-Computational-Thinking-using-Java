import java.util.Scanner;

public class BeveragesMenu
{
    //The below method displays the beverage menu to user.
    public void displayBeveragesMenu()
    {
        System.out.println();
        System.out.printf("%10s %20s %10s", "Sr.No", "Beverages", "Price\n");
        System.out.printf("%8s %18s %13s", "1", "Pepsi", "60\n");
        System.out.printf("%8s %17s %14s", "2", "Coke", "60\n");
        System.out.println();
        userChoice();
    }
    public void userChoice()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please choose the corresponding number from the menu : ");
        int beverageChoice = scan.nextInt();
        while(beverageChoice <= 0 || beverageChoice > 2)
        {
            System.out.println("Invalid Choice.");
            System.out.print("Please choose the corresponding number from the menu : ");
            beverageChoice = scan.nextInt();

        }


        MainPizzaOrderingSystem.totalBillForBeverages = MainPizzaOrderingSystem.totalBillForBeverages + beverageCost(beverageChoice);
        totalBillForBeverages();
    }

    //The below method takes user input for beverage choice and returns the value as cost.
    public int beverageCost(int beverageChoice)
    {
        int costOfBeverages = 0;
        if (beverageChoice == 1)
        {
            costOfBeverages = 60;
        }
        else if (beverageChoice == 2)
        {
            costOfBeverages = 60;
        }
        else
        {
            System.out.println("Invalid Choice");
        }
        return costOfBeverages;
    }

    //The below method calculates total bill for beverage ordered.
    public void totalBillForBeverages()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Do you want to add more beverages [yes/no]? : ");
        String addMore = scan.nextLine();
        if (addMore.equalsIgnoreCase("yes"))
        {
            userChoice();
        }
        else
        {
            System.out.println("The total bill for Beverages is : " + MainPizzaOrderingSystem.totalBillForBeverages);
        }
    }

}
