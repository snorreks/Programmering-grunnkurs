//Øving 1.2: Timer,minutter og sekunder til total antall sekunder
	//SKS 21.08.2017

import static javax.swing.JOptionPane.*;

class Øving102 {
	public static void main(String[] args){

	//Les inn data fra bruker
	String TimerLest = showInputDialog("Timer:");
		int TimerOvergang = 3600;
		int Timer = Integer.parseInt(TimerLest);
		int sumTimer = Timer * TimerOvergang;

	String MinutterLest = showInputDialog("Minutter:");
		int MinutterOvergang = 60;
		int Minutter = Integer.parseInt(MinutterLest);
		int sumMinutter = Minutter * MinutterOvergang;

	String SekunderLest = showInputDialog("Sekunder:");
		int Sekunder = Integer.parseInt(SekunderLest);
		int sumSekunder = Sekunder;

	//beregn svar
		int sum = sumTimer + sumMinutter + sumSekunder;

	//gir tilbakemelding til bruker
		showMessageDialog(null, "Total antall sekunder  " + sum + " sekunder.");
	}
}