
public class Student1
{   //class called Student1 because there is a Student class in Book class.
    private String firstName;
    private String lastName;
    private String favSubject;

    //end instance variables
    private double[] grades;
    //English;Math;Science;Fine Arts;Social Science
    
    // 0-argument constructor
    public Student1()
    {
      firstName=null;
      lastName=null;
      favSubject=null;
      
      grades=new double[5];
      grades[0]=0;
      grades[1]=0;
      grades[2]=0;
      grades[3]=0;
      grades[4]=0;
    }
    
    
    // multi-argument constructor
    public Student1(String fstN,String lstN,String favSub, 
    double englighGrade, double mathGrade, double scienceGrade, double artGrade, double socialGrade)
    {
      firstName=fstN;
      lastName=lstN;
      favSubject=favSub;
   
      grades=new double[5];
      grades[0]=englighGrade;
      grades[1]=mathGrade;
      grades[2]=scienceGrade;
      grades[3]=artGrade;
      grades[4]=socialGrade;
    }

    //calculate average GPA
    public double calcGPA()
    {
        double sum=0;
        for(int i=0; i<grades.length; i++)
        {
            if(grades[i]!=0)
            sum+=grades[i];
        }
        return sum/grades.length;
    }
    
    //get math gpa
    public double getMath()
    {
        return grades[1];
    }
    
    //set math gpa
    public void setMath( double mathGrade)
    {
        grades[1]=mathGrade;
    }
    
    //toString
    public String toString()
    {
        return  "The name is "+firstName+" "+lastName+".\n"
               +"The favourite subject is "+favSubject+".\n"
               +"The GPA is "+ calcGPA()+".";
    }
}
