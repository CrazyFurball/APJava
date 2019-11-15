import javax.swing.JOptionPane;

public class MultiplicationTable
{
    public static void mian (String[] args)
    {
        int rows =Integer.parseInt(JOptionPane.showInputDialog("input the number of rows"));
        int cols =Integer.parseInt(JOptionPane.showInputDialog("input the number of colums"));
        int[][] nums= new int[rows+1][cols+1];
        for( int row=1;row<=rows;row++)
        {
            for (int col=1;col<=cols;col++)
            {
                nums[row][col]=row*col;
                nums[0][col]=col;
                nums[row][0]=row;
            }
        }
    
        for(int[] i:nums)
        {
            for(int j:i)
            {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}
