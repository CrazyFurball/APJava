
public class ArrayTraverse
{
   
    public static void main(String[] args)
    {
        int[] nums={-9,2,3,4,7,9,10,23,45,67};
       
        
        //looking for 9
        int index=0;
        boolean isThere=false;
        for(int i:nums)
        {
            if(i==9)
            {
                System.out.println("The index of 9 is "+ index);
                isThere=true;
            }
            index++;
        }
        if(isThere==false)
        {
            System.out.println("-1");
        }
    }
}
