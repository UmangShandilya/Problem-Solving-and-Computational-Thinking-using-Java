public class Engines
{
    String[] modelNumber;
    int[] maxPower;
    int[] maxRPM;
    int[] maxTorque;
    int[] weightOfEngine;

    //Initialising parameterised constructor.
    public Engines(String[] modelNumber, int[] maxPower,int[]maxRPM, int[]maxTorque, int[]weightOfEngine)
    {
        this.modelNumber = modelNumber;
        this.maxPower = maxPower;
        this.maxRPM = maxRPM;
        this.maxTorque = maxTorque;
        this.weightOfEngine = weightOfEngine;
    }

}
