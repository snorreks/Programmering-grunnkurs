package Øving5.Random;

public class MinRandom{

	java.util.Random random = new java.util.Random();


	public int nesteHeltall(int nedre, int ovre){ // intervallet [nedre, ovre]
		int tall = random.nextInt(ovre-nedre) + nedre;
		return tall;
	}

	public double nesteDesimaltall(int nedre, int ovre){ //intervaller [nedre, ovre]
		double tall = (random.nextInt(ovre-nedre) +  nedre) + random.nextDouble();
		return tall;
	}
}