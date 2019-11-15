
public class Devilman extends Superhero
{
    

    /**
     * Constructor for objects of class Gothic
     */
    public Devilman( String initialName)
    {
        super(initialName);
    }

    public String getMotto()
    {
        double i=Math.random();
        if(i>=0.5)
        return "kksk";
        else 
        return "kkmsk";
    }
}
