/**
 * A hidden word is a word that the user will use gueses to find out what it is.
 */
public class HiddenWord
   {
       /**
        * This is the word you need to guess
        */
   private String word;
   
   /**
    * Constructuor that is used for initializing the variables in class HiddenWord.
    */
   public HiddenWord( String initialWord )
      {
      word = new String( initialWord );    
      } // end one-arg constructor
       
      /**
       * Method that takes user input (guess) and returns a String that compares to 
       * the HiddenWord and guess.
       * @param String guess
       * @return String hint string with character where the character exists,
       * a+where the character is in the word, and a * if the character is 
       * not in the word.
       */
   public String getHint( String guess )  
      {
          boolean isThere=false;
          String hint="";
      for(int i=0;i<guess.length();i++)
      {
          if(guess.charAt(i)==word.charAt(i))
          hint+=guess.charAt(i);
          else
          {
              for(int j=0;j<word.length();j++)
              {
                  if(word.charAt(j)==guess.charAt(i))
                  isThere=true;
              }
         
          if(isThere)
              hint+="+";
              else
              hint+="*";
          isThere=false;
        }
      }
      return hint;    
      } // end method getHint
     
      /**
       * Method that prints the HiddenWrod instance variable 
       * @return the word. 
       */
   public String toString()
      {
      return word;   
      } // end method toString
   } // end class HiddenWord