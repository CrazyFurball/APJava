
public class OnePunchMan extends Superhero
{
    private int strength;
    private int hair;

    /**
     * Constructor for objects of class ScreenProtector
     */
    public OnePunchMan( String initialName, int iHair)
    {
        super(initialName);
        hair=iHair;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void becomeStronger(int num)
    {
        if(hair>0)
        {
            strength+=num;
            hair-=num;
        }
        
        else strength=Integer.MAX_VALUE;
    }
    
    
    public String getMotto()
    {
       return "A hero out of interest.";
    }
}
