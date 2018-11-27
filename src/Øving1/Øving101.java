package Øving1;//�ving 1: Tommer til cm
	//SKS 21.08.2017

class �ving101 {
	public static void main(String[] args){

	//les inn data fra bruker
	String TommerLest = showInputDialog("Tommer:");
		double lengde = 2.54;
		int tommer = Integer.parseInt(TommerLest);

	//beregn svar
		double sum = tommer * lengde;

	//gir tilbakemelding til bruker
			showMessageDialog(null, "Tommer  " + sum + " cm.");
	}
}