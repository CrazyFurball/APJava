public class P1hYuchen
{
    public static void main(String[] args)
    {
        String[] artist=new String[4];
        artist[0]="Michael Jackson";
        artist[1]= " ";
        artist[2]="Wowaka";
        artist[3]="Moving Point";
        
        for(int i=0; i<artist.length; i++)
        {
            if(artist[i].equals("Michael Jackson"))
            {
                System.out.println("We found Michael!");
                
            }
            else 
            {
                System.out.println("Michael not found");
            }
        }
        
        
    }
}
