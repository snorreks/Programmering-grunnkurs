package Øving11;/*Oppgave 16.13.3
	SKS 26.10.2017	*/

import java.io.*;

import static javax.swing.JOptionPane.*;

class SaldoVedlikehold{
	public static void main (String[]args) throws IOException{
		while(true){

			String saldoLest = "saldo.txt";
			String transaksjoner = "transaksjoner.txt";

			FileReader sFile = new FileReader(saldoLest);
			BufferedReader buffer2 = new BufferedReader(sFile);
			String saldoBLest = buffer2.readLine();
			buffer2.close();

			double saldo = Double.parseDouble(saldoBLest);

			FileReader file = new FileReader(transaksjoner);
			BufferedReader buffer = new BufferedReader(file);

			double sum = 0.00;
			String transaksjon = buffer.readLine();
			while (transaksjon != null){
				String[] ord = transaksjon.split("[ ]");
				double delSum = Double.parseDouble(ord[1]);
				if(Character.toUpperCase(ord[0].charAt(0)) == 'U'){
					sum -= delSum;
				}else if(Character.toUpperCase(ord[0].charAt(0)) == 'I'){
					sum += delSum;
				}
				transaksjon = buffer.readLine();
		}
		buffer.close();

			int valg = showConfirmDialog(null, "Vil du kj�re oppdatere saldoen din?", "Saldoen din er: " + saldo + "kr", YES_NO_OPTION);
			if(valg == CLOSED_OPTION || valg == 1) break;

			saldo += sum;

			if (saldo < 0) {
				showMessageDialog(null,"Saldoen din er under 0 kr","Ny saldo", QUESTION_MESSAGE);
				new File("transaksjoner.txt").delete();
				break;
			}

			showMessageDialog(null,"Saldoen din er n�: " + saldo + "kr","Ny saldo", QUESTION_MESSAGE);

			new PrintWriter(saldoLest).close();

			FileWriter files = new FileWriter(saldoLest,true);
			PrintWriter skriver = new PrintWriter(new BufferedWriter(files));
			skriver.println(saldo);
			skriver.close();

		break;
		}
	}
}