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
    
    private boolean isMissionAccomplished;
    
    //add multi argument constructor
     public BlueJ (String initName,  boolean initIsDead, int x, int y)
    {
        name=initName;
        speed=1;
        isDead=initIsDead;       
        isMissionAccomplished=false;
    }
    
    //0 argument constructo
     public BlueJ ()
    {
        name=null;
        speed=1;
        isDead=false;
        isMissionAccomplished=false;
    }
    
    //add toString method 
     public String toString()
    {
        return "name: "+name+" /n speed: "+speed+" /n isDead: "+isDead +"/n x: "+ getX()+"/n y: "+ +getY()+"/n isMissionAccomplished: "
        +isMissionAccomplished;
    }
    public void act() 
    {
       setImage("bluej-icon.png");
       
       search();
       getWorld().showText("x:"+getX()+" y:"+getY(),300,300);
       
       
    }    
    
    public void search()
    {
        move(1);
        
        
        if(getX()==getWorld().getWidth()-1&&getY()==getWorld().getHeight()-1)
        {isMissionAccomplished=true;
         setLocation(getWorld().getWidth()/2,getWorld().getHeight()/2);
           getWorld().showText("Mission Complete!",300,350);
           Greenfoot.stop();
        }
        
        if(getX()==getWorld().getWidth()-1)
        {
            turn(90);
            move(1);
            turn(90);
            move(1);
        }
        
        if(getX()==0)
        {
            turn(-90);
            move(1);
            turn(-90);
            move(1);
        }
        
        
    }

}

