import javax.swing.JOptionPane;
public class Student1Driver
{
    public static void main(String[] args)
    {
           Student1 senior001= new Student1();
           Student1 frosh001= new Student1("Peanut","Butter","chemistry",2.0);
           JOptionPane.showMessageDialog(null,senior001.toString(),"senior001",JOptionPane.PLAIN_MESSAGE);
           JOptionPane.showMessageDialog(null,frosh001.toString(),"frosh001",JOptionPane.PLAIN_MESSAGE);
    }
}
