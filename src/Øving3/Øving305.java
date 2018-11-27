package Øving3;/*Oppgave 4.5: Primtall
	SKS 28.08.2017	*/

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

class Øving305 {
	public static void main (String[]args){

	// For � f� programmet til � kj�re hele tida
		//boolean run = true;
		while(true){
	//Les inn data fra bruker
		String Lest = showInputDialog("Skriv inn tall: ");
		int Tall = Integer.parseInt(Lest);
		boolean Prim = true;
	//Sjekk om det er primtall
		for (int teller = 2; teller < Tall; teller++)
		{
			int Test = Tall%teller;
			if (Test == 0) {
				Prim = false;
				break;
			}
		}
	//gir tilbakemelding til bruker
		if(!Prim || Tall < 2){showMessageDialog(null,"ikke primtall");}
		else{showMessageDialog(null,"primtall");}
		}
	}
}