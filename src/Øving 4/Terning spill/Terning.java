public class Terning{

	private String navn;
	private int poeng;
	private int antallKast;
	java.util.Random terning = new java.util.Random();

	public Terning(String navn) {
  		this.navn = navn;
  		this.poeng = 0;
  		this.antallKast = 0;
	}
  	public int getPoeng() {
    	return poeng;
	}
	public int getTerningKast(){
		int terningKast = terning.nextInt(6) + 1;
		return terningKast;
	}

	public void addPoeng(int kast){
		if(kast == 1){
			this.poeng = 0;
		}else{
			poeng = this.poeng + kast;
		}
	}
}