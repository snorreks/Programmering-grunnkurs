package Øving2;//�ving 2.4: Kj�ttdeig
	//SKS 23.08.2017

class �ving204 {
	public static void main(String[] args){

	//Les inn data fra bruker
	String GramALest = showInputDialog("Antall gram for kj�ttdeig A:");
		int gramA = Integer.parseInt(GramALest);

	String PengerALest = showInputDialog("Prisen for kj�ttdeig A");
		double pengerA = Double.parseDouble(PengerALest);

	String GramBLest = showInputDialog("Antall gram for kj�ttdeig B:");
		int gramB = Integer.parseInt(GramBLest);

	String PengerBLest = showInputDialog("Prisen for kj�ttdeig B");
		double pengerB = Double.parseDouble(PengerBLest);

	//beregn svar
		double kpgA = gramA  / pengerA;
		double kpgB = gramB  / pengerB;

		if (kpgA > kpgB){
			double sum1 = kpgA - kpgB;
				showMessageDialog(null, "Kj�ttdeig A er billigere enn kj�ttdeig B");

		} else {
			double sum2 = kpgB - kpgA;
				showMessageDialog(null, "Kj�ttdeig B er billigere enn kj�ttdeig A");

		}
	//gir tilbakemelding til bruker
	}
}