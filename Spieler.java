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
            Telepotta.teleport(x,y);
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
}
