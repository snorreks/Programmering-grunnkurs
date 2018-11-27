package Øving10;/*Oppgave 8.1
	SKS 01.10.2017	*/

import javax.swing.*;

import static javax.swing.JOptionPane.*;

class StudOppgKlient{
	public static void main (String[]args){

		Student[] studenter = {new Student("Karl Marx", 1),  new Student("Lars Nils", 2),  new Student("Per Bob", 3)};
		Oppgaveoversikt o = new Oppgaveoversikt(studenter, studenter.length);


		boolean run = true;
		outerloop:
		while(true){

			showMessageDialog(null, o.toString(),"Info", QUESTION_MESSAGE);

			String[] henteValg = new String[o.getAntStud()];
			for(int i = 0; i < o.getAntStud(); i++){
				henteValg[i] = o.getStudentNavn(i);
				}
			String studentSe = (String)showInputDialog(null, "Velg hvilken student du vil se p�", "Velg student", QUESTION_MESSAGE, null, henteValg, henteValg[0]);
			if(studentSe == null) break;

			boolean run2 = true;
			while(run2){
				String[] options = new String[]{"Finn student nr","Finn antall oppgaver","�k oppg for studenten","Registrer flere studenter","Velg student","Cancel"};
				int response = showOptionDialog(null, "Velg oppgave:", "Du ser p� studenten: " + studentSe, DEFAULT_OPTION, PLAIN_MESSAGE, null, options, options[0]);
					if((response == -1) || (response == 5)){run = false; break outerloop;}

				switch(response){
					case 0:
						showMessageDialog(null,"Studenten har nr: " + (o.finnStudNr(studentSe) + 1), studentSe, QUESTION_MESSAGE);
						break;
					case 1:
						showMessageDialog(null,"Studenten har " + o.getAntOppgaver(studentSe) + " oppgaver", studentSe, QUESTION_MESSAGE);
						break;
					case 2:
						String nyOppgLest = showInputDialog(null,"Skriv inn antall nye oppgaver for studenten: ","�k oppgaver for studenten ", QUESTION_MESSAGE);
							if(nyOppgLest == null || nyOppgLest.isEmpty()){showMessageDialog(null,"Feil input"); break;}
									try{
										float i = Float.valueOf(nyOppgLest);
									}catch(NumberFormatException ex){
										showMessageDialog(null,"Feil input");
										break;
									}
									int nyAntallOppg = Integer.parseInt(nyOppgLest);

						o.nyOppg(studentSe,nyAntallOppg);
						showMessageDialog(null, studentSe + " har n� " + o.getAntOppgaver(studentSe) + " oppgaver.", "Oppgaver for studenten", QUESTION_MESSAGE);
						break;
					case 3:
  						JPanel p = new JPanel();
  						JTextField nyNavnLest = new JTextField(10);
  						JTextField nyOppgLest2 = new JTextField(10);
  						p.add(new JLabel("Student navn: "));
 						p.add(nyNavnLest);
 				 		p.add(new JLabel("Antall oppgaver: "));
  						p.add(nyOppgLest2);

  						JOptionPane.showConfirmDialog(null, p, "Registrer ny student : ", JOptionPane.OK_CANCEL_OPTION);

  						String nyNavn = nyNavnLest.getText();
						nyNavnLest.setText(nyNavn);
							if(nyNavn == null || nyNavn.isEmpty() || nyOppgLest2.getText() == null) {showMessageDialog(null,"Feil input"); break;}
							try{
								float i = Float.valueOf(nyOppgLest2.getText());
							}catch(NumberFormatException ex){
								showMessageDialog(null,"Feil input");
								break;
							}
						int nyOppg = Integer.parseInt(nyOppgLest2.getText());

						o.nyStudent(nyNavn, nyOppg);
						//	o.nyStudent(new Student(nyNavn, nyOppg));
						//showMessageDialog(null,"Det er " + o.getAntStud() + " studenter registrert.");
						break;
					case 4:
						run2 = false;
						break;
					}
				}

		}
	}
}