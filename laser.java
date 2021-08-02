import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class laser extends Actor
{
    public laser()
    {
        getImage().scale(10,30);
    }
    /**
     * Act - do whatever the laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       setLocation(getX(),getY() - 8); 
       //esto se encarga de eliminar el laser y el alien cuando cohocan entre si
       alien e = (alien) getOneIntersectingObject(alien.class);
       if (e !=null)
       {
           //quita la ship y el alien 
           getWorld().removeObject(e);
           level1.scorecount.add(10);
           if(getWorld().getObjects(alien.class).size() == 0)
           {
               Greenfoot.setWorld(new win());
            }
           getWorld().removeObject(this);
        }
       else if (getY() < 5)
       {
           getWorld().removeObject(this);
       }
       
    }
}
