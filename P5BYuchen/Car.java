
public class Car extends Vehicle
{
    
    private double mpg;
    
    
    public Car(String iModel, String iBrand, double iMPG)
    {
         super(iModel, iBrand);
         mpg=iMPG;
    }

    //distance in miles 
    public double getTime(distance)
    {
        return distance/aveSpeed;
    }
    
    public double getCost(distance)
    {
        return distance/mpg*2.5;
    }
}
