package Øving9.Person;

public class ArbTaker{

    private final int arbtakernr;
    private final int ansettelses�r
    private int m�ndesl�nn
    private double skatteprosent;
    private java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
    private int �r =kalender.get(java.util.Calendar.YEAR)
    private Person person;

    public ArbTaker(String fornavn, String etternavn, int f�dsels�r, int arbtakernr, int ansettelses�r, int m�ndesl�nn, double skatteprosent){
        this.arbtakernr = arbtakernr;
        this.ansettelses�r = ansettelses�r;
        this.m�ndesl�nn = m�ndesl�nn;
        this.skatteprosent = skatteprosent;
        this.person = new Person(fornavn,etternavn,f�dsels�r);
    }

    //Set-metoder:
    public void setM�ndesl�nn(int nyM�ndesl�nn){
        m�ndesl�nn = nyM�ndesl�nn;
    }

    public void setSkatteprosent(double nySkatteprosent){
        skatteprosent = nySkatteprosent;
    }
//Get-metoder:
public int getArbtakernr(){
    return arbtakernr;
}

    public int getAnsettelses�r(){
        return ansettelses�r;
    }

    public int getM�ndesl�nn(){
        return m�ndesl�nn;
    }

    public double getSkatteprosent(){
        return skatteprosent;
    }
//Skatt pr m�nde:
public double getSkattPrM�nde(){
        return (m�ndesl�nn * (skatteprosent / 100))
    }
//Bruttol�nn pr �r:
public double getBruttol�nn(){
        return (m�ndesl�nn * 12)
    }
//SkatteTrekk pr �r: //juni skattefri og desember halv skatt:
public double getSkattetrekk(){
    return (getSkattPrM�nde() * 10)+(m�ndesl�nn * (skatteprosent / 200))
}
//Get navn p� formen:
public String getNavn(){
    return person.toString();
}
//Finn alder:
public int getAlder(){
    return �r - person.getF�dsels�r();
}
//Antall �r ansatt:
public int antall�rAnsatt(){
        return �r - ansettelses�r;
    }
//Ansatt mer enn gitt antall �r?:
public boolean erAnsattMerEnn�r(int �rTest){
        if(antall�rAnsatt() > �rTest){
            return true;
        }else{
            return false;
        }
    }
}