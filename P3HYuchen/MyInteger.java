
public class MyInteger
{
   //instance variable
   private int num;
   
   //one arg constructor
   public MyInteger (int iNum)
   {
       num=iNum;
   }
   
   public int calculateSum()
   {
       int sum=0;
       
       /*String x= num+"";
       for(int i=0;i<x.length();i++)
       {
           sum+=Integer.parseInt(x.substring(i,i+1));
       }
       */
       
       int temp=num;
       while(temp !=0)
       {
           sum+=temp%10;
           temp/=10;
        }
      
       return sum;
   }
   
   public String toString()
   {
       return"num: "+num;
   }
}
