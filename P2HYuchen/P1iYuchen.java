import javax.swing.JOptionPane;
import javax.swing.JFrame;
public class P1iYuchen
{
    public static void main(String[]args)
    {
        JFrame frame = new JFrame("this is the frame");
        
        int trial=0;
        while(trial<3)
        {
         String inputName = JOptionPane.showInputDialog("Input your username");
         String inputPassword= JOptionPane.showInputDialog("Input you password");
         String username = new String("name");
         String password = "1234567890";
        
        if(inputName==null||inputPassword==null)
        return; 
        
         if(inputName.equals(username)&&inputPassword.equals(password))
         {
             JOptionPane.showMessageDialog(frame, "Welcome, " + username+"!");
             trial=3;
         }
         else if (trial ==2)
            { JOptionPane.showMessageDialog(frame, "You have exceeded your three attempts.Please try again next period.");
             trial+=1;
            }
        else
         {            
             JOptionPane.showMessageDialog(frame, "Wrong password. Try again");
             trial+=1;
         }
        }
        
    }
}
