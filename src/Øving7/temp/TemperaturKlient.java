package Øving7.temp;/*Oppgave 7.3
	SKS 01.10.2017	*/

import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.showInputDialog;
class TemperaturKlient{
	public static void main (String[]args){

		boolean run = true;
		while(run){

//Leser inn data fra brukeren:
			String lest1 = showInputDialog(null,"Antall dager: ","Temperatur simulation ", QUESTION_MESSAGE);
			if(lest1 == null || lest1.isEmpty()){run = false; break;}
			try{
				float i = Float.valueOf(lest1);
			}catch(NumberFormatException ex){
            System.err.println("Ugyldig input");
			run = false;
			break;
			}
			String lest2 = (showInputDialog(null,"Antall timer: ","Temperatur simulation", QUESTION_MESSAGE));
			if(lest2 == null || lest2.isEmpty()){run = false; break;}
			try{
				float i = Float.valueOf(lest2);
			}catch(NumberFormatException ex){
            System.err.println("Ugyldig input");
			run = false;
			break;
			}
				int dager = Integer.parseInt(lest1);
				int timer = Integer.parseInt(lest2);

//Henter klassen Temperaturer:
			Temperaturer temp = new Temperaturer(dager,timer);

//Finn midTemp hver dag:
		for(int a = 0; a < dager; a++){
			System.out.printf("\nDag " + (a+1) + " har grad: " + "%.2f", temp.finnMidDag(a));
		}

			System.out.println("\n");

//Finn midTemp hver time:
		for(int b = 0; b < timer; b++){
			System.out.printf("\nTime " + (b+1) + " har grad: " + "%.2f", temp.finnMidTime(b));
		}

//Finn midtemp for hele m�nden:
			System.out.printf("\n\nMiddeltemperaturen for hele m�nden  " + "%.2f", temp.finnMidM�nde());

//Finn antall dager med spesifikk midTemp:
			System.out.println("\n\nAntall dager som hadde middeltemperatur mindre enn -5 grader:              " + temp.finnAntD�gn(0));
			System.out.println("Antall dager som hadde middeltemperatur mer enn -5 og mindre enn 0 grader: " + temp.finnAntD�gn(1));
			System.out.println("Antall dager som hadde middeltemperatur mer enn 0 og mindre enn 5 grader:  " + temp.finnAntD�gn(2));
			System.out.println("Antall dager som hadde middeltemperatur mer enn 5 og mindre enn 10 grader: " + temp.finnAntD�gn(3));
			System.out.println("Antall dager som hadde middeltemperatur mer enn 10 grader                  " + temp.finnAntD�gn(4));

			run = false;
		}
	}
}