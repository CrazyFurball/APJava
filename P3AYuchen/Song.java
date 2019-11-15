
public class Song
{
    // instance variables - replace the example below with your own
    private String name;
    private String artist;
    private double length;
    //first 3 variables 
    private double cost;
    //added variable
    private int lengthInSecs;
   
    public Song(String iName ,String iArtist, double iLength, double iCost, int iLIS)
    {
        name=iName;
        artist=iArtist;
        length=iLength;
        cost=iCost;
        lengthInSecs=iLIS;
    }//end 3 argument constructor
    
    public Song()
    {
        name=null;
        artist=null;
        length=0;
        cost=0;
        lengthInSecs=0;
    }//end 0 argument constructor

    public String toString()
    {
        String na= "The song name is "+name;
        String ar= "The artist is "+artist;
        String le= "The length of the song is "+length+" seconds.";
        String co= "The cost of the song is "+cost+" dollars.";
        String lIS= "The length of the song in seconds is "+lengthInSecs;
        return na+"\n"+ar+"\n"+le+"\n"+co+"\n"+lIS+"\n"+convertToMinSec();
    }//end toString
    
    
    // length in seconds setter
    public void setLengthInSecs(int iLengthInSecs)
    {
        lengthInSecs=iLengthInSecs;
    }
    
    //length in secons getter
    public int getLengthInSecs()
    {
        return lengthInSecs;
    }
    
    //convert min to sec
    public String convertToMinSec()
    {
        int min=lengthInSecs/60;
        int sec=lengthInSecs%60;
        return "The length of the song is: "+min+" minuts and "+sec+" seconds.";
          
    }
    
    //get minutes
    public int getMinutes()
    {
        return lengthInSecs/60;
    }
    
    //get seconds
    public int getSeconds()
    {
        return lengthInSecs%60;
    }
}
