
public class Student1
{   //class called Student1 because there is a Student class in Book class.
    private String firstName;
    private String lastName;
    private String favSubject;
    private double GPA;
    //end instance variables
    private double[] grades=new double[5];
    //English;Math;Science;Fine Arts;Social Science
    public Student1()
    {
      firstName=null;
      lastName=null;
      favSubject=null;
      GPA=0;
      grades[0]=0;
      grades[1]=0;
      grades[2]=0;
      grades[3]=0;
      grades[4]=0;
    }//end 0-argument constructor
    
    public Student1(String fstN,String lstN,String favSub,double gpa, 
    double grades0, double grades1, double grades2, double grades3, double grades4)
    {
      firstName=fstN;
      lastName=lstN;
      favSubject=favSub;
      GPA=gpa;
      grades[0]=grades0;
      grades[1]=grades1;
      grades[2]=grades2;
      grades[3]=grades3;
      grades[4]=grades4;
    }//end multi-argument constructor

    public double calcGPA()
    {
        double sum=0;
        for(int i=0; i<grades.length; i++)
        {
            sum+=grades[i];
        }
        return sum/grades.length;
    }
    
    //get math gpa
    public double getMathGpa()
    {
        return grades[1];
    }
    
    //set math gpa
    public void setMathGpa( double mathGrade)
    {
        grades[1]=mathGrade;
    }
    
    public String toString()
    {
        return  "The name is "+firstName+" "+lastName+".\n"
               +"The favourite subject is "+favSubject+".\n"
               +"The GPA is "+GPA+".";
    }
}
