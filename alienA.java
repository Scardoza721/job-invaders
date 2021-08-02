import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class alienA extends alien
{
    GreenfootImage a1 = new GreenfootImage("enemy2.gif");
    GreenfootImage a2 = new GreenfootImage("enemy2-2.gif");
    SimpleTimer aniTimer = new SimpleTimer();
    
    
    public alienA()
    {
        getImage().scale( 100, 75);
        aniTimer.mark();
    }
    public void act()
    {
        super.act();
        if (aniTimer.millisElapsed() > 400)
        {
            if (getImage() == a1)
            {
                setImage(a2);
            }
            else
            {
                setImage(a1);
            }
            getImage().scale( 100, 75);
            aniTimer.mark();
        }
    }
}
