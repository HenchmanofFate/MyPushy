import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class PushyWelt extends World
{

    /**
     * Constructor for objects of class PushyWelt.
     * 
     */
    public PushyWelt()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(120, 24,36);
        //super(8,8,36);
        setPaintOrder(Spieler.class, Kiste.class, Mauer.class, KistenZielfeld.class);

        prepare();
    }

    /**
     * Bereite die Welt für den Programmstart vor. Das heißt: Erzeuge die Anfangs-
     * Objekte und füge sie der Welt hinzu.
     */

    private void prepare()
    {
        Spieler s = new Spieler();
        addObject(s, 4, 5);
        addObject(new KistenZielfeld(),3, 5);
        addObject(new Kiste(),5, 6);
        addObject(new Kiste(),3, 5);
        addObject(new KistenZielfeld(),4, 3);

        Mauer mauer = new Mauer();
        addObject(mauer, 2, 2);
        Mauer mauer1 = new Mauer();
        addObject(mauer1, 3, 2);
        Mauer mauer2 = new Mauer();
        addObject(mauer2, 4, 2);
        Mauer mauer3 = new Mauer();
        addObject(mauer3, 5, 2);
        Mauer mauer4 = new Mauer();
        addObject(mauer4, 5, 3);
        Mauer mauer5 = new Mauer();
        addObject(mauer5, 5, 4);
        Mauer mauer6 = new Mauer();
        addObject(mauer6, 7, 4);
        Mauer mauer7 = new Mauer();
        addObject(mauer7, 6, 4);
        Mauer mauer8 = new Mauer();
        addObject(mauer8, 7, 5);
        Mauer mauer9 = new Mauer();
        addObject(mauer9, 7, 6);
        Mauer mauer10 = new Mauer();
        addObject(mauer10, 7, 7);
        Mauer mauer11 = new Mauer();
        addObject(mauer11, 6, 7);
        Mauer mauer12 = new Mauer();
        addObject(mauer12, 5, 7);
        Mauer mauer13 = new Mauer();
        addObject(mauer13, 5, 8);
        Mauer mauer14 = new Mauer();
        addObject(mauer14, 4, 8);
        Mauer mauer15 = new Mauer();
        addObject(mauer15, 3, 8);
        Mauer mauer16 = new Mauer();
        addObject(mauer16, 2, 8);
        Mauer mauer17 = new Mauer();
        addObject(mauer17, 2, 7);
        Mauer mauer18 = new Mauer();
        addObject(mauer18, 2, 6);
        Mauer mauer19 = new Mauer();
        addObject(mauer19, 2, 6);
        Mauer mauer20 = new Mauer();
        addObject(mauer20, 2, 5);
        Mauer mauer21 = new Mauer();
        addObject(mauer21, 2, 4);
        Mauer mauer22 = new Mauer();
        addObject(mauer22, 2, 3);

    }
    
    
    
  
}
