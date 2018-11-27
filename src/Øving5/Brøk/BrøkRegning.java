package Øving5.Brøk;/*Oppgave 6.2: Br�kRegning
	SKS 16.09.2017	*/

class Br�kRegning{
	public static void main (String[]args){

		while(true){
	//Lest inn data fra brukeren
		String lest1 = showInputDialog("Teller til br�k 1: ");
		if(lest1 == null){break;}
		int teller = Integer.parseInt(lest1);

		String lest2 = showInputDialog("Nevner til br�k 1: ");
		int nevner = Integer.parseInt(lest2);
		if(lest2==null){nevner = 1;}

		String[] options = new String[]{"Pluss","Minus","Gange","Dele","Cancel"};
		int response = showOptionDialog(null, "Velg oppgave:", "Br�k kalkulator", DEFAULT_OPTION, PLAIN_MESSAGE, null, options, options[0]);
		if((response == -1) || (response == 4)){break;}

		String lest3 = showInputDialog("Teller til br�k 2: ");
		if(lest3 == null){break;}
		int teller2 = Integer.parseInt(lest3);

		String lest4 = showInputDialog("Nevner til br�k 2: ");
		int nevner2 = Integer.parseInt(lest4);
		if(lest4==null){nevner2 = 1;}

	//Hent fra klasse Br�k:


			Br�k A = new Br�k(teller, nevner);
			Br�k B = new Br�k(teller2,nevner2);

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