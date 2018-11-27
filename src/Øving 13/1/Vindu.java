import javax.swing.*;

class Vindu extends JFrame{
	public Vindu(String tittelen){
		setTitle(tittelen);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Grafikken1 tegn = new Grafikken1();
		tegn.setSize(1280, 720);
		add(tegn);
		pack();
	}
}