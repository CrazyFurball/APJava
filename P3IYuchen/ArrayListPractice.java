import java.util.List;
import java.util.ArrayList;

public class ArrayListPractice
{
   public static void main (String[] args)
   {
       List<String> characters=new ArrayList<String>();
       
       characters.add("asfef");
       characters.add("qtrfvds");
       characters.add(null);
       characters.add("adfs34");
       characters.add("jhdga");
       
       
       
       //print the list 
       System.out.println(characters);
       for(int i=0; i<characters.size();i++)
       {
           if(characters.get(i)!=null)
           {
           System.out.println(i+" = "+characters.get(i));
          }
        }
       System.out.println(characters);
        
        //add character
       characters.add(2,"wandering jew");
       
       //print again 
       for(int i=0; i<characters.size();i++)
       {
           if(characters.get(i)!=null)
           {
           System.out.println(i+" = "+characters.get(i));
          }
        }
       //for each loop
       for(String cha:characters)
       {
           System.out.println(cha);  
        }
        
        //remove one 
        characters.remove(4);
   }
}
