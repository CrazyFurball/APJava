
public class ThreeTimesFive
{
    public static void main(String[] args)
    {
        int[][] num = new int[3][5];
        
        int count=1;
        for(int i=0;i<num.length;i++)
        {
            for(int j=0;j<num[0].length;j++)
            {
                num[i][j]=count;
                count++;
            }
        }
    
 
        for(int[] row : num)
        {
            for(int col:row)
            {
                System.out.print(col);
            }
            System.out.println();
        }
        
        int sumRow=0;
        int totalSum=0;
        for(int i=0;i<num.length;i++)
        {
            sumRow=0;
            for(int j=0;j<num[0].length;j++)
            {
                sumRow+=num[i][j];
            }
            totalSum+=sumRow;
            System.out.println("the sum of the row is "+sumRow);
        }
        
        int sumCol=0;
        for(int j=0;j<num[0].length;j++)
        {
            sumCol=0;
            for(int i=0;i<num.length;i++)
            {
                sumCol+=num[i][j];
            }
            System.out.println("the sum of the colum is "+sumCol);
        }
        
        System.out.println("the total sum is "+totalSum);
}
}
