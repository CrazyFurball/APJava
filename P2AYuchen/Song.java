
public class Song
{
    // instance variables - replace the example below with your own
    private String name;
    private String artist;
    private double length;
    //first 3 variables 
    private double cost;
    //added variable
   
    public Song(String na ,String ar, double le, double co)
    {
        name=na;
        artist=ar;
        length=le;
        cost= co;
    }//end 3 argument constructor
    
    public Song()
    {
        name=null;
        artist=null;
        length=0;
        cost=0;
    }//end 0 argument constructor

    public String toString()
    {
        String na= "The song name is "+name;
        String ar= "The artist is "+artist;
        String le= "The length of the song is "+length+" seconds.";
        String co= "The cost of the song is "+cost+" dollars.";
        return na+"\n"+ar+"\n"+le+"\n"+co;
    }//end toString
}
