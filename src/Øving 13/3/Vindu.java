import javax.swing.*;

class Vindu extends JFrame{
	public Vindu(String tittelen){
		setTitle(tittelen);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Grafikken3 tegn = new Grafikken3();
		tegn.setSize(1280, 720);
		add(tegn);
		pack();
	}
}