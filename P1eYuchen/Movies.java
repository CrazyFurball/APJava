
public class Movies
{
    public static void main(String[]args)
    {
        String[] movies= new String[3];
        String[] songs= new String[3];
        movies[0]="Loving Vincent";
        movies[1]="Ordinary road";
        movies[2]="idk:P";
        songs[0]="Midnight Poet";
        songs[1]="Metronome";
        songs[2]="Unown Mother Goose";
        // end initializing
        
        for(int i=0;i<movies.length;i++)
        {
            System.out.println(movies[i]);
        }
        //end printing movies
        System.out.println();
        System.out.println();
        
        int i=0;
        while(i<songs.length-1)
        {
            System.out.print(songs[i]+", ");
            i++;
        }
        System.out.print(songs[songs.length-1]+".");
        //end printing songs.
    }
}