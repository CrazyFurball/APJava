
public class P1dYuchen
{
    public static void main (String[]args)
    {
        int count;
        int square;
        double ran=0;
        //end declearing
        
        for(int i=0;i<10;i++)
        {
            ran=Math.random();
            count=i+1;
            square=count*count;
            System.out.print(count+"\t"+square+"\t");
            System.out.println((int)(ran*(square-count+1))+count);
        }
        //end printing
    }
}
