import java.util.List;
import java.util.ArrayList;

public class MultipleGroups implements NumberGroup
   {
   private List<NumberGroup> groupList;
   public MultipleGroups()
   {
       
    }
       
   public boolean contains(int num)
    {
        for(NumberGroup range:groupList)
        {
            if(groupList.contains(num))
            return true;
        }
        return false;
    }
     
   } // end class MulitpleGroups

