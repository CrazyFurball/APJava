public class PhoneDriver
{
    public static void main (String[] args)
    {
        Phone myPhone=new Phone("red",32);
        System.out.println(myPhone);
        
        myPhone.deleteAllSongs();
        System.out.println();
        System.out.println("After deleting all songs:");
        System.out.println(myPhone);
    }
}
