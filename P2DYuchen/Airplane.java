    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * Write a description of class Airplane here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     * 
     */
    public class Airplane extends Actor
    {
        /**
         * Act - do whatever the Airplane wants to do. This method is called whenever
         * the 'Act' or 'Run' button gets pressed in the environment.
         */
        int altitude;
        double speed;
        boolean isNonStop;
        String name;
    public Airplane()
    {   
        altitude=0;
        speed=3;
        isNonStop=false;
        name=null;
        
    }// 0 argument constructor
    
    public Airplane(int initAltitude, double initSpeed, boolean initIsNonStop, String initName)
    {   
        altitude=initAltitude;
        speed=initSpeed;
        isNonStop=initIsNonStop;
        name=initName;
        
    }// multi argument constructor
    
    public String toString()
    {
        return ""+altitude+" "+ speed +" "+isNonStop+" "+name;
    }
        
    public void act() 
    {
        move((int)speed);
        turn(1);
    
    if(getX()>598)
        
        {
         setLocation(3,getY());
        
        }
    if(getX()<2 )
        {
        setLocation(597,getY());
        }    
    if(getY()>398)
        
        {
         setLocation(getX(), 3);
        
        }
    if(getY()<2 )
        {
        setLocation(getX(), 397);
        }             
    
   
        getWorld().showText(toString(),300,200);
    }    
}
