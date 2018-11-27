package Øving4.Valuta;

public class Valuta{
	private final String name;
	private final double kurs;

	public Valuta(String name, double kurs){  //String name
		this.name = name;
		this.kurs = kurs;
	}

	public String getName(){
		return name;
	}

	public double tilNorsk(double tall){
		double sumtil = tall*kurs;
		return sumtil;
	}

	public double fraNorsk(double tall){
		double sumfra = tall / kurs;
		return sumfra;
	}
}