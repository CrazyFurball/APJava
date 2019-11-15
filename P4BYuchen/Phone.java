import java.util.List;
import java.util.ArrayList;
public class Phone
{
    private String color;
    private int memory;
    private List<Song> songList;
    
    public Phone( String iColor, int iMemory)
    {
        color=iColor;
        memory=iMemory;
        songList=new ArrayList<Song>();
        songList.add(new Song("Epilogue", "*Luna", 1, 240));
        songList.add(new Song("Fixer", "Nuluz", 1, 244));
        songList.add(new Song("Dramaturgy", "Eve", 1, 245));
        songList.add(new Song("ThInk", "Kevinz", 1, 249));
        
        
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
        for (int i=0;i<songList.size();i++)
        {
            songList.set(i,null);
        }
    }
    
    public String toString()
    {
        String songs=new String();
        for (int i=0;i<songList.size();i++)
        {
            if(songList.get(i)!=null)
            songs+=songList.get(i);
        }
        return "color: "+color+"\n"+"memory: "+memory+"\n"+"songs: "+songs;       
    }
    
    public void addSong(Song iSong)
    {
        songList.add(19,iSong);
        
    }
}
