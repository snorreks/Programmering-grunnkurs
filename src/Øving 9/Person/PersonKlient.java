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
  		JTextField fornavn1 = new JTextField(8);
  		JTextField etternavn1 = new JTextField(8);
  		JTextField fødselsår1 = new JTextField(8);
  		p.add(new JLabel("Fornavn :"));
  		p.add(fornavn1);
  		p.add(new JLabel("Etternavn: "));
  		p.add(etternavn1);
  		p.add(new JLabel("Fødselsår :"));
  		p.add(fødselsår1);
  		JOptionPane.showConfirmDialog(null, p, "Person: ", JOptionPane.OK_CANCEL_OPTION);

  		JPanel n = new JPanel();
  		JTextField arbtakernr1 = new JTextField(8);
  		JTextField ansettelsesår1 = new JTextField(8);
  		JTextField måndeslønn1 = new JTextField(8);
  		JTextField skatteprosent1 = new JTextField(8);
  		n.add(new JLabel("Arbeidstaker nr :"));
  		n.add(arbtakernr1);
  		n.add(new JLabel("Ansettelses år: "));
  		n.add(ansettelsesår1);
  		n.add(new JLabel("Måndeslønn :"));
  		n.add(måndeslønn1);
  		n.add(new JLabel("Skatteprosent :"));
  		n.add(skatteprosent1);
  		JOptionPane.showConfirmDialog(null, n, "Arbeidstaker: ", JOptionPane.OK_CANCEL_OPTION);


		String fornavn = fornavn1.getText();
		fornavn1.setText(fornavn);
		String etternavn = etternavn1.getText();
		etternavn1.setText(etternavn);
		int fødselsår = Integer.parseInt(fødselsår1.getText());
		int arbtakernr = Integer.parseInt(arbtakernr1.getText());
		int måndeslønn = Integer.parseInt(måndeslønn1.getText());
		double skatteprosent = Double.parseDouble(skatteprosent1.getText());
		int ansettelsesår = Integer.parseInt(ansettelsesår1.getText());

  		ArbTaker a = new ArbTaker(fornavn,etternavn,fødselsår,arbtakernr,ansettelsesår,måndeslønn,skatteprosent);

  		int årTest = 0;

		boolean run = true;
		while(run){
			String[] options = new String[]{"Skatt/månde","Bruttolønn","Skattetrekk","Navn","Alder","År ansatt","Lenge ansatt?","Endre","Cancel"};
			int response = showOptionDialog(null, "Velg oppgave:", "Valuta kalkulator", DEFAULT_OPTION, PLAIN_MESSAGE, null, options, options[0]);
				if((response == -1) || (response == 8)){run = false; break;}

			switch(response){
				case 0:
					showMessageDialog(null,"Skattetrekk pr månde: " + a.getSkattPrMånde());
					break;
				case 1:
					showMessageDialog(null,"Bruttolønn per år: " + a.getBruttolønn());
					break;
				case 2:
					showMessageDialog(null,"Skattetrekk per år: " + a.getSkattetrekk());
					break;
				case 3:
					showMessageDialog(null, a.getNavn());
					break;
				case 4:
					showMessageDialog(null,"Alder: " + a.getAlder());
					break;
				case 5:
					showMessageDialog(null,"Antall år ansatt: " + a.antallÅrAnsatt());
					break;
				case 6:
					boolean run2 = true;
					while(run2){
						String årLest = showInputDialog(null,"Skriv inn antall år du vil teste: ","Har person vært ansatt mer enn et gitt antall år?", QUESTION_MESSAGE);
							if(årLest == null || årLest.isEmpty()){run2 = false; break;}
						try{
							float i = Float.valueOf(årLest);
						}catch(NumberFormatException ex){
							break;
						}
						årTest = Integer.parseInt(årLest);
						if(a.erAnsattMerEnnÅr(årTest) == true){
							showMessageDialog(null,"Personen har vært ansatt i " + årTest + " år");
						}else{
							showMessageDialog(null,"Personen har IKKE vært ansatt i " + årTest + " år");
						}
					}
						break;
				case 7:
					String[] options2 = new String[]{"Endre måndeslønn","Endre Skatteprosent","Gå tilbake"};
					int response2 = showOptionDialog(null, "Velg oppgave:", "Endre", DEFAULT_OPTION, PLAIN_MESSAGE, null, options2, options2[0]);
					if(response2 == 0){
						String nyMåndeLest = showInputDialog(null,"Skriv inn ny lønn: ","String", QUESTION_MESSAGE);
					if(nyMåndeLest == null || nyMåndeLest.isEmpty()){break;}
						a.setMåndeslønn(Integer.parseInt(nyMåndeLest));
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