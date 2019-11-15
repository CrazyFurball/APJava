
public class Vacation
{
    
    public static void main(String[] args)
    {
        //I don't go on vacations, so these are places to travel.
        String[] vacations= {"Tokyo","Moscow","Xi'an","Jerusalem"};
        
        //1st loop - print out names
        for(int i=0; i<vacations.length; i++)
        {
            System.out.println(vacations[i]);
        }
        
        //2nd loop - print lengths
        for(int i=0; i<vacations.length; i++)
        {
            System.out.println(vacations[i].length());
        }
        
        //find the index of shortest place.
        int indexOfShort=0;
        for(int i=1; i<vacations.length; i++)
        {
            if (vacations[i].length()<vacations[indexOfShort].length())
            indexOfShort=i;
        }
        System.out.println(vacations[indexOfShort]);
        
        //remove one place
        vacations[3]=null;
        
        //3th loop - print names again
        for(int i=0; i<vacations.length; i++)
        {
            System.out.println(vacations[i]);
        }
        
        //4th loop - print lengths again
        for(int i=0; i<vacations.length; i++)
        {
            if(vacations[i]!=null)
            System.out.println(vacations[i].length());
        }
    }
}
