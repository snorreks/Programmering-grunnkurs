//Øving 2.4: Kjøttdeig
	//SKS 23.08.2017

import static javax.swing.JOptionPane.*;

class Øving204 {
	public static void main(String[] args){

	//Les inn data fra bruker
	String GramALest = showInputDialog("Antall gram for kjøttdeig A:");
		int gramA = Integer.parseInt(GramALest);

	String PengerALest = showInputDialog("Prisen for kjøttdeig A");
		double pengerA = Double.parseDouble(PengerALest);

	String GramBLest = showInputDialog("Antall gram for kjøttdeig B:");
		int gramB = Integer.parseInt(GramBLest);

	String PengerBLest = showInputDialog("Prisen for kjøttdeig B");
		double pengerB = Double.parseDouble(PengerBLest);

	//beregn svar
		double kpgA = gramA  / pengerA;
		double kpgB = gramB  / pengerB;

		if (kpgA > kpgB){
			double sum1 = kpgA - kpgB;
				showMessageDialog(null, "Kjøttdeig A er billigere enn kjøttdeig B");

		} else {
			double sum2 = kpgB - kpgA;
				showMessageDialog(null, "Kjøttdeig B er billigere enn kjøttdeig A");

		}
	//gir tilbakemelding til bruker
	}
}