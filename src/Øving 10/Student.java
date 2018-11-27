public class Student{

 	private String navn; // entydig(!)
 	private int antOppg;


	public Student(String navn, int antOppg){
		this.navn = navn;
		this.antOppg = antOppg;
 	}

	public String getNavn(){
		return navn;
	}

	public int getAntOppg(){
		return antOppg;
	}

	public void økAntOppg(int øking){
		antOppg += øking;
	}

	public String toString(){
		return (navn + " " + antOppg);
	}
}