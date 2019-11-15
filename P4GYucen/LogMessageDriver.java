import java.util.List;
import java.util.ArrayList;
public class LogMessageDriver
   {
   public static void main( String[] args )
      {
      List<LogMessage> myList=new ArrayList<LogMessage>();
      
      myList.add(new LogMessage( "Webserver:disk offline"));
      myList.add(new LogMessage( "Webserver:1disk disk offline"));
      myList.add(new LogMessage( "Webserver: offline disk"));
      myList.add(new LogMessage( "Webserver:1disk"));
      myList.add(new LogMessage( "Webserver:  1disk   offline"));
      myList.add(new LogMessage( "Webserver: disk1"));
      
      for (int i=0;i<myList.size();i++)
      {
          
      System.out.println( myList.get(i).getMachineID() );
      System.out.println( myList.get(i).getDescription() );
      
      System.out.println( myList.get(i).containsWord("disk"));
         
      } // end method main
 
     }
   } // end class LogMessageDriver