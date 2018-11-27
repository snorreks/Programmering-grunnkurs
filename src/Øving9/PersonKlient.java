package Øving9;/*Oppgave 8.1
	SKS 01.10.2017	*/

import javax.swing.*;

import static javax.swing.JOptionPane.*;

class PersonKlient{
	public static void main (String[]args){



//Leser inn data fra brukeren:
  			JPanel p = new JPanel();
  			JTextField fornavn = new JTextField(8);
  			JTextField etternavn = new JTextField(8);
  			JTextField f�dsels�r = new JTextField(8);
  			p.add(new JLabel("Fornavn :"));
  			p.add(fornavn);
  			p.add(new JLabel("Etternavn: "));
  			p.add(etternavn);
  			p.add(new JLabel("F�dsels�r :"));
  			p.add(f�dsels�r);
  			JOptionPane.showConfirmDialog(null, p, "Person: ", JOptionPane.OK_CANCEL_OPTION);

  			JPanel n = new JPanel();
  			JTextField arbtakernr = new JTextField(8);
  			JTextField ansettelses�r = new JTextField(8);
  			JTextField m�ndesl�nn = new JTextField(8);
  			JTextField skatteprosent = new JTextField(8);
  			n.add(new JLabel("Arbeidstaker nr :"));
  			n.add(arbtakernr);
  			n.add(new JLabel("Ansettelses �r: "));
  			n.add(ansettelses�r);
  			n.add(new JLabel("M�ndesl�nn :"));
  			n.add(m�ndesl�nn);
  			n.add(new JLabel("Skatteprosent :"));
  			n.add(skatteprosent);
  			JOptionPane.showConfirmDialog(null, n, "Arbeidstaker: ", JOptionPane.OK_CANCEL_OPTION);

			boolean run = true;
			while(run){
				String[] options = new String[]{"Skatt pr m�nde","Bruttol�nn per �r","Skattetrekk per �r","Navn p� formen","Alder","�r ansatt i bedriften","Lenge ansatt?","Cancel"};
				int response = showOptionDialog(null, "Velg oppgave:", "Valuta kalkulator", DEFAULT_OPTION, PLAIN_MESSAGE, null, options, options[0]);
					if((response == -1) || (response == 7)){run = false; break;}

				if(response == 6){
					String �rLest = showInputDialog(null,"Skriv inn antall �r: ","Har person v�rt ansatt mer enn et gitt antall �r?", QUESTION_MESSAGE);
						if(�rLest == null || �rLest.isEmpty()){run = false; break;}
					try{
					float i = Float.valueOf(�rLest);
					}catch(NumberFormatException ex){
            			System.err.println("Ugyldig input");
						run = false;
						break;
					}
				}



				switch(response){
					case 0:
						//ArbTaker...
						//showMessageDialog(null,"Bel�pet er:" + sum + " kr");
						break;
					case 1:
						//
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						break;
					case 6:
						break;
				}

					run = false;
				}

			}
		}