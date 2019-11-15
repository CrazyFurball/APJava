import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Field here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Field extends World
{

    /**
     * Constructor for objects of class Field.
     * 
     */
    public Field()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        BlueJ myBlueJ= new BlueJ(":P",10,false,300,200);
        House myHouse= new House();
        addObject(myBlueJ,300,150);
        addObject(myHouse,300,200);
       
        
    }
}
