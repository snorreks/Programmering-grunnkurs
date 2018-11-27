public class Brøk{

	private int teller;
	private int nevner;

	public Brøk(int teller, int nevner) {
		if(nevner == 0){throw new IllegalArgumentException("ikke gyldig");}
  		this.teller = teller;
  		this.nevner = nevner;
	}
	public Brøk(int teller){
		this.teller = teller;
		this.nevner = 1;
	}
	public int getTeller(){
		return teller;
	}
	public int getNevner(){
		return nevner;
	}

	public void getPlussTeller(int teller2, int nevner2){
		if (nevner == nevner2){
			int plussTeller = teller + teller2;
			int plussNevner = nevner;
			teller = plussTeller;
			nevner = plussNevner;
		} else {
			int plussTeller = (teller * nevner2) + (teller2 * nevner);
			int plussNevner = (nevner * nevner2);
			this.teller = plussTeller;
			this.nevner = plussNevner;
		}
	}

	public void getMinusTeller(int teller2, int nevner2){
		if (nevner == nevner2){
			int minusTeller = teller - teller2;
			int minusNevner = nevner;
			this.teller = minusTeller;
			this.nevner = minusNevner;
		} else {
			int minusTeller = (teller * nevner2) - (teller2 * nevner);
			int minusNevner = (nevner * nevner2);
			this.teller = minusTeller;
			this.nevner = minusNevner;
		}
	}

	public void getGangeTeller(int teller2, int nevner2){
		int gangeTeller = teller * teller2;
		int gangeNevner = nevner * nevner2;
		this.teller = gangeTeller;
		this.nevner = gangeNevner;
	}
	public void getDelingTeller(int teller2, int nevner2){
		int delingTeller = teller * nevner2;
		int delingNevner = nevner * teller2;
		this.teller = delingTeller;
		this.nevner = delingNevner;
	}
}