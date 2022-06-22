import java.util.Scanner;
public class DigitalCalendar
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a year to get calendar : "); //Input for value of year.
        int year = sc.nextInt();
        System.out.print("Please enter the month in number from 1 - 12 : "); //Input for the value of month.
        int month = sc.nextInt();
        System.out.print("Please enter the starting day of this month. Choose 1:Mon - 7:Sun : ");
        int startDay = sc.nextInt();
        if(month<1 || month>12 || year<1900)
            System.out.println("Invalid input entered."); //Output for invalid values entered.
        String monthName = null; //Declaration of a variable for month name.
        int monthDays = 0; //Declaration of a variable for number of days in a month.
        switch(month)
        {
            case 1:
                monthName = "January";
                monthDays = 31;
                break;
            case 2:
                monthName = "February";
                if((year%100 != 0 && year%4 ==0) || year%400 == 0)
                    monthDays = 29;
                else
                    monthDays = 28;
                break;
            case 3:
                monthName = "March";
                monthDays = 31;
                break;
            case 4:
                monthName = "April";
                monthDays = 30;
                break;
            case 5:
                monthName = "May";
                monthDays = 31;
                break;
            case 6:
                monthName = "June";
                monthDays = 30;
                break;
            case 7:
                monthName = "July";
                monthDays = 31;
                break;
            case 8:
                monthName = "August";
                monthDays = 31;
                break;
            case 9:
                monthName = "September";
                monthDays = 30;
                break;
            case 10:
                monthName = "October";
                monthDays = 31;
                break;
            case 11:
                monthName = "November";
                monthDays = 30;
                break;
            case 12:
                monthName = "December";
                monthDays = 31;
                break;
            default:
                System.out.println("Invalid input.");
        }
        System.out.println("Month : "+monthName+" Year : "+year); //Displaying the month and year respectively.
        System.out.println("  ---------------------------");
        System.out.println("  Sun Mon Tue Wed Thu Fri Sat"); //Displaying the day name.
        int i = 0;
        for (i = 0; i < startDay; i++)
        System.out.print("    ");
        for (i = 1; i <= monthDays; i++)
        {
            if (i < 10)
            System.out.print("   " + i);
        else
            System.out.print("  " + i);
            if ((i + startDay) % 7 == 0)
            System.out.println();
        }
        System.out.println();




    }
}
