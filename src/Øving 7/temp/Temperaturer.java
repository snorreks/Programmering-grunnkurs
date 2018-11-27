public class Temperaturer{

 	private int timer;
 	private int dager;
	private int[][] månde;
	private java.util.Random random = new java.util.Random();

	public Temperaturer(int dager,int timer){
		this.dager = dager;
		this.timer = timer;
		this.månde = månde;
		this.månde = new int[dager][timer];
		lagTemp();
 	}

//Lage random temp i timene og dagene:
	public void lagTemp(){
		for(int i = 0; i < dager; i++){
			for(int n = 0; n < timer; n++){
			månde[i][n] += (random.nextInt(40) -  20) + random.nextDouble();

			}
		}
	}

//Finn middeltemp for hver dag i månden:
	public double finnMidDag(int a){
		double sum = 0;
		for (int i = 0; i < timer; i++){
			sum += månde[a][i];
		}
		return ((sum / dager) * 1.00);
	}

//Finn middtemp for hver time i døgnet for månden:
	public double finnMidTime(int b){
		double sum = 0;
		for (int i = 0; i < dager; i++){
			sum += månde[i][b];
		}
		return ((sum / timer) * 1.00);
	}

//Finn midtemp for hele månden:
	public double finnMidMånde(){
		double sum = 0;
		for(int a = 0; a < dager; a++){
			sum += (finnMidDag(a));
		}
		return (sum / dager);
	}

//Finn antall døgn med spesefikk middtemp:
	public int finnAntDøgn(int valg){
		int antallDager = 0;
			switch(valg){

				case 0:	//mindre enn -5 grader
				for(int i = 0; i < dager; i++){
					if(finnMidDag(i) < - 5){
					antallDager++;
					}
				}
				break;

				case 1:	//mellom -5 og 0 grader
				for(int i = 0; i < dager; i++){
					if(finnMidDag(i) >= - 5 && finnMidDag(i) < 0){
					antallDager++;
					}
				}
				break;

				case 2:	//mellom 0 og 5 grader
				for(int i = 0; i < dager; i++){
					if(finnMidDag(i) >= 0 && finnMidDag(i) < 5){
						antallDager++;
					}
				}
				break;

				case 3:	//mellom 5 og 10 grader
				for(int i = 0; i < dager; i++){
					if(finnMidDag(i) >= 5 && finnMidDag(i) < 10){
						antallDager++;
					}
				}
				break;

				case 4: //over 10 grader
				for(int i = 0; i < dager; i++){
					if(finnMidDag(i) >= 10){
					antallDager++;
					}
				}
				break;
			}
		return antallDager;
	}
}