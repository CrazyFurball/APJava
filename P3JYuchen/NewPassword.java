import javax.swing.JOptionPane;
public class NewPassword
{
    public static void main(String[] args)
    {
        String password=JOptionPane.showInputDialog("Enter your new password");
        
        
        boolean valid =false;
        for(char ch:password.toCharArray())
        {
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='@' )
            {
                valid=true;
            }
        }
        
        
        if(valid)
        JOptionPane.showMessageDialog(null,"The password is valid");
        
        if(!valid)
        JOptionPane.showMessageDialog(null,"The password is rejected");
        
    }
}
