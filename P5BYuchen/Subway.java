
public class Subway implements Transportation
{
    private int line;
    
    public Subway(int iLine)
    {
        line=iLine;
    }

    //distance as the stops you take
    public double getTime(double distance)
    {
        return (int)distance*3;
    }
    
    public double getCost(double distance)
    {
        if(distance<3)
        return 5;
        
        return (int)(distance-3)+5;
    }
}
