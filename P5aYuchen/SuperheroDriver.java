import java.util.List;
import java.util.ArrayList;
public class SuperheroDriver
   {
   public static void main( String[] args )
      {
       List<Superhero> superheroes=new ArrayList<Superhero>();
      superheroes.add(new Pigeons("Game Producer",30));
      superheroes.add(new OnePunchMan("Saitama",0));
      superheroes.add(new Devilman("Devilman"));
      
      for(int i=0; i<superheroes.size();i++)
      {
            System.out.println( superheroes.get(i).getMotto() );
      } 
    }// end method main
   } // end SuperheroDriver