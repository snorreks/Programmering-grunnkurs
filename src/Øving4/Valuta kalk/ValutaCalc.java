package Øving4.Valuta/*Oppgave 4.5: Primtall
	SKS 28.08.2017	*/

import static javax.swing.JOptionPane.*;
class ValutaCalc{
	public static void main (String[]args){

	boolean run = true;
	while(run){
	//Se om det er fra eller til norsk valuta
		String[] options1 = new String[]{"Til Norsk","Fra Norsk","Cancel"};
		int response1 = showOptionDialog(null, "Velg oppgave:", "Valuta kalkulator", DEFAULT_OPTION, PLAIN_MESSAGE, null, options1, options1[0]);
		if((response1 == -1) || (response1 == 2)){break;}
	//Se om det er euro, usd eller svensk
		String[] options2 = new String[]{"Dollar","Euro","Svensk","Cancel"};
		int response2 = showOptionDialog(null, "Velg valuta:", "Valuta kalkulator", DEFAULT_OPTION, PLAIN_MESSAGE, null, options2, options2[0]);
		if((response2 == -1) || (response2 == 3)){break;}
	//Les inn data fra bruker
		String Lest = showInputDialog("Skriv inn bel�p: ");
		double bel�p = Integer.parseInt(Lest);
		if(bel�p == 0){showMessageDialog(null,"Skrev ikke inn bel�p"); break;}
	//Valuta
		Valuta USD = new Valuta("Dollar (USD)", 8.1440);
		Valuta Euro = new Valuta("Euro (EUR)",9.8397);
		Valuta Svensk = new Valuta ("Kronor (SEK)", 1.0232);

	//Regn ut sum og gi svaret tilbake til bruker
		double sum = 0;

		switch(response1){
			case (0):
			sum += USD.tilNorsk(bel�p);
			showMessageDialog(null,"Bel�pet er:" + sum + " kr");
		}

		/*

		if (response1 == 0 && response2 == 0){ 									//til USD
			sum += USD.tilNorsk(bel�p);
			showMessageDialog(null,"Bel�pet er: " + sum + " Kroner (NOK)");
		} else if (response1 == 0 && response2 == 1){							//til Euro
			sum += Euro.tilNorsk(bel�p);
			showMessageDialog(null,"Bel�pet er: " + sum + " Kroner (NOK)");
		} else if (response1 == 0 && response2 == 2){							//til Svensk
			sum += Svensk.tilNorsk(bel�p);
			showMessageDialog(null,"Bel�pet er: " + sum + " Kroner (NOK)");
		} else if(response1 == 1 && response2 == 0){							//fra USD
			sum += USD.fraNorsk(bel�p);
			showMessageDialog(null,"Bel�pet er: " + sum + " " + USD.getName());
		} else if(response1 == 1 && response2 == 1){							//fra Euro
			sum += Euro.fraNorsk(bel�p);
			showMessageDialog(null,"Bel�pet er: " + sum + " " + Euro.getName());
		} else if(response1 == 1 && response2 == 2){							//fra Svensk
			sum += Svensk.fraNorsk(bel�p);
			showMessageDialog(null,"Bel�pet er: " + sum + " " + Svensk.getName());
		} else {run = false;}


		switch(response1 | response2){
			case (0 | 0):
			sum += USD.tilNorsk(bel�p);
			showMessageDialog(null,"Bel�pet er:" + sum + " kr");

			case (0 | 1):
			sum += Euro.tilNorsk(bel�p);
	 		showMessageDialog(null,"Bel�pet er:" + sum + " kr");
	 		break;

			case (0 | 2):
			sum += Svenks.tilNorsk(bel�p);
			showMessageDialog(null,"Bel�pet er:" + sum + " kr");
			break;

			case (1 | 0):
			sum += USD.fraNorsk(bel�p);
			showMessageDialog(null,"Bel�pet er:" + sum + " " + USD.getName());
			break;

			case (1 | 1):
			sum += Euro.fraNorsk(bel�p);
			showMessageDialog(null,"Bel�pet er:" + sum + " " + Euro.getName());
			break;

			case (1 | 2):
			sum += Svensk.tilNorsk(bel�p);
			showMessageDialog(null,"Bel�pet er:" + sum + " " + Svensk.getName());
			break;
		}
*/


	}
	}
}