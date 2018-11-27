/*Oppgave 6.3: RandomMellomToTall
	SKS 18.09.2017	*/

import static javax.swing.JOptionPane.*;
class RandomMellomToTall{
	public static void main (String[]args){

		while(true){

	//Les inn data fra brukeren:
		String lest1 = showInputDialog(null,"Skriv inn første tall: ","Nedre grensen", QUESTION_MESSAGE);
		if(lest1 == null){break;}
		int nedre = Integer.parseInt(lest1);

		String lest2 = showInputDialog(null,"Skriv inn siste tall: ","Øvre grensen", QUESTION_MESSAGE);
		if(lest2 == null){break;}
		int ovre = Integer.parseInt(lest2);

	//Velg om du vil ha svaret i desimal tall eller ikke:
		String[] options = new String[]{"Hel tall","Desimal tall","Cancel"};
		int response = showOptionDialog(null, "Velg oppgave:", "RandomTall", DEFAULT_OPTION, PLAIN_MESSAGE, null, options, options[0]);
		if((response == -1) || (response == 2)){break;}

	//Hent klasse
		MinRandom A = new MinRandom();

		javax.swing.ImageIcon bilde = new javax.swing.ImageIcon("thinking.jpg");

	//Regn ut tilfeldigtallet:
		if(nedre>=ovre){
			showMessageDialog(null,"Ugyldig grense","ERROR",0,bilde);
		}else if(response == 0){
			int tall = A.nesteHeltall(nedre, ovre);
			showMessageDialog(null,"Det tilfeldige tallet er: " + tall);
		}else if(response == 1){
			double tall = A.nesteDesimaltall(nedre, ovre);
			showMessageDialog(null,"Det tilfeldige tallet er: " + tall);
		}
		//break;

		}//while løkka slutter
	}
}