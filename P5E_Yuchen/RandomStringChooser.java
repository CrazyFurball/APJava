import java.util.List;
import java.util.ArrayList;
public class RandomStringChooser
   {
       private List<String> words;
       
       public RandomStringChooser(String[] strs)
       {
           for( int i=0; i<strs.length;i++)
           {
           words.add(strs[i]);
          }
        }
        
        public String getNext()
        {
            
            for( String str:words)
            {
                words.add(str);
           }
           String str;
           if(words.size()>0)
            words.remove(words.get((int)(Math.random()*words.size())));
           return "NONE";
        }
           public String toString()
        
      {
       String output = new String();
      
        for( String word : words )
         {
         output += word + ", ";    
         } // end for
         
      return output;
      }
       // end method toString
   } // end RandomStringChooser