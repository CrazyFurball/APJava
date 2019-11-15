import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Warehouse extends World
{

    /**
     * Constructor for objects of class Warehouse.
     * 
     */
    public Warehouse()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600,400,1); 
        Robot telephone=new Robot(4,100,50);
        addObject(telephone,10,10);
    }
}
