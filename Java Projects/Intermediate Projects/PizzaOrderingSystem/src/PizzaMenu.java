import java.util.Scanner;
public class PizzaMenu
{
    //The below method displays the pizza menu to user.
    public void displayPizzaMenu()
    {
        System.out.printf("%10s %30s %40s %20s %20s", "Sr.No", "Pizza" ,"Regular", "Medium", "Large\n");
        System.out.printf("%8s %48s %22s %20s %20s", "1", "African Peri Peri Veg", "NA", "350", "450\n");
        System.out.printf("%8s %39s %31s %20s %20s", "2", "Barbecue Veg", "NA", "300", "400\n");
        System.out.printf("%8s %44s %26s %20s %20s", "3", "Jamaican Jerk Veg", "250", "350", "450\n");
        System.out.printf("%8s %46s %24s %20s %20s", "4", "What-a-pizza Exotic", "200", "300", "400\n");
        System.out.printf("%8s %54s %16s %20s %20s", "5", "English Cheddar and Veggies", "175", "375", "500\n");
        System.out.println();
        userChoice();
    }

    //The below method displays the crust menu to user.
    public void displayCrustMenu()
    {
        System.out.println();
        System.out.printf("%10s %20s %40s", "Sr.No", "Crust", "Price (in Rupees)\n");
        System.out.printf("%8s %33s %18s", "1", "Wheat Thin Crust", "60\n");
        System.out.printf("%8s %31s %20s", "2", "Fresh Pan Base", "80\n");
        System.out.printf("%8s %28s %23s", "3", "Hand Tossed", "70\n");
        System.out.println();
    }

    //The below method displays the topping menu to user.
    public void displayToppingMenu()
    {
        System.out.println();
        System.out.printf("%10s %20s %30s", "Srno", "Toppings", "Price (in Rupees)\n");
        System.out.printf("%8s %26s %19s", "1", "Extra Cheese", "80\n");
        System.out.printf("%8s %26s %19s", "2", "Veg Toppings", "120\n");
        System.out.println();

    }
    //The below method takes user's choice.
    public void userChoice()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please choose the corresponding number from the menu : ");
        int pizzaChoice = scan.nextInt();
        System.out.print("Please enter number of Pizza : ");
        int numberOfPizza = scan.nextInt();
        while(pizzaChoice <= 0 || pizzaChoice > 5)
        {
            System.out.println("Invalid Choice.");
            System.out.print("Please choose the corresponding number from the menu : ");
            pizzaChoice = scan.nextInt();
        }


        int priceOfPizza = pizzaCost(pizzaChoice,numberOfPizza);
        do
        {
            System.out.print("Please choose the corresponding number from the menu : ");
            pizzaChoice = scan.nextInt();
            System.out.print("Please enter number of Pizza : ");
            numberOfPizza = scan.nextInt();
            priceOfPizza = pizzaCost(pizzaChoice,numberOfPizza);
        }
        while(priceOfPizza == 0);

        displayCrustMenu();
        int priceOfCrust = crustCost(numberOfPizza);

        displayToppingMenu();
        int priceOfTopping = toppingCost(numberOfPizza);

