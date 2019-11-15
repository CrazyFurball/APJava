public class SongDriver{
    public static void main (String[] args)
    {
        
        Song mySong=new Song("ABC","Mozart",100, 0.05,395);
        //end initializing
        
        System.out.println(mySong.getLengthInSecs());
        System.out.println();
        mySong.setLengthInSecs(315);
        System.out.println(mySong.getLengthInSecs()); 
        System.out.println(mySong.toString());
        System.out.println(mySong.getMinutes());
        System.out.println(mySong.getSeconds());
    }
}
