//Øving 1.3: Sekunder til timer, minutter og sekunder
	//SKS 21.08.2017

import static javax.swing.JOptionPane.*;

class Øving103 {
	public static void main(String[] args){

	//Les inn data fra bruker
	String SekunderLest = showInputDialog("Sekunder:");
		int input = Integer.parseInt(SekunderLest);

	//beregn svar
		int sumTimer = input / 3600;
		int tmod = input % 3600;
		int sumMinutter = tmod / 60;

		int sumSekunder = tmod % 60;

	//gir tilbakemelding til bruker
		showMessageDialog(null, "Total antall timer  " + sumTimer + " timer.");
		showMessageDialog(null, "Total antall minutter  " + sumMinutter + " minutter.");
		showMessageDialog(null, "Total antall sekunder  " + sumSekunder + " sekunder.");


	}
}