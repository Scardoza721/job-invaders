import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * la nave que dispara a los aliens 
 * 
 * @author Scardoza 
 * @version v1.2
 */
public class ship extends Actor
{
    SimpleTimer shotTimer = new SimpleTimer();
    int SHOT_INTERVAL = 500;
    
    public ship()
    {
        getImage().scale( 75, 75);
    }
    
    /**
     * Act - do whatever the ship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // esta parte mueve la  nave con las flechas del teclado 
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 5 ,getY()); 
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - 5,getY());
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY() - 5); 
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY() + 5 );
        }
        //esto se encarga de disparar
        if (Greenfoot.isKeyDown("space") && shotTimer.millisElapsed() > SHOT_INTERVAL)
        {
            getWorld().addObject(new laser(), getX(),getY());
            Greenfoot.playSound("shoot.wav");
            shotTimer.mark();
        }
    }
}
