
public class Phone
{
    private String color;
    private int memory;
    private Song[] songList;
    
    public Phone( String iColor, int iMemory)
    {
        color=iColor;
        memory=iMemory;
        songList=new Song[4];
        songList[0]=new Song("Epilogue", "*Luna", 1, 240);
        songList[1]=new Song("Fixer", "Nuluz", 1, 244);
        songList[2]=new Song("Dramaturgy", "Eve", 1, 245);
        songList[3]=new Song("ThInk", "Kevinz", 1, 249);
        
        
    }
    
    public int totalPlayTime()
    {
        int totalTime=0;
        for( Song mySong:songList)
        {
            if(mySong!=null)
            totalTime+= mySong.getLengthInSecs();
            
        }
        return totalTime;
    }
    
    public void deleteAllSongs()
    {
        for (int i=0;i<songList.length;i++)
        {
            songList[i]=null;
        }
    }
    
    public String toString()
    {
        String songs=new String();
        for (int i=0;i<songList.length;i++)
        {
            if(songList[i]!=null)
            songs+=songList[i].toString();
        }
        return "color: "+color+"\n"+"memory: "+memory+"\n"+"songs: "+songs;       
    }
}
