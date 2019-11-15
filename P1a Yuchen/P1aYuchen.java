/* Using your first program as a model, write a similar program, “MySecondApp.java”, that prints your “favorites”. Your program should do the following:

create and initialize an int with your favorite integer,
create and initialize a double with your favorite real number,
create and initialize a boolean with your favorite boolean value,
create and initialize a String with your favorite musical group.
 

Print each one of these on a separate line with identifying text.*/
public class P1aYuchen
{
    public static void main (String[]args)
    {
     int myFavInt=6;
     double myFavReal=2.718;
     boolean myFavBool=true;
     String myFavSong=new String("Sand Planet");
     
     System.out.println("My favorite integer is "+myFavInt+".");
     System.out.println("My favorite real number is "+ myFavReal+".");
     System.out.println("My favorite boolean is "+myFavBool+".");
     System.out.println("My favorite song is "+myFavSong+".");
    }
}

