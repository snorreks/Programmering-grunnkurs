package Øving12.cheeki;

import javax.swing.*;

class Vinduet extends JFrame{
    public Vinduet(String tittelen){
        setTitle(tittelen);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Grafikken graf = new Grafikken();
        graf.setSize(400, 350);
        add(graf);
        pack();
    }
}