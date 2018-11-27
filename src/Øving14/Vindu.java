package Øving14;

import javax.swing.*;

class Vindu extends JFrame{
    public Vindu(String tittelen){
        setTitle(tittelen);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Grafikken tegn = new Grafikken();
        tegn.setSize(1280, 720);
        add(tegn);
        pack();
    }
}