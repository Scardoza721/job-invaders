import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1 extends World
{
    public static Counter shiplife = new Counter();
    public static Counter scorecount = new Counter();
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        addObject(new ship(), 640, 650);
        //aqui spawneo los aliens 
        for (int x = 0; x < 8; x++)
        {
            addObject(new alienA(), 100 + 100*x, 200);
            addObject(new alienB(), 100 + 100*x, 280);
            addObject(new alienC(), 100 + 100*x, 360);
        }
        
        //contador de vida
        addObject(shiplife, 50, 50);
        shiplife.setValue(3);
        //score count
        addObject(scorecount, 1220, 50);
        scorecount.setValue(0);
        
    }
}
