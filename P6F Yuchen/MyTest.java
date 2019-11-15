import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyTest
{
   public static void main(String[] args)
  {
      List<Student> roster = new ArrayList<Student>(); 
      roster.add(new Student("Karen", 3));
      roster.add(new Student("Liz", 1));
      roster.add(new Student("Paul", 4));
      roster.add(new Student("Lester", 1));
      roster.add(new Student("Henry", 5));
      roster.add(new Student("Renee", 9));
      roster.add(new Student("Glen", 2));
      roster.add(new Student("Fran", 6));
      roster.add(new Student("David", 1));
      roster.add(new Student("Danny", 3));
 
   //why! this gives error! I don't understand!!!

    SeatingChart chart = new SeatingChart(roster, 3, 4);
    System.out.println(chart + "\n\n");
    chart.removeAbsentStudents(4);
    System.out.println(chart + "\n\n");

  }  
}
