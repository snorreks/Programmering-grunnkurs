package Øving13

import javax.swing.*;

class Vindu extends JFrame{
    public Vindu(String tittelen){
        setTitle(tittelen);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Grafikken2 tegn = new Grafikken2();
        tegn.setSize(1280, 720);
        add(tegn);
        pack();
    }
}