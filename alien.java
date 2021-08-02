 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class alien extends Actor
{
    // esta variable controla el movimiento de los aliens
    int X_MOVE = 3;
    SimpleTimer shotTimer = new SimpleTimer();
    int randshoot = Greenfoot.getRandomNumber(7000);
    public alien()
    {
        getImage().scale( 100, 75);
    }
    /**
     * Act - do whatever the alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //aqui se hace el movimiento del alien para que rebote a ambos lados 
        setLocation(getX() + X_MOVE,getY()); 
        if ( (getX() > 1270) || (getX() < 10) )
        {
            X_MOVE = X_MOVE * -1; 
        }
        // disparos random y timepo de espera por cada disparo
        if (shotTimer.millisElapsed() > 2000 + randshoot)
        {
            getWorld().addObject(new alienLaser(), getX(),getY());
            shotTimer.mark();
            Greenfoot.getRandomNumber(5000);
        }
    }
}
