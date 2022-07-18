public class ElectricEngine extends Engines
{
    private int[] volatge;
    private String[] currentType;

    //Initialising parameterised constructor;
    public ElectricEngine(String[]modelNumber, int[]maxPower, int[]maxRPM, int[]maxTorque, int[]weightOfEngine, String[]currentType, int[]voltage)
    {
        super(modelNumber, maxPower, maxRPM, maxTorque, weightOfEngine);
        this.currentType = currentType;
        this.volatge = voltage;
    }

    //Displaying specs as specified.
    public void showSpecs()
    {
        for (int i = 0; i < volatge.length; i++)
        {
            System.out.println("Engine Type : Electric Engine \n" + "Power Source : Electric Battery \n" + "Engine Model number : " + super.modelNumber[i]);
            System.out.println();
        }
    }
}
