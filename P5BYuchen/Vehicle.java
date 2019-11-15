
public abstract class Vehicle implements Transportation
{
    private String model;
    private String price;
    
    
    /**
     * Constructor for objects of class Vehicle
     */
    public Vehicle(String iBrand, String iPrice)
    {
        model =iBrand;
        price=iPrice;
    }

    public abstract double getTime();
    public abstract double getCost();
    public String getModel()
    {
        return model;
    }
    public String getPrice()
    {
        return price;
    }
    
}
