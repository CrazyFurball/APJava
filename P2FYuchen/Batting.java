/*P2F. Write a program that creates an array that can hold 9 double values that represent baseball batting averages for a starting baseball lineup. Once you have created the array, complete the following tasks.

 Use a for loop to populate array with double values in the range of 0.00 to 0.500.
 Use a second for loop to print the values in the array on one line with each value separated by two spaces.
 Mistake in batting averages! It was found that each batting average was 0.02 less than it was supposed to be. Use a third for loop to traverse the array and add 0.02 to each batting average in the array. Be sure to actually change the value in the array as opposed to printing out the value and adding 0.02 to array value.
 Use a fourth for loop to print the correctly adjusted batting averages on one line with each value separated by two spaces
 Use a fifth for loop to print the array of batting averages in reverse order on one line with each value separated by two spaces.
f. Finally, find and print the maximum batting average in the array.

Hand in BlueJ zip file

Previous Next
*/
public class Batting
{
    
    public static void main(String[] args)  
    {
        double[] battingAvr=new double[9];
        
        //assign values 
        for(int i=0;i<battingAvr.length;i++)
        {
            battingAvr[i]=Math.random()*0.5;
            
        } 
        
        //print values
        for(int i=0;i<battingAvr.length;i++)
        {
            String a = String.format( "%.3f " , battingAvr[i] );
            System.out.print( a+"  " );
        }
        
        //correction - add 0.02
        for(int i=0;i<battingAvr.length;i++)
        {
            battingAvr[i]+=0.02;
        }
        
        //print corrected values
        System.out.println();
        for(int i=0;i<battingAvr.length;i++)
        {
            String a = String.format( "%.3f " , battingAvr[i] );
            System.out.print( a+"  " );
        }
        
        //print in reverse sequence
        System.out.println();
        for(int i=battingAvr.length-1; i>=0; i--)
        {
            String a = String.format( "%.3f " , battingAvr[i] );
            System.out.print( a+"  " );
        }
        
        double max=0;
        double min=1;
        for(int i=0;i<battingAvr.length;i++)
        {
            if(battingAvr[i]>max)
            max=battingAvr[i];
            if(battingAvr[i]<min)
            min=battingAvr[i];
        }
        System.out.println();
        System.out.print("max="+max+"  min="+min);
    }
}