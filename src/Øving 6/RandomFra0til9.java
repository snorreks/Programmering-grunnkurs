/*Oppgave 7.1
	SKS 25.09.2017	*/

import static javax.swing.JOptionPane.*;
class RandomFra0til9{
	public static void main (String[]args){

	while(true){
		String lest = showInputDialog(null,"Skriv inn maks gjennomløp: ","Maks gjennomløp", QUESTION_MESSAGE);
		if(lest == null || lest.isEmpty()){break;}//try catch
		int gjennomløp = Integer.parseInt(lest);
		if(gjennomløp < 1){break;}

		java.util.Random random = new java.util.Random();

	 //tall er mellom 0,9

		int[] antall = new int [10];

		for(int i=0; i<gjennomløp; i++){
			int tall = (random.nextInt(30) - 10);
			antall[tall]++;
		}
		for(int n=0; n<antall.length; n++)
     		System.out.println("\n Antall ganger tallet " + (n+1) + " ble hentet: " + antall[n]);
     		break;
		}
	}
}