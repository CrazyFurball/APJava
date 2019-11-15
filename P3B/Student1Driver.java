import javax.swing.JOptionPane;
public class Student1Driver
{
    public static void main(String[] args)
    {
           Student1 senior001= new Student1();
           Student1 frosh001= new Student1("Peanut","Butter","chemistry",1,2,1,1,0);
           Student1 senior002= new Student1("Joe","Senior","none",3.0,3.0,3.5,4.0,4.0);
        // JOptionPane.showMessageDialog(null,senior001.toString(),"senior001",JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null,frosh001.toString(),"frosh001",JOptionPane.PLAIN_MESSAGE);
        
        
        System.out.println(senior002.toString());
        senior002.setMath(4.0);
        System.out.println("math grade: "+senior002.getMath());
        System.out.println("GPA: "+senior002.calcGPA());
        System.out.println(senior002.toString());
        
    }
}
