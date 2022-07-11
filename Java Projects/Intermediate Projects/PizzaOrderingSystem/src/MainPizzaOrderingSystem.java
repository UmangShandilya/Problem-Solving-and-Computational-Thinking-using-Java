import java.util.Scanner;
public class MainPizzaOrderingSystem
{
    static int totalBillForPizza = 0;
    static int totalBillForBread = 0;
    static int totalBillForBeverages = 0;
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Bean's Pizza!");
        System.out.println();
        Menu beansPizzaMenu = new Menu();
        beansPizzaMenu.displayMenu();
        String orderMore = "";
        do
        {
            System.out.print("Do you want to order anything else [yes/no]? ");
            orderMore = scan.nextLine();
            if(orderMore.equalsIgnoreCase("yes"))
            {
                beansPizzaMenu.displayMenu();
            }
        }
        while (orderMore.equalsIgnoreCase("yes"));

        int finalBill = totalBillForPizza + totalBillForBread + totalBillForBeverages;
        System.out.print("Your Total Bill Amount : " + finalBill);

    }

}
