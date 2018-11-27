/*Oppgave 6.2: BrøkRegning
	SKS 16.09.2017	*/

import static javax.swing.JOptionPane.*;
class BrøkRegning{
	public static void main (String[]args){

		while(true){
	//Lest inn data fra brukeren
		String lest1 = showInputDialog("Teller til brøk 1: ");
		if(lest1 == null){break;}
		int teller = Integer.parseInt(lest1);

		String lest2 = showInputDialog("Nevner til brøk 1: ");
		int nevner = Integer.parseInt(lest2);
		if(lest2==null){nevner = 1;}

		String[] options = new String[]{"Pluss","Minus","Gange","Dele","Cancel"};
		int response = showOptionDialog(null, "Velg oppgave:", "Brøk kalkulator", DEFAULT_OPTION, PLAIN_MESSAGE, null, options, options[0]);
		if((response == -1) || (response == 4)){break;}

		String lest3 = showInputDialog("Teller til brøk 2: ");
		if(lest3 == null){break;}
		int teller2 = Integer.parseInt(lest3);

		String lest4 = showInputDialog("Nevner til brøk 2: ");
		int nevner2 = Integer.parseInt(lest4);
		if(lest4==null){nevner2 = 1;}

	//Hent fra klasse Brøk:


			Brøk A = new Brøk(teller, nevner);
			Brøk B = new Brøk(teller2,nevner2);

	//Regn ut teller og nevner:
		switch(response){

		case 0:
		A.getPlussTeller(teller2,nevner2);
		break;

		case 1:
		A.getMinusTeller(teller2,nevner2);
		break;

		case 2:
		A.getGangeTeller(teller2,nevner2);
		break;

		case 3:
		A.getDelingTeller(teller2,nevner2);
		break;
		}

		System.out.println(A.getTeller() + "\n-\n" + A.getNevner());
		break;
		}
	}
}