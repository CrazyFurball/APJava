public class Advance extends Ticket
   {
       private int days;
       
       public Advance (int iDays)
       {
           super();
           days=iDays;
       }
       
       public double getPrice()
       {
           if(days>=10)
           return 30;
           return 40;
       }
     
       
   } // end class Advance