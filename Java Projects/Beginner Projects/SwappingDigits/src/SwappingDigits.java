import java.util.Scanner;
public class SwappingDigits
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number whose digits are needed to be swapped : ");
        int number = sc.nextInt(); //Getting input from the user.
        System.out.println("The entered number is : " + number);
        int numberPosition = 1;
        int swappedNumber = 0;
        while(number > 0)
        {
            int digit1 = number%10;
            number = number/10;
            if(number == 0)
            {
                swappedNumber += digit1*numberPosition;
                break;
            }
            int digit2 = number%10;
            number = number/10;
            swappedNumber += (digit1*10*numberPosition+(digit2*numberPosition));
            numberPosition *= 100;
        }
        System.out.println("The swapped number is : "+swappedNumber);
    }
}
