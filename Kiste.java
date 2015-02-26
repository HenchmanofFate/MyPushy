import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kiste here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kiste extends Actor
{
    Mauer mauer;
    Spieler spieler;
    Kiste kiste;
    KistenZielfeld kistenZielfeld;
    /**
     * Act - do whatever the Kiste wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        lampe();        
    }

    public boolean nahe(int x,int y)
    {
        mauer = (Mauer) getOneObjectAtOffset (x,y, Mauer.class);
        if (mauer ==null)
        {

            kiste = (Kiste) getOneObjectAtOffset (x,y, Kiste.class);
            if (kiste ==null)
            {
                setLocation(getX()+x,getY()+y);
                return true;
            }return false;
        }return false;
    }

    public void lampe()
    {
        kistenZielfeld = (KistenZielfeld) getOneObjectAtOffset (0,0, KistenZielfeld.class);
        if (kistenZielfeld != null)
        {
            setImage("Kiste an.jpg");
        }
        else 
        {
            setImage("Kiste aus.jpg");
        }
    }
}


