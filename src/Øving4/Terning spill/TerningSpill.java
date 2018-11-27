package Øving4.Terning /*Oppgave 5.3: TerningSpill
	SKS 11.09.2017	*/

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
class TerningSpill{
	public static void main (String[]args){

		String spillerA = showInputDialog("Spiller A: ");
		String spillerB = showInputDialog("Spiller B: ");

		Terning A = new Terning(spillerA);
		Terning B = new Terning(spillerB);

		int sumA = 0;
		int sumB = 0;
		int kast = 1;
		boolean run = true;
		while (run) {

			int terningA = A.getTerningKast();
			int terningB = B.getTerningKast();
			A.addPoeng(terningA);
			B.addPoeng(terningB);
			sumA = A.getPoeng();
			sumB = B.getPoeng();

     		System.out.println("\nKast nummer: " + kast + "\n");
			System.out.println(spillerA + " rullet " + terningA + " ,scoren hittil " + sumA + "\n" +
							   spillerB + " rullet " + terningB + " ,scoren hittil " + sumB);
			kast ++;
			if (sumA >= 100) {
				showMessageDialog(null, spillerA + " er vinneren!");
				run = false;
			}
			if (sumB >=100){
				showMessageDialog(null, spillerB + " er vinneren!");
				run = false;
			}
		}
	}
}