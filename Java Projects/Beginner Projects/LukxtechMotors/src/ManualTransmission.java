import java.util.Scanner;

public class ManualTransmission extends Transmission
{
    //Initialising constructor
    public ManualTransmission()
    {
        super();
    }

    //Displays Manual Transmission and returns the choice of user.
    public void displayManualTransmissionMenu()
    {

        System.out.println("MANUAL TRANSMISSION");
        System.out.println("SNo.    Model Number");
        System.out.println("--------------------");
        System.out.println("1       MP4");
        System.out.println("2       MP5");
        System.out.println("3       MP6");
        System.out.println("4       MD5");
        System.out.println("5       MD6");
        System.out.println();
        manualTransmissionDetails();
    }

    //Using user choice to display transmission details.
    public void manualTransmissionDetails()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please choose the number corresponding to the type of transmission to view its specification : ");
        int transmissionChoice = scan.nextInt();
        if(transmissionChoice < 1 || transmissionChoice > 5)
        {
            System.out.println("Invalid Choice");
            System.out.print("Please choose the number corresponding to the type of transmission to view its specification : ");
            transmissionChoice = scan.nextInt();
        }
        switch(transmissionChoice)
        {
            case 1:
            {
                Transmission MP4 = new Transmission();
                MP4.showSpecs("Manual","MP4","4", 2.540,1.920,1.510,1.000);
                break;
            }
            case 2:
            {
                Transmission MP5 = new Transmission();
                MP5.showSpecs("Manual","MP5","5", 3.545,1.904,1.280,0.914, 0.757);
                break;
            }
            case 3:
            {
                Transmission MP6 = new Transmission();
                MP6.showSpecs("Manual","MP6","6", 3.010,2.070,1.430,1.000, 0.710, 0.570);
                break;
            }
            case 4:
            {
                Transmission MD5 = new Transmission();
                MD5.showSpecs("Manual","MD5","5", 3.545,1.904,1.233,0.911, 0.725);
                break;
            }
            case 5:
            {
                Transmission MD6 = new Transmission();
                MD6.showSpecs("Manual","MD6","6", 3.640,2.150,1.360,1.000, 0.750, 0.630);
                break;
            }
        }
    }

}
