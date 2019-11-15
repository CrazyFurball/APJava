import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is my BlueJ class.
 * 
 * @author Yuchen Yang
 * @version 10/24/18
 */
public class BlueJ extends Actor
{
    /**
     * Act - do whatever the BlueJ wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    //add instance variable 
    private String name;
    private int speed;
    private boolean isDead;
    private int xDestination;
    private int yDestination;
    
    
    //add multi argument constructor
     public BlueJ (String initName, int initSpeed, boolean initIsDead, int x, int y)
    {
        name=initName;
        speed=initSpeed;
        isDead=initIsDead;
        xDestination=x;
        yDestination=y;
    }
    
    //0 argument constructo
     public BlueJ ()
    {
        name=null;
        speed=0;
        isDead=false;
        xDestination=0;
        yDestination=0;
    }
    
    //add toString method 
     public String toString()
    {
        return "name: "+name+" speed: "+speed+" isDead: "+isDead +" x "+ getX()+" y "+ +getY();
    }
    public void act() 
    {
       setImage("bluej-icon.png");
       
       move(speed);
       turn(3);
       if(isAtEdge()) 
       {
           turn((int)(Math.random()*91));
        }
       getWorld().showText(toString(),300,300);
       getWorld().showText( "Distance to destination is: " + calcTripDistance() + " m", getWorld().getWidth()/2, getWorld().getHeight() - 100 );
       getWorld().showText( "Trip travel time is: " + calcTripTravelTime() + " m", getWorld().getWidth()/2, getWorld().getHeight() - 80 );
    }    
    
    //calc trip distance
    public double calcTripDistance()
    {
        double distance= Math.sqrt(Math.pow(xDestination-getX(),2)+Math.pow(yDestination-getY(),2));
        return (int)(distance*100)/100;
    }
    
    //calc trip travel time
    public double calcTripTravelTime() 
    {
        double time=-1;
        if(speed!=0)
        time= calcTripDistance()/speed;
        return (int)(time*100)/100;
    }
}

