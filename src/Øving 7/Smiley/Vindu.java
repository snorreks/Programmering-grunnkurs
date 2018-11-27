import javax.swing.JFrame;

class Vindu extends JFrame{

	public Vindu(String tittel){
		setTitle(tittel);
		setSize(200, 120);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Tegning tegningen = new Tegning();
		add(tegningen);
	}
}