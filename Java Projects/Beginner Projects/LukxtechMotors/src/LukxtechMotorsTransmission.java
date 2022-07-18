import java.util.Scanner;
public class LukxtechMotorsTransmission
{
    public void transmissionDetails()
    {
        Scanner scan = new Scanner(System.in);
        LukxtechMotorsTransmission call = new LukxtechMotorsTransmission();
        System.out.println("Welcome to transmission choice of LUKXTECH MOTORS");
        int userChoice = call.displayTransmissionMenu();
        if(userChoice < 1 || userChoice > 2)
        {
            System.out.println("Invalid choice");
            System.out.println("Welcome to transmission choice of LUKXTECH MOTORS");
            userChoice = call.displayTransmissionMenu();
        }
        int manualTransmissionChoice = 0;
        int automaticTransmissionChoice =0;

        //On the basis of user choice, directing towards respective menus.
        if(userChoice == 1)
        {
            ManualTransmission callManualTransmission = new ManualTransmission();
            callManualTransmission.displayManualTransmissionMenu();
        }
        else if(userChoice == 2)
        {
            AutomaticTransmission callAutomaticTransmission = new AutomaticTransmission();
            callAutomaticTransmission.displayAutomaticTransmissionMenu();
        }


    }

    //Displays Transmission types and returns the choice of user.
    public int displayTransmissionMenu()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("TRANSMISSION");
        System.out.println("SNo.    Transmission Type");
        System.out.println("--------------------------");
        System.out.println("1       Manual Transmission");
        System.out.println("2       Automatic Transmission");
        System.out.println();
        System.out.print("Please choose the number corresponding to the type of transmission : ");
        return scan.nextInt();
    }






}
