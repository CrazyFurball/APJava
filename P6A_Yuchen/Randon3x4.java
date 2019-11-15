
public class Randon3x4
{   public static void main (String[] args)
    {
        int[][] num=new int[3][4];
        
        for(int i=0;i<num.length;i++)
        {
            for(int j=0;j<num[0].length;j++)
            {
                num[i][j]=(int)(Math.random()*10);
                System.out.print(num[i][j]+"\t");
            }
            System.out.println();
        }
        
        for(int i=0;i<num.length;i++)
        {
            for(int j=0;j<num[0].length;j++)
            {
                if(num[i][j]==5)
                System.out.println("found 5 at row "+i+" colum "+j);
            }
        }
       
    }
}
