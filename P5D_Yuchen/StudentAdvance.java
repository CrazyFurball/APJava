public class StudentAdvance extends Advance
   {
       public StudentAdvance(int iDays)
       {
           super(iDays);
        }
       
       public double getPrice()
       {
           return super.getPrice()/2;
       }
       
       public String toString()
       {
           return super.toString()+"\n(student ID required)";
       }
   } // end class StudentAdvance
