package Øving7.Smiley;

import javax.swing.*;
import java.awt.*;

class Tegning extends JPanel{

	public void paintComponent(Graphics tegneflate){
		super.paintComponent(tegneflate);
		setBackground(Color.ORANGE);
		tegneflate.drawString ("Smiley face", 300, 550);
		tegneflate.drawOval(100,100,400,400);
		tegneflate.fillOval(175,200,100,100);
		tegneflate.fillOval(325,200,100,100);
		tegneflate.drawArc(275,325,50,50,75,180);
		tegneflate.drawArc(230,320,130,130,200,150);


	}
}