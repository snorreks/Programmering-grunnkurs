package Øving8.String;/*Oppgave 8.1
	SKS 01.10.2017	*/

import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.showInputDialog;
class NyStringKlient{
	public static void main (String[]args){

		boolean run = true;
		while(run){

//Leser inn data fra brukeren:
			String tekst = showInputDialog(null,"Skriv inn teksten du vil redigere: ","String", QUESTION_MESSAGE);
			if(tekst == null || tekst.isEmpty()){run = false; break;}

			String bokstav = showInputDialog(null,"Skriv bare en bokstav: ","Fjerne bokstav i teskten ", QUESTION_MESSAGE);
			if(bokstav == null){run = false; break;}

			NyString teksten = new NyString(tekst);

			System.out.println(teksten.Forkort());
			System.out.println(teksten.FjernTegn(bokstav));

			run = false;
		}

	}
}