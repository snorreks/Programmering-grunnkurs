package Øving3;/*�ving 3.1: Multiplikasjonstabellen
	SKS 28.08.2017	*/

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
class Øving301{
	public static void main (String[]args){

	//Les inn data fra bruker
		String startLest = showInputDialog("Start ");
		String sluttLest = showInputDialog("Slutt  ");
		if (sluttLest == null || startLest == null || SLUTT == 0 || SLUTT<START) {
			showMessageDialog(null,"Ikke gyldig");
		}else{

		final int START = Integer.parseInt(startLest);
		final int SLUTT = Integer.parseInt(sluttLest);
		double p = null;

			for (int linjeteller = START; linjeteller <= SLUTT; linjeteller++){
     			System.out.println("\nGangetabellen for "+linjeteller  + "\n");
				for (int tall = 1; tall <= 10; tall++){
      		System.out.println(linjeteller +"*"+tall+" = " + (linjeteller * tall));
				}
			}
		}
	}
}