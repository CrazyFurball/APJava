import java.util.List;
import java.util.ArrayList;
public class FoodList
{
    public static void main (String[] args)
    {
        List<String> foodList= new ArrayList<String>();
        foodList.add("asfdwegq");
        foodList.add("sdfsg");
        foodList.add("aqyqer");
        foodList.add("dsa");
        foodList.add("trjsj");
        foodList.add("pizza");
        foodList.add("fries");
        
        //print the list 
        System.out.println("foodList: ");
        for (int i=0; i<foodList.size();i++)
        {
            System.out.println(foodList.get(i));
        }
        
        //remove length==5
        for (int i=0; i<foodList.size();i++)
        {
            if(foodList.get(i).length()==5)
            {
                foodList.remove(i);
                i--;
            }
        }
        
        //print again 
        System.out.println("after removing: ");
        for (int i=0; i<foodList.size();i++)
        {
            System.out.println(foodList.get(i));
        }
    }
}
