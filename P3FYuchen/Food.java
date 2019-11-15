
public class Food
{
   
    public static void main(String[]args)
    {
         String food1="pancake";
         String food2="oyster";
         String food3="coffee";
         
         System.out.println( food1.compareTo( food2 ));
         System.out.println( food1.compareTo( food3 ));
         System.out.println( food2.compareTo( food1 ));
         System.out.println( food2.compareTo( food3 ));
         System.out.println( food3.compareTo( food1 ));
         System.out.println( food3.compareTo( food2 ));
       
         /*it takes the first alphabet in the 2 words that are DIFFERENT and 
         subtracts the index of the alphabet from parameter from the 
         index of the alphabet prom the string, and returns the value
         if the strings are the same, it returns 0.
         */
         
         System.out.println( food1.substring(1,7));
         /*retruns a string starting(inclusive) from the index of the first argument, and ends 
         before the index of the second argument. If the second argument is larger than the length 
         of the string,returns the full string.
         */
         System.out.println( food1.substring(2));
         //returns a string starting from the index of the argument(inclusice) to the end of the string.
         System.out.println( food3.indexOf( "a" ));
         //searches for the first time the argument appearing in the string, and returns the index 
         //if the argument doesn't appear int the string, returns 1.
    }
}
