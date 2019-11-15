public class SongDriver{
    public static void main (String[] args)
    {
        Song wakeUpSong =new Song();
        Song goToSleepSong=new Song("ABC","Mozart",100, 0.05);
        //end initializing
        
        System.out.println(wakeUpSong.toString());
        System.out.println(goToSleepSong.toString());
        //end toString 
    }
}
