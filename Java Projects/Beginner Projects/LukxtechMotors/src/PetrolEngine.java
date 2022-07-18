public class PetrolEngine extends Engines
{
    private int[] pistonDisplacement;
    private int[] numberOfCylinder;
    private String[] compressionRatio;

    //Initialising parameterised constructor;
    public PetrolEngine(String[]modelNumber, int[]pistonDisplacement, int[]maxPower, int[]maxRPM, int[]maxTorque, int[]weightOfEngine, int[]cylinders, String[]compressionRatio)
    {
        super(modelNumber, maxPower, maxRPM, maxTorque, weightOfEngine);
        this.pistonDisplacement = pistonDisplacement;
        this.numberOfCylinder = cylinders;
        this.compressionRatio = compressionRatio;
    }

    //Displaying specs as specified.
    public void showSpecs()
    {
        for (int i = 0; i < pistonDisplacement.length; i++)
        {
            System.out.println("Engine Type : Petrol Engine \n" + "Power Source : Fuel Type \n" + "Engine Model number : " + super.modelNumber[i]);
            System.out.println();
        }
    }

}
