
public class Pigeons extends Superhero
{
    
    private int daysTillRelease;

    public Pigeons( String initialName, int days)
    {
        super(initialName);
        daysTillRelease=days;
    }

    public void releaseThePigeons()
    {
        daysTillRelease+=365;
    }
    
    public String getMotto()
    {
        return "Gugugugugugugugugugugugugugugugugu";
    }
}
