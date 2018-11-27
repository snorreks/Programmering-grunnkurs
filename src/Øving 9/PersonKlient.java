/*Oppgave 8.1
	SKS 01.10.2017	*/

import static javax.swing.JOptionPane.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class PersonKlient{
	public static void main (String[]args){



//Leser inn data fra brukeren:
  			JPanel p = new JPanel();
  			JTextField fornavn = new JTextField(8);
  			JTextField etternavn = new JTextField(8);
  			JTextField fødselsår = new JTextField(8);
  			p.add(new JLabel("Fornavn :"));
  			p.add(fornavn);
  			p.add(new JLabel("Etternavn: "));
  			p.add(etternavn);
  			p.add(new JLabel("Fødselsår :"));
  			p.add(fødselsår);
  			JOptionPane.showConfirmDialog(null, p, "Person: ", JOptionPane.OK_CANCEL_OPTION);

  			JPanel n = new JPanel();
  			JTextField arbtakernr = new JTextField(8);
  			JTextField ansettelsesår = new JTextField(8);
  			JTextField måndeslønn = new JTextField(8);
  			JTextField skatteprosent = new JTextField(8);
  			n.add(new JLabel("Arbeidstaker nr :"));
  			n.add(arbtakernr);
  			n.add(new JLabel("Ansettelses år: "));
  			n.add(ansettelsesår);
  			n.add(new JLabel("Måndeslønn :"));
  			n.add(måndeslønn);
  			n.add(new JLabel("Skatteprosent :"));
  			n.add(skatteprosent);
  			JOptionPane.showConfirmDialog(null, n, "Arbeidstaker: ", JOptionPane.OK_CANCEL_OPTION);

			boolean run = true;
			while(run){
				String[] options = new String[]{"Skatt pr månde","Bruttolønn per år","Skattetrekk per år","Navn på formen","Alder","År ansatt i bedriften","Lenge ansatt?","Cancel"};
				int response = showOptionDialog(null, "Velg oppgave:", "Valuta kalkulator", DEFAULT_OPTION, PLAIN_MESSAGE, null, options, options[0]);
					if((response == -1) || (response == 7)){run = false; break;}

				if(response == 6){
					String årLest = showInputDialog(null,"Skriv inn antall år: ","Har person vært ansatt mer enn et gitt antall år?", QUESTION_MESSAGE);
						if(årLest == null || årLest.isEmpty()){run = false; break;}
					try{
					float i = Float.valueOf(årLest);
					}catch(NumberFormatException ex){
            			System.err.println("Ugyldig input");
						run = false;
						break;
					}
				}



				switch(response){
					case 0:
						//ArbTaker...
						//showMessageDialog(null,"Beløpet er:" + sum + " kr");
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