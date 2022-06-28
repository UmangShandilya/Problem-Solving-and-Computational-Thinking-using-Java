import java.util.Scanner;
public class MedicineTracker
{
    public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in);
      MedicineTracker call = new MedicineTracker();
      System.out.println("MEDICINE TRACKER");
      System.out.println("Welcome to your personal Medicine Tracker");
      System.out.println("Enter \n 1 : Sunday \n 2 : Monday \n 3 : Tuesday \n 4 : Wednesday \n 5 : Thursday \n 6 : Friday \n 7 : Saturday");
      System.out.print("Please enter the last day you took your prescribed medicine. Enter a number from above list : ");
      int lastDay = scan.nextInt();
      System.out.print("Please enter your dose cycle : ");
      int doseCycle = scan.nextInt();
      String nextDose = call.dayPrediction(lastDay,doseCycle);
      System.out.println("Your next dose is scheduled on : " + nextDose);
    }

    //The method below predicts the day on which next dose is to be taken.
    public String dayPrediction(int lastDay, int doseCycle)
    {
        String dayOfTheWeek = "";
        int upcomingDose = (lastDay + doseCycle) % 7;
        System.out.println(upcomingDose);
        String[] daysInAWeek = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        if(upcomingDose == 0)
        {
            dayOfTheWeek = daysInAWeek[0];
        }
        else
        {
            for(int i = 0; i != upcomingDose; i++)
            {
                dayOfTheWeek = daysInAWeek[i];
            }
        }

        return dayOfTheWeek;
    }
}
