public class ArbTaker{

 	private final int arbtakernr;
 	private final int ansettelsesår;
 	private int måndeslønn;
 	private double skatteprosent;
 	private java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
 	private int år = kalender.get(java.util.Calendar.YEAR);
 	private Person person;

	public ArbTaker(String fornavn, String etternavn, int fødselsår, int arbtakernr, int ansettelsesår, int måndeslønn, double skatteprosent){
		this.arbtakernr = arbtakernr;
		this.ansettelsesår = ansettelsesår;
		this.måndeslønn = måndeslønn;
		this.skatteprosent = skatteprosent;
		this.person = new Person(fornavn,etternavn,fødselsår);
 	}

//Set-metoder:
	public void setMåndeslønn(int nyMåndeslønn){
		måndeslønn = nyMåndeslønn;
	}
	public void setSkatteprosent(double nySkatteprosent){
		skatteprosent = nySkatteprosent;
	}
//Get-metoder:
	public int getArbtakernr(){
		return arbtakernr;
	}
	public int getAnsettelsesår(){
		return ansettelsesår;
	}
	public int getMåndeslønn(){
		return måndeslønn;
	}
	public double getSkatteprosent(){
		return skatteprosent;
	}
//Skatt pr månde:
	public double getSkattPrMånde(){
		return (måndeslønn * (skatteprosent / 100));
	}
//Bruttolønn pr år:
	public double getBruttolønn(){
		return (måndeslønn * 12);
	}
//SkatteTrekk pr år: //juni skattefri og desember halv skatt:
	public double getSkattetrekk(){
		return (getSkattPrMånde() * 10) + (måndeslønn * (skatteprosent / 200));
	}
//Get navn på formen:
	public String getNavn(){
		return person.toString();
	}
//Finn alder:
	public int getAlder(){
		return år - person.getFødselsår();
	}
//Antall år ansatt:
	public int antallÅrAnsatt(){
		return år - ansettelsesår;
	}
//Ansatt mer enn gitt antall år?:
	public boolean erAnsattMerEnnÅr(int årTest){
		if(antallÅrAnsatt() > årTest){
			return true;
		}else{
			return false;
		}
	}
}