import java.util.Scanner;
public class Menu
{
    //The below method displays the initial menu to user.
    public void displayMenu()
    {
        System.out.printf("%25s","MAIN MENU\n");
        System.out.println("---------------------------------------------");
        System.out.printf("%10s %30s", "Sr.No", "Item Category\n");
        System.out.printf("%8s %24s", "1", "Pizza\n");
        System.out.printf("%8s %31s", "2", "Garlic Bread\n");
        System.out.printf("%8s %28s", "3", "Beverages\n");
        System.out.println();
        userChoice();
    }

    //The below method takes user's choice. Based on that it calls respective menus.
    public void userChoice()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please choose the corresponding number from the menu : ");
        int choice = scan.nextInt();
        if (choice == 1)
        {
          PizzaMenu callPizzaMenu = new PizzaMenu();
          callPizzaMenu.displayPizzaMenu();
        }
        else if (choice == 2)
        {
            GarlicBreadMenu callGarlicBreadMenu = new GarlicBreadMenu();
            callGarlicBreadMenu.displayGarlicBreadMenu();
        }
        else if (choice == 3)
        {
            BeveragesMenu callBeveragesMenu = new BeveragesMenu();
            callBeveragesMenu.displayBeveragesMenu();
        }
        else
        {
            System.out.println("Invalid Choice. Please enter a valid choice");
            userChoice();
        }
    }
}
