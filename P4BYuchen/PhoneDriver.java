public class PhoneDriver
{
    public static void main (String[] args)
    {
        Phone myPhone=new Phone("red",32);
        System.out.println("total length: "+myPhone.totalPlayTime());
        
        myPhone.deleteAllSongs();
        System.out.println();
        System.out.println("After deleting all songs:");
        System.out.println("total length: "+myPhone.totalPlayTime());
        
        myPhone.addSong(new Song("abc","Mozart",0.01,100));
        System.out.println();
        System.out.println("total length: "+myPhone.totalPlayTime());
    }
}
