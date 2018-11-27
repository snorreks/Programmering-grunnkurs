package Øving9.Person;/*Oppgave 8.1
	SKS 01.10.2017	*/

import javax.swing.*;

import static javax.swing.JOptionPane.*;

class PersonKlient{
	public static void main (String[]args){



//Leser inn data fra brukeren:
  		JPanel p = new JPanel();
  		JTextField fornavn1 = new JTextField(8);
  		JTextField etternavn1 = new JTextField(8);
  		JTextField f�dsels�r1 = new JTextField(8);
  		p.add(new JLabel("Fornavn :"));
  		p.add(fornavn1);
  		p.add(new JLabel("Etternavn: "));
  		p.add(etternavn1);
  		p.add(new JLabel("F�dsels�r :"));
  		p.add(f�dsels�r1);
  		JOptionPane.showConfirmDialog(null, p, "Person: ", JOptionPane.OK_CANCEL_OPTION);

  		JPanel n = new JPanel();
  		JTextField arbtakernr1 = new JTextField(8);
  		JTextField ansettelses�r1 = new JTextField(8);
  		JTextField m�ndesl�nn1 = new JTextField(8);
  		JTextField skatteprosent1 = new JTextField(8);
  		n.add(new JLabel("Arbeidstaker nr :"));
  		n.add(arbtakernr1);
  		n.add(new JLabel("Ansettelses �r: "));
  		n.add(ansettelses�r1);
  		n.add(new JLabel("M�ndesl�nn :"));
  		n.add(m�ndesl�nn1);
  		n.add(new JLabel("Skatteprosent :"));
  		n.add(skatteprosent1);
  		JOptionPane.showConfirmDialog(null, n, "Arbeidstaker: ", JOptionPane.OK_CANCEL_OPTION);


		String fornavn = fornavn1.getText();
		fornavn1.setText(fornavn);
		String etternavn = etternavn1.getText();
		etternavn1.setText(etternavn);
		int f�dsels�r = Integer.parseInt(f�dsels�r1.getText());
		int arbtakernr = Integer.parseInt(arbtakernr1.getText());
		int m�ndesl�nn = Integer.parseInt(m�ndesl�nn1.getText());
		double skatteprosent = Double.parseDouble(skatteprosent1.getText());
		int ansettelses�r = Integer.parseInt(ansettelses�r1.getText());

  		ArbTaker a = new ArbTaker(fornavn,etternavn,f�dsels�r,arbtakernr,ansettelses�r,m�ndesl�nn,skatteprosent);

  		int �rTest = 0;

		boolean run = true;
		while(run){
			String[] options = new String[]{"Skatt/m�nde","Bruttol�nn","Skattetrekk","Navn","Alder","�r ansatt","Lenge ansatt?","Endre","Cancel"};
			int response = showOptionDialog(null, "Velg oppgave:", "Valuta kalkulator", DEFAULT_OPTION, PLAIN_MESSAGE, null, options, options[0]);
				if((response == -1) || (response == 8)){run = false; break;}

			switch(response){
				case 0:
					showMessageDialog(null,"Skattetrekk pr m�nde: " + a.getSkattPrM�nde());
					break;
				case 1:
					showMessageDialog(null,"Bruttol�nn per �r: " + a.getBruttol�nn());
					break;
				case 2:
					showMessageDialog(null,"Skattetrekk per �r: " + a.getSkattetrekk());
					break;
				case 3:
					showMessageDialog(null, a.getNavn());
					break;
				case 4:
					showMessageDialog(null,"Alder: " + a.getAlder());
					break;
				case 5:
					showMessageDialog(null,"Antall �r ansatt: " + a.antall�rAnsatt());
					break;
				case 6:
					boolean run2 = true;
					while(run2){
						String �rLest = showInputDialog(null,"Skriv inn antall �r du vil teste: ","Har person v�rt ansatt mer enn et gitt antall �r?", QUESTION_MESSAGE);
							if(�rLest == null || �rLest.isEmpty()){run2 = false; break;}
						try{
							float i = Float.valueOf(�rLest);
						}catch(NumberFormatException ex){
							break;
						}
						�rTest = Integer.parseInt(�rLest);
						if(a.erAnsattMerEnn�r(�rTest) == true){
							showMessageDialog(null,"Personen har v�rt ansatt i " + �rTest + " �r");
						}else{
							showMessageDialog(null,"Personen har IKKE v�rt ansatt i " + �rTest + " �r");
						}
					}
						break;
				case 7:
					String[] options2 = new String[]{"Endre m�ndesl�nn","Endre Skatteprosent","G� tilbake"};
					int response2 = showOptionDialog(null, "Velg oppgave:", "Endre", DEFAULT_OPTION, PLAIN_MESSAGE, null, options2, options2[0]);
					if(response2 == 0){
						String nyM�ndeLest = showInputDialog(null,"Skriv inn ny l�nn: ","String", QUESTION_MESSAGE);
					if(nyM�ndeLest == null || nyM�ndeLest.isEmpty()){break;}
						a.setM�ndesl�nn(Integer.parseInt(nyM�ndeLest));
					}
					else if(response2 == 1){
						String nySkattLest = showInputDialog(null,"Skriv inn ny Skatt: ","String", QUESTION_MESSAGE);
						if(nySkattLest == null || nySkattLest.isEmpty()){break;}
						a.setSkatteprosent(Double.parseDouble(nySkattLest));
					} else if(response2 == -1){run = false; break;
					} else  {break;}
			}
		}
	}
}