        totalBillForPizza(priceOfPizza, priceOfCrust, priceOfTopping);
    }

    //The below method takes user input for pizza, pizza size and number of pizza and returns the cost.
    public int pizzaCost(int pizzaChoice, int numberOfPizza)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please choose the size of Pizza [Regular : R, Medium : M, Large : L] : ");
        String pizzaSize = scan.nextLine();


         int priceOfPizza = 0;
         switch(pizzaChoice)
         {
             case 1:
             {
                 if (pizzaSize.equalsIgnoreCase("R"))
                 {
                     System.out.println("Oops! this pizza is unavailable.");
                 }
                 else if (pizzaSize.equalsIgnoreCase("M"))
                 {
                     priceOfPizza = numberOfPizza * 350;
                 }
                 else if (pizzaSize.equalsIgnoreCase("L"))
                 {
                     priceOfPizza = numberOfPizza * 450;
                 }
                 else
                 {
                     System.out.println("Invalid Choice.");
                 }
                 break;
             }
             case 2:
             {
                 if (pizzaSize.equalsIgnoreCase("R"))
                 {
                     System.out.println("Oops! this pizza is unavailable.");
                 }
                 else if (pizzaSize.equalsIgnoreCase("M"))
                 {
                     priceOfPizza = numberOfPizza * 300;
                 }
                 else if (pizzaSize.equalsIgnoreCase("L"))
                 {
                     priceOfPizza = numberOfPizza * 400;
                 }
                 else
                 {
                     System.out.println("Invalid Choice.");
                 }
                 break;
             }
             case 3:
             {
                 if (pizzaSize.equalsIgnoreCase("R"))
                 {
                     priceOfPizza = numberOfPizza * 250;
                 }
                 else if (pizzaSize.equalsIgnoreCase("M"))
                 {
                     priceOfPizza = numberOfPizza * 350;
                 }
                 else if (pizzaSize.equalsIgnoreCase("L"))
                 {
                     priceOfPizza = numberOfPizza * 450;
                 }
                 else
                 {
                     System.out.println("Invalid Choice.");
                 }
                 break;
             }
             case 4:
             {
                 if (pizzaSize.equalsIgnoreCase("R"))
                 {
                     priceOfPizza = numberOfPizza * 200;
                 }
                 else if (pizzaSize.equalsIgnoreCase("M"))
                 {
                     priceOfPizza = numberOfPizza * 300;
                 }
                 else if (pizzaSize.equalsIgnoreCase("L"))
                 {
                     priceOfPizza = numberOfPizza * 400;
                 }
                 else
                 {
                     System.out.println("Invalid Choice.");
                 }
                 break;
             }
             case 5:
             {
                 if (pizzaSize.equalsIgnoreCase("R"))
                 {
                     priceOfPizza = numberOfPizza * 175;
                 }
                 else if (pizzaSize.equalsIgnoreCase("M"))
                 {
                     priceOfPizza = numberOfPizza * 375;
                 }
                 else if (pizzaSize.equalsIgnoreCase("L"))
                 {
                     priceOfPizza = numberOfPizza * 500;
                 }
                 else
                 {
                     System.out.println("Invalid Choice.");
                 }
                 break;
             }
         }
         return priceOfPizza;
    }

    //The below method takes user input for crust choice and returns the value as cost.
    public int crustCost(int numberOfPizza)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please choose the corresponding number from the crust menu : ");
        int crustChoice = scan.nextInt();
        int costOfCrust = 0;
        if (crustChoice == 1)
        {
            costOfCrust = numberOfPizza * 60;
        }
        else if (crustChoice == 2)
        {
            costOfCrust = numberOfPizza * 80;
        }
        else if (crustChoice == 3)
        {
            costOfCrust = numberOfPizza * 70;
        }
        else
        {
            System.out.println("Invalid Choice");
            crustCost(numberOfPizza);
        }
        return costOfCrust;
    }

    //The below method takes user input for topping choice and returns the value as cost.
    public int toppingCost(int numberOfPizza)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please choose the corresponding number from the topping menu else press 0 for no toppings : ");
        int toppingChoice = scan.nextInt();
        int costOfTopping = 0;
        if (toppingChoice == 1)
        {
            costOfTopping = numberOfPizza * 80;
        }
        else if (toppingChoice == 2)
        {
            costOfTopping = numberOfPizza * 120;
        }
        else
            costOfTopping = 0;
        return costOfTopping;
    }

    //The below method calculates total bill for pizza ordered.
    public void totalBillForPizza(int priceOfPizza, int priceOfCrust, int priceOfTopping)
    {
        Scanner scan = new Scanner(System.in);
        MainPizzaOrderingSystem.totalBillForPizza += priceOfPizza + priceOfCrust + priceOfTopping;
        System.out.print("Do you want to order another pizza [yes/no]? : ");
        String anotherPizza = scan.nextLine();
        if(anotherPizza.equalsIgnoreCase("yes"))
        {
            userChoice();
        }
        else
        {
            System.out.println("The total bill for pizza is : " + MainPizzaOrderingSystem.totalBillForPizza);
        }
    }
}
