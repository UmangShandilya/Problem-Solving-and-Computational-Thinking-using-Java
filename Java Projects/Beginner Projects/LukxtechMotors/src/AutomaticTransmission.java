import java.util.Scanner;

public class AutomaticTransmission extends Transmission
{
    //Initialising constructor
    public AutomaticTransmission()
    {
        super();
    }

    //Displays Automatic Transmission and returns the choice of user.
    public void displayAutomaticTransmissionMenu()
    {

        System.out.println("AUTOMATIC TRANSMISSION");
        System.out.println("SNo.      Model Number");
        System.out.println("-----------------------");
        System.out.println("1       AMTP4");
        System.out.println("2       AMTD5");
        System.out.println("3       Automatic - CVT");
        System.out.println("4       Automatic - DCT");
        System.out.println();
        automaticTransmissionDetails();
    }

    //Using user choice to display transmission details.
    public void automaticTransmissionDetails()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please choose the number corresponding to the type of transmission to view its specification : ");
        int transmissionChoice = scan.nextInt();
        if(transmissionChoice < 1 || transmissionChoice > 4)
        {
            System.out.println("Invalid Choice");
            System.out.print("Please choose the number corresponding to the type of transmission to view its specification : ");
            transmissionChoice = scan.nextInt();
        }
        switch(transmissionChoice)
        {
            case 1:
            {
                Transmission AMTP4 = new Transmission();
                AMTP4.showSpecs("Automatic","AMTP4","4", 2.540,1.920,1.510,1.000);
                break;
            }
            case 2:
            {
                Transmission AMTD5 = new Transmission();
                AMTD5.showSpecs("Automatic","AMTD5","5", 2.950,1.940,1.340,1.000, 0.630);
                break;
            }
            case 3:
            {
                Transmission CVT6 = new Transmission();
                CVT6.showSpecs("Automatic - CVT","CVT6","6 (Simulated)", 2.631, 1.440, 1.165, 0.906, 0.680, 0.499);
                break;
            }
            case 4:
            {
                Transmission DCT8 = new Transmission();
                DCT8.showSpecs("Automatic - DCT","DCT8","8 (Simulated)", 4.714, 3.143, 2.106, 1.667, 1.285, 1.000, 0.839, 0.667);
                break;
            }

        }
    }
}
