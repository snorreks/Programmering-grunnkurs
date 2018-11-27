package Øving8.TekstBehandling;/*Oppgave 8.1
	SKS 01.10.2017	*/

import javax.swing.*;

import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.showInputDialog;

class TekstBehandlingKlient{
	public static void main (String[]args){

		boolean run = true;
		while(run){

//Leser inn data fra brukeren:
			String tekstLes = showInputDialog(null,"Skriv inn teksten du vil behadle: ","Tekst behandling", QUESTION_MESSAGE);
			if(tekstLes == null || tekstLes.isEmpty()){run = false; break;}

  			JPanel p = new JPanel();
  			JTextField inn = new JTextField(8);
  			JTextField ut = new JTextField(8);
  			p.add(new JLabel("Stringen du vil erstatte :"));
  			p.add(inn);
  			p.add(new JLabel("Stringen du vil erstatte med : "));
  			p.add(ut);
  			JOptionPane.showConfirmDialog(null, p, "Bytte String: ", JOptionPane.OK_CANCEL_OPTION);

  			String input = inn.getText();
  			String output = ut.getText();

			TekstBehandling tekst = new TekstBehandling(tekstLes);

			System.out.println("Antall ord:                                   " + tekst.getAntallOrd());
			System.out.println("Gjennomsnitelig antall bokstaver i hvert ord: " + tekst.finnGSordLengde());
			System.out.println("Gjennomsnitelig antall ord i en setning:      " + tekst.finnGSantallOrd());
			System.out.println("Tekst erstatning:                             " + tekst.Replaceify(input,output));
			System.out.println("Orginal tekst:                                " + tekst);
			System.out.println("Orginal tekst BIG:                            " + tekst.getStorTekst());


			run = false;
		}

	}
}