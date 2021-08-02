import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class alienLaser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class alienLaser extends Actor
{
    public alienLaser()
    {
        getImage().scale( 10, 30);
    }
    
    /**
     * Act - do whatever the alienLaser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(),getY() + 6); 
        
        ship h = (ship) getOneIntersectingObject(ship.class);
       if (h !=null)
       {
           //quita 1 vida del marcador 
           level1.shiplife.add(-1);
           //quita la ship y nos muestra la pantalla de perdiste 
           if (level1.shiplife.getValue() == 0)
           {
           getWorld().removeObject(h); 
           Greenfoot.setWorld(new lose());
            }
           getWorld().removeObject(this);
        }
       else if (getY() > 710)
       {
           getWorld().removeObject(this);
       }
    }
}
