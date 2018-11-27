package Øving6;/*Oppgave 7.1
	SKS 25.09.2017	*/

import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.showInputDialog;
class RandomFra0til9{
	public static void main (String[]args){

	while(true){
		String lest = showInputDialog(null,"Skriv inn maks gjennoml�p: ","Maks gjennoml�p", QUESTION_MESSAGE);
		if(lest == null || lest.isEmpty()){break;}//try catch
		int gjennoml�p = Integer.parseInt(lest);
		if(gjennoml�p < 1){break;}

		java.util.Random random = new java.util.Random();

	 //tall er mellom 0,9

		int[] antall = new int [10];

		for(int i=0; i<gjennoml�p; i++){
			int tall = (random.nextInt(30) - 10);
			antall[tall]++;
		}
		for(int n=0; n<antall.length; n++)
     		System.out.println("\n Antall ganger tallet " + (n+1) + " ble hentet: " + antall[n]);
     		break;
		}
	}
}