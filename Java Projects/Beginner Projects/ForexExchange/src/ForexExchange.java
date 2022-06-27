import java.util.Scanner;
public class ForexExchange
{
    static final double JPY = 0.67;
    static final double EUR = 85.37;
    static final double GBP = 94.5;
    static final double USD = 74.3;
    static final double AED = 20.25;
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Forex Exchange");
        System.out.print("Would you like to use our service [y/n] : ");
        char choice = scan.next().charAt(0);
        if(choice == 'y')
        {
          System.out.println("Exchange Rate of currency can be done for \n 1. JPY \n 2. EUR \n 3. GBP \n 4. USD \n 5. AED ");
          System.out.print("Do you want to continue with these currencies? [y/n] : ");
          char choiceForConversion = scan.next().charAt(0);
          if(choiceForConversion == 'y')
          {
              displayForexDetails();
              System.out.print("Enter the source currency (Currency I have. Please choose number corresponding to the currency from above) : ");
              int sourceCurrency = scan.nextInt();
              System.out.print("Enter the source currency (Currency I wish to exchange. Please choose number corresponding to the currency from above) : ");
              int targetCurrency = scan.nextInt();
              System.out.print("Enter the amount to be converted : ");
              double amountToBeConverted = scan.nextDouble();
              System.out.println("The converted exchange rate is : " + convertGivenCurrencyIntoDesiredCurrency(sourceCurrency, targetCurrency, amountToBeConverted));
              System.out.println("Thanks for choosing our service!");
          }
          else
          {
              System.out.println("Thanks! Have a Good Day!");
          }
        }
        else
        {
            System.out.println("Thanks! Have a Good Day!");
        }
    }

    public static void displayForexDetails()
    {
        System.out.println("The exchange rate for each currency (1,10,20,50,100) in INR ");
        System.out.println("       1      10      20        50        100");
        System.out.println("JPY   "+JPY*1+"    "+JPY*10+"     "+JPY*20+"      "+JPY*50+"      "+JPY*100);
        System.out.println("EUR   "+EUR*1+"   "+EUR*10+"   "+EUR*20+"    "+EUR*50+"    "+EUR*100);
        System.out.println("GBP   "+GBP*1+"    "+GBP*10+"   "+GBP*20+"    "+GBP*50+"    "+GBP*100);
        System.out.println("USD   "+USD*1+"    "+USD*10+"   "+USD*20+"    "+USD*50+"    "+USD*100);
        System.out.println("AED   "+AED*1+"   "+AED*10+"   "+AED*20+"     "+AED*50+"    "+AED*100);
    }

    public static double convertGivenCurrencyIntoDesiredCurrency(int sourceCurrency, int targetCurrency, double amountToBeConverted)
    {
        double sourceValue = 0;
        double targetValue = 0;
        double convertedAmount;

        if(sourceCurrency == 1 )
        {
            sourceValue = JPY;
        }
        else if(sourceCurrency == 2)
        {
            sourceValue = EUR;
        }
        else if(sourceCurrency == 3)
        {
            sourceValue = GBP;
        }
        else if(sourceCurrency == 4)
        {
            sourceValue = USD;
        }
        else if(sourceCurrency == 5)
        {
            sourceValue = AED;
        }

        if(targetCurrency == 1 )
        {
            targetValue = JPY;
        }
        else if(targetCurrency == 2)
        {
            targetValue = EUR;
        }
        else if(targetCurrency == 3)
        {
            targetValue = GBP;
        }
        else if(targetCurrency == 4)
        {
            targetValue = USD;
        }
        else if(targetCurrency == 5)
        {
            targetValue = AED;
        }
        if(sourceValue == targetValue || amountToBeConverted <=0)
            return -1;
        else
            convertedAmount = sourceValue * amountToBeConverted / targetValue ;

        return convertedAmount;

    }

}
