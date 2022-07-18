import java.util.Scanner;
public class LukxtechMotos
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to LUKXTECH MOTORS");
        System.out.println("SNo.    ENGINE TYPE");
        System.out.println("-------------------");
        System.out.println("1       Petrol Engine");
        System.out.println("2       Diesel Engine");
        System.out.println("3       CNG Engine");
        System.out.println("4       Electric Engine");
        System.out.print("Please choose the relevant number corresponding to engine type : ");
        int engineChoice = scan.nextInt();
        switch(engineChoice)
        {
            case 1:
            {
                String[] modelNumber = {"P1000", "P1500", "P2000", "P2400"};
                int[] pistonDisplacement = {996, 1498, 1992, 2396};
                int[] maxPower = {50, 88, 118, 138};
                int[] maxRPM = {6000, 6500, 6500, 6900};
                int[] maxTorque = {90, 155, 220, 340};
                int[] weightOfEngine = {75, 93, 125, 140};
                int[] cylinders = {3, 4, 4, 6};
                String[] compressionRatio = {"11.0:1", "10.3:1", "12.0:1", "10.5:1"};
                PetrolEngine petrolEngine = new PetrolEngine(modelNumber, pistonDisplacement, maxPower, maxRPM, maxTorque, weightOfEngine, cylinders, compressionRatio);
                petrolEngine.showSpecs();
                break;
            }
            case 2:
            {
                String[] modelNumber = {"D1300", "D1800", "D2400"};
                int[] pistonDisplacement = {1248, 1796, 2384};
                int[] maxPower = {67, 103, 136};
                int[] maxRPM = {6000, 6300, 7000};
                int[] maxTorque = {200, 170, 233};
                int[] weightOfEngine = {111, 141, 152};
                int[] cylinders = {4, 4, 4};
                String[] compressionRatio = {"17.6:1", "10.5:1", "11.2:1"};
                DieselEngine dieselEngine = new DieselEngine(modelNumber, pistonDisplacement, maxPower, maxRPM, maxTorque, weightOfEngine, cylinders, compressionRatio);
                dieselEngine.showSpecs();
                break;
            }
            case 3:
            {
                String[] modelNumber = {"C1000", "C1500"};
                int[] pistonDisplacement = {998, 1498};
                int[] maxPower = {43,69};
                int[] maxRPM = {6000, 6500};
                int[] maxTorque = {78, 122};
                int[] weightOfEngine = {75, 93};
                int[] cylinders = {3, 4};
                String[] compressionRatio = {"11.0:1", "10.5:1"};
                CNGEngine cngEngine = new CNGEngine(modelNumber, pistonDisplacement, maxPower, maxRPM, maxTorque, weightOfEngine, cylinders, compressionRatio);
                cngEngine.showSpecs();
                break;
            }
            case 4:
            {
                String[] modelNumber = {"88"};
                int[] maxPower = {88};
                int[] maxRPM = {15000};
                int[] maxTorque = {220};
                int[] weightOfEngine = {45};
                String[] currentType = {"AC"};
                int[] voltage = {360};
                ElectricEngine electricEngine = new ElectricEngine(modelNumber, maxPower, maxRPM, maxTorque, weightOfEngine, currentType,voltage);
                electricEngine.showSpecs();
                break;
            }
            default:
                System.out.println("Invalid Choice");
        }
        LukxtechMotorsTransmission callTransmission = new LukxtechMotorsTransmission();
        callTransmission.transmissionDetails();

    }
}
