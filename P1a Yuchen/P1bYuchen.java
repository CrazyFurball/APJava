public class P1bYuchen
{
    public static void main(String[]args)
    {
        double a=1;
        double b=2;
        double c=4;
        double delta=b*b-4*a*c;       
        
        if(delta>=0)
        {
            
            System.out.println("Root 1 is "+(-b+Math.sqrt(delta))/(2*a));
            System.out.print("Root 2 is "+(-b-Math.sqrt(delta))/(2*a));
        }
        
        if(delta<0)
        {
            delta*=-1;
            System.out.println("Root 1 is "+(-b+Math.sqrt(delta))/(2*a)+"i");
            System.out.print("Root 2 is "+(-b-Math.sqrt(delta))/(2*a)+"i");
        }
    }
}