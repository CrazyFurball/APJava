public class P1fYuchen
{
    public static void main (String[] args)
    {
        int nums[]=new int[10];
        int sum=0;
        //end declearing;
        for(int i=0; i<nums.length; i++)
        {
            nums[i]=(int)(Math.random()*101);
            System.out.print(nums[i]+" ");
            sum+=nums[i];
        }
        //end printing
        
        System.out.println();
        System.out.println("The sum is "+sum+".");
        //end sum
        
        for(int i=nums.length-1; i>=0;i--)
        {
            System.out.print(nums[i]+" ");
        }
        //end reverse printing
    }
}