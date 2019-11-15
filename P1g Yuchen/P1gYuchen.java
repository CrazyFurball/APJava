
public class P1gYuchen
{
    public static void main(String[]args)
    {
        int[] nums=new int[10];
        
        for(int i=0; i<nums.length;i++)
        {
            nums[i]=(int)(Math.random()*201)-100;
        }       
        //end part a 
        
        int i=0;
        while(i<nums.length)
        {
            System.out.println(nums[i]);
            i++;
        }
        //end part b
        
        for(int j=0; j<nums.length;j++)
        {
            nums[j]+=10;
            System.out.print(nums[j]+" ");
        }
        //end part c
        int countPos=0;
        for(int j=0; j<nums.length;j++)
        {
            if(nums[j]>0)
            {
                countPos++;
            }
        }//end part d
        System.out.println();
        System.out.print("There are "+countPos+" positive integers.");
        //end part e
    }
}
