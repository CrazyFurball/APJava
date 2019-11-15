public abstract class Ticket
   {
   private static int serialNumber; // unique ticket id number   

   public Ticket()
      {
       serialNumber= getSerialNumber();
      } // end zero-argument constructor Ticket()
      
   // returns the price for this ticket
   public abstract double getPrice();

   public static int getSerialNumber()
   {
     return serialNumber++;
   }
   // returns a string with information about the ticket
   public String toString()
      {
      return "Number: " + serialNumber + "\nPrice: $" + getPrice();  
      } // end method toString
      
   } // end abstract class Ticket