public class LogMessage
   {
   private String machineID;
   private String description;
   
   public LogMessage( String message )
      {
      machineID=message.substring(0,message.indexOf(":"));
      description=message.substring(message.indexOf(":")+1);
      } // end one-arg constructor
      
   public boolean containsWord( String keyword )
      {
          if (description.indexOf(keyword)==-1)
          return false;
        
          if(description.equals(keyword))
          return true;
          
          if(description.indexOf(keyword)==0&&description.charAt(keyword.length())==' ')
          return true;
          
          if(description.substring(description.length()-keyword.length()).equals(keyword)&&description.charAt(description.length()-keyword.length()-1)==' ')
          return true;
          
         // if(description.length()>=keyword.length()+2)
         // {
          for (int i=1;i<description.length()-keyword.length();i++)
          {
              if(description.substring(i,i+keyword.length()).equals(keyword)&&description.charAt(i-1)==' '&&description.charAt(i+keyword.length())==' ')
              return true;
          }
        //}
          return false;
        }
   public String getMachineID()
      {
         return machineID;    
      } // end method getMachineID
      
   public String getDescription()
      {
         return description;    
      } // end method getDescription
       
       
   } // end class LogMessage