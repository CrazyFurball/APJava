import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Robot extends Actor
{
    int speed;
    int batteryLevel;
    int direction;
    int moveCount=0;
    //0 argument constructor
    public Robot()
    {
        speed=0;
        batteryLevel=0;
        direction=0;   
    }
    //multi argument constructor
    public Robot(int initSpeed, int inintBatteryLevel, int initDirection)
    {
        speed=initSpeed;
        batteryLevel=inintBatteryLevel;
        direction=initDirection;   
    }
   
    //act
    public void act() 
    {
        setRotation(direction);
        if(batteryLevel>0)
        {
            move(speed);
            moveCount+=1;
        }
        
        if (moveCount==3)
        {
            moveCount=0;
            batteryLevel-=1;
        }
        System.out.println(batteryLevel);
        
        if(isAtEdge()==true)
        speed*=-1;
    }    
    
    //toString()
    public String toString()
    {
        return "The speed is: "+speed+"\nThe battery level is: "+batteryLevel+"\nThe direction is: "+batteryLevel;
    }
}
