public class Transmission
{
    String transmissionType;
    String modelNumber;
    String forwardGears;
    double firstGearRatio;
    double secondGearRatio;
    double thirdGearRatio;
    double fourthGearRatio;
    double fifthGearRatio;
    double sixthGearRatio;
    double seventhGearRatio;
    double eighthGearRatio;

    //Initialising parameterised constructor.
    public Transmission()
    {
    }

    //Displaying specifications using polymorphism.
    public void showSpecs(String transmissionType,String modelNumber,String forwardGears, double firstGearRatio, double secondGearRatio,
                          double thirdGearRatio, double fourthGearRatio)
    {
        this.transmissionType = transmissionType;
        this.modelNumber = modelNumber;
        this.forwardGears = forwardGears;
        this.firstGearRatio = firstGearRatio;
        this.secondGearRatio = secondGearRatio;
        this.thirdGearRatio = thirdGearRatio;
        this.fourthGearRatio = fourthGearRatio;
        System.out.println("Transmission Type         : " + this.transmissionType);
        System.out.println("Transmission Model Number : " + this.modelNumber);
        System.out.println();
        System.out.println("Key Specifications: ");
        System.out.println("1    Forward Gears        " + this.forwardGears);
        System.out.println("2    First Gear Ratio     " + this.firstGearRatio);
        System.out.println("3    Second Gear Ratio    " + this.secondGearRatio);
        System.out.println("4    Third Gear Ratio     " + this.thirdGearRatio);
        System.out.println("5    Fourth Gear Ratio    " + this.fourthGearRatio);
    }

    public void showSpecs(String transmissionType,String modelNumber,String forwardGears, double firstGearRatio, double secondGearRatio,
                          double thirdGearRatio, double fourthGearRatio, double fifthGearRatio)
    {
        this.transmissionType = transmissionType;
        this.modelNumber = modelNumber;
        this.forwardGears = forwardGears;
        this.firstGearRatio = firstGearRatio;
        this.secondGearRatio = secondGearRatio;
        this.thirdGearRatio = thirdGearRatio;
        this.fourthGearRatio = fourthGearRatio;
        this.fifthGearRatio = fifthGearRatio;
        System.out.println("Transmission Type         : " + this.transmissionType);
        System.out.println("Transmission Model Number : " + this.modelNumber);
        System.out.println();
        System.out.println("Key Specifications: ");
        System.out.println("1    Forward Gears        " + this.forwardGears);
        System.out.println("2    First Gear Ratio     " + this.firstGearRatio);
        System.out.println("3    Second Gear Ratio    " + this.secondGearRatio);
        System.out.println("4    Third Gear Ratio     " + this.thirdGearRatio);
        System.out.println("5    Fourth Gear Ratio    " + this.fourthGearRatio);
        System.out.println("6    Fifth Gear Ratio     " + this.fifthGearRatio);
    }

    public void showSpecs(String transmissionType,String modelNumber,String forwardGears, double firstGearRatio, double secondGearRatio,
                          double thirdGearRatio, double fourthGearRatio, double fifthGearRatio, double sixthGearRatio)
    {
        this.transmissionType = transmissionType;
        this.modelNumber = modelNumber;
        this.forwardGears = forwardGears;
        this.firstGearRatio = firstGearRatio;
        this.secondGearRatio = secondGearRatio;
        this.thirdGearRatio = thirdGearRatio;
        this.fourthGearRatio = fourthGearRatio;
        this.fifthGearRatio = fifthGearRatio;
        this.sixthGearRatio = sixthGearRatio;
        System.out.println("Transmission Type         : " + this.transmissionType);
        System.out.println("Transmission Model Number : " + this.modelNumber);
        System.out.println();
        System.out.println("Key Specifications: ");
        System.out.println("1    Forward Gears        " + this.forwardGears);
        System.out.println("2    First Gear Ratio     " + this.firstGearRatio);
        System.out.println("3    Second Gear Ratio    " + this.secondGearRatio);
        System.out.println("4    Third Gear Ratio     " + this.thirdGearRatio);
        System.out.println("5    Fourth Gear Ratio    " + this.fourthGearRatio);
        System.out.println("6    Fifth Gear Ratio     " + this.fifthGearRatio);
        System.out.println("7    Sixth Gear Ratio     " + this.fifthGearRatio);
    }

    public void showSpecs(String transmissionType,String modelNumber,String forwardGears, double firstGearRatio, double secondGearRatio,
                          double thirdGearRatio, double fourthGearRatio, double fifthGearRatio, double sixthGearRatio,
                          double seventhGearRatio, double eighthGearRatio)
    {
        this.transmissionType = transmissionType;
        this.modelNumber = modelNumber;
        this.forwardGears = forwardGears;
        this.firstGearRatio = firstGearRatio;
        this.secondGearRatio = secondGearRatio;
        this.thirdGearRatio = thirdGearRatio;
        this.fourthGearRatio = fourthGearRatio;
        this.fifthGearRatio = fifthGearRatio;
        this.sixthGearRatio = sixthGearRatio;
        this.seventhGearRatio = seventhGearRatio;
        this.eighthGearRatio = eighthGearRatio;
        System.out.println("Transmission Type         : " + this.transmissionType);
        System.out.println("Transmission Model Number : " + this.modelNumber);
        System.out.println();
        System.out.println("Key Specifications: ");
        System.out.println("1    Forward Gears        " + this.forwardGears);
        System.out.println("2    First Gear Ratio     " + this.firstGearRatio);
        System.out.println("3    Second Gear Ratio    " + this.secondGearRatio);
        System.out.println("4    Third Gear Ratio     " + this.thirdGearRatio);
        System.out.println("5    Fourth Gear Ratio    " + this.fourthGearRatio);
        System.out.println("6    Fifth Gear Ratio     " + this.fifthGearRatio);
        System.out.println("7    Sixth Gear Ratio     " + this.fifthGearRatio);
        System.out.println("8    Seventh Gear Ratio   " + this.fifthGearRatio);
        System.out.println("9    Eighth Gear Ratio    " + this.fifthGearRatio);
    }
}
