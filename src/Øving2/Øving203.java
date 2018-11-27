package Øving2;//�ving 2.3: Skudd�r
	//SKS 23.08.2017

class �ving203 {
	public static void main(String[] args){

	//Les inn data fra bruker
	String inputLest = showInputDialog("Antall �r:");
		int input = Integer.parseInt(inputLest);

	//beregn svar
	final int skudd1 = input % 4;
	final int skudd2 = input % 400;
	final int skudd3 = input % 100;

	//gir tilbakemelding til bruker

		if (skudd1 == 0 && skudd3 != 0)
		{
				showMessageDialog(null, "Det er skudd�r");
		}
		else if (skudd1 == 0 && skudd2 == 0 && skudd3 == 0)
		{
				showMessageDialog(null, "Det er skudd�r");
		}
		else
		{
				showMessageDialog(null, "Det er ikke skudd�r");
		}
	}
}