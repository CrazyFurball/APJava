import java.util.List;
import java.util.ArrayList;
public class Range implements NumberGroup
   {
   private List<Integer> integers;
       
   public Range(int min, int max)
   {
       for(int i=min; i<=max;i++)
       {
           integers.add(i);
       }//this gives nullpointer error and I don't know why...
   }
   
   public boolean contains(int num)
   {
       for(int integer:integers)
           {
               return(integer==num);
           }
       return false;
   } // end class Range
}