import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Telepotta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Telepotta extends Actor
{
    /**
     * Act - do whatever the Telepotta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public void teleport(int xt,int yt)
    {
    boolean ported=false;
    Object obj;
    int x = xt;
    int y = yt;
   Telepotta telepotta;
   telepotta = (Telepotta) getOneObjectAtOffset (x,y, Telepotta.class);
   if (telepotta != null)
   {
   while (!ported)
   {
  x=getX()+Greenfoot.getRandomNumber(20);
  y=getY()+Greenfoot.getRandomNumber(20);
  World tolleWelt = getWorld();
  if(!(x>=tolleWelt.getWidth()||y>=tolleWelt.getHeight()))
  {
  
 obj=(Object) getOneObjectAtOffset(x,y,null);
 if (obj == null)
 { setLocation(x,y);
   ported=true;  
    }
 
    }
   

}
       
    
    } 
    }
}