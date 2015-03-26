import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spieler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spieler extends Actor
{
    Mauer mauer;
    Kiste kiste;
    Telepotta telepotta;
    /**
     * Act - do whatever the Spieler wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int xt=0, yt=0;
        
        if(Greenfoot.isKeyDown("up"))
        {
            int x=0;
            int y=-1;
            mauer = (Mauer) getOneObjectAtOffset (x,y, Mauer.class);
            setRotation(0);
            teleport(x,y);
            if(mauer==null)
            {
                kiste = (Kiste) getOneObjectAtOffset (x,y, Kiste.class);
                if(kiste==null)
                {
                    setLocation(getX()+x,getY()+y);
                }
                else
                {
                    if(kiste.nahe(x,y)==true)
                    {
                        setLocation(getX()+x,getY()+y);
                    }
                }
            }
        }

        else if(Greenfoot.isKeyDown("left"))
        {
            int x=-1;
            int y=0;
            mauer = (Mauer) getOneObjectAtOffset (x,y, Mauer.class);
            setRotation(270);
             teleport(x,y);
            if(mauer==null)
            {
                kiste = (Kiste) getOneObjectAtOffset (x,y, Kiste.class);
                if(kiste==null)
                {
                    setLocation(getX()+x,getY()+y);
                }
                else
                {
                    if(kiste.nahe(x,y)==true)
                    {
                        setLocation(getX()+x,getY()+y);
                    }
                }
            }
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            int x=+1;
            int y=0;
            mauer = (Mauer) getOneObjectAtOffset (x,y, Mauer.class);
            setRotation(90);
             teleport(x,y);
            if(mauer==null)
            {
                kiste = (Kiste) getOneObjectAtOffset (x,y, Kiste.class);
                if(kiste==null)
                {
                    setLocation(getX()+x,getY()+y);
                }
                else
                {
                    if(kiste.nahe(x,y)==true)
                    {
                        setLocation(getX()+x,getY()+y);
                    }
                }
            }
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            int x=0;
            int y=+1;
            mauer = (Mauer) getOneObjectAtOffset (x,y, Mauer.class);
            setRotation(180);
             teleport(x,y);
            if(mauer==null)
            {
                kiste = (Kiste) getOneObjectAtOffset (x,y, Kiste.class);
                if(kiste==null)
                {
                    setLocation(getX()+x,getY()+y);
                }
                else
                {
                    if(kiste.nahe(x,y)==true)
                    {
                        setLocation(getX()+x,getY()+y);
                    }
                }
            }
        }    
    }
    public void teleport(int xt, int yt)
    {
        boolean ported = false;
        Object obj;
        int x = xt;
        int y = yt;
        
        Telepotta telepottta;
        telepotta = (Telepotta) getOneObjectAtOffset (x,y,Telepotta.class);
        if (telepotta !=null)
        {
            while   (! ported)
            
            {
                if (Greenfoot.getRandomNumber(2)==1)
                {
                    x=getX()+Greenfoot.getRandomNumber(6);
                }
                if (Greenfoot.getRandomNumber(2)==1)
                {y=getY()+Greenfoot.getRandomNumber(6);
                }
                else 
                {
                    y=getY()-Greenfoot.getRandomNumber(6);
                }
                if(!(x<0||y<0))
                { 
                    World tolleWelt = getWorld();
                    if(!(x>=tolleWelt.getWidth()||y>=tolleWelt.getHeight()))
                    { 
                        obj=(Object) getOneObjectAtOffset(x,y,null);
                        if ( obj == null)
                        {
                            setLocation(x,y);
                            ported=true;
                        }
                    }
        
                }
            }
            }
        }
    
}
