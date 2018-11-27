/*Oppgave 7.3
	SKS 01.10.2017	*/

import static javax.swing.JOptionPane.*;
class TekstAnalyseKlient{
	public static void main (String[]args){

	int runde = 1;
	while(runde != 0){

//Leser inn data fra brukeren:
		String tekst1 = showInputDialog(null,"Skriv teksten du vil analysere: ","Tekst nr "  + runde, QUESTION_MESSAGE);
		if(tekst1 == null || tekst1.isEmpty()){runde = 0; break;}
		String tekst2 = tekst1.toUpperCase();
		String bokstavLest = (showInputDialog(null,"Skriv bokstaven du vil se på: ","Antall forekomster i tekst nr " + runde, QUESTION_MESSAGE)).toUpperCase();
		if(tekst2 == null){runde = 0; break;}

//forsikrer at det er bare en bokstav skrevet inn.
		while(bokstavLest.length() != 1){
			bokstavLest = (showInputDialog(null,"Skriv bare en bokstav: ","Antall forekomster i tekst nr " + runde, QUESTION_MESSAGE)).toUpperCase();
		}
//henter inn klassen TekstAnalyse:
		char bokstav = bokstavLest.charAt(0);
		TekstAnalyse tekst = new TekstAnalyse(tekst2);

//sjekker om man har skrevet inn en bokstav eller spesialtegn
		if(tekst.findIndeks(bokstav) == 29){
			showMessageDialog(null,"Du har ikke tastet inn en bokstav, så du vil nå få antall forekomster av alle spesialtegn i teksten.");
		}

//Få fram tabell:
		System.out.println("\nTekst nr: " + runde + "\nBokstavene som forekomster: \n" + tekst.getTabell());

//Finn antall bokstaver i teksten:
		System.out.println("Totall antall bokstaver: " + tekst.findTotal());

//Finn antall foskjellige bokstaver:
		System.out.println("Antall forskjellige bokstaver: " + tekst.getUlike());

//Finn prosent mellom bokstaver og ikke:
		System.out.println("Prosent som er spesialltegn: " + tekst.getProsent());

//Antall forekomster av en bestemt bokstav:
		if(tekst.findIndeks(bokstav) == 29){
			System.out.println("Antall ganger spesialtegn forekomster er: " + tekst.getBokstav(bokstav));
		}
		System.out.println("Antall ganger bokstaven  " + bokstavLest + "  forekomster er: " + tekst.getBokstav(bokstav));

//hvilken bokstav forekomster oftest:
		System.out.println("Bokstaven(e) som forekomster oftest: " + tekst.getOftest());

//sjekk om brukeren vil analysere flere tekster:
 		int svar = showConfirmDialog(null, "Vil du analysere enda en tekst?", "Du har analysert " + runde + " tekster",YES_NO_OPTION);
 			if (svar == YES_OPTION) {
			   runde++;
			} else{
				runde = 0;
				break;
			}
		}
	}
}