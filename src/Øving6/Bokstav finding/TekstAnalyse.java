package Øving6.Bokstav

public class TekstAnalyse{

    private String tekst;
    private int[] antallTegn = new int[30];

    public TekstAnalyse(String tekst){
        this.tekst = tekst;
    }

    //gj�r om bokstavene til tabell med int verdi
    public int findIndeks(char tegn){
        int verdi = 0;
        if(tegn >= 65 && tegn <= 90){
            verdi = tegn - 65;
        }else if(tegn == 198){
            verdi = 26;
        }else if(tegn == 216){
            verdi = 27;
        }else if(tegn == 197){
            verdi = 28;
        }else{verdi = 29;}
        return verdi;
    }

    public String getTabell(){
        String alfabetet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ���*";
        String print = "";
        for(int i=0; i < tekst.length(); i++){
            char tegn = tekst.charAt(i);
            antallTegn[findIndeks(tegn)]++;
        }
        for(int n=0; n < antallTegn.length; n++){
            print += (alfabetet.charAt(n) + ": " + antallTegn[n] + "\n");
        }
        return print;
    }

    //finn total antall bokstaver:
    public int findTotal(){
        int sum = 0;
        for(int i = 0; i < (antallTegn.length - 1); i++){
            sum += antallTegn[i];
        }
        return sum;
    }

    //finn prosent som er spesiall tegn:
    public double getProsent(){
        double spes = antallTegn[29];
        double prosent = 0.00;
        //	if (spes != 0){
        prosent = ( spes / tekst.length() ) * 100.00;
        //	}
        return prosent;
    }

    //finn antall forksjellige bokstaver i teksten
    public int getUlike(){
        int value = 0;
        for(int i = 0; i < (antallTegn.length - 1); i++){
            if(antallTegn[i] > 0){
                value ++;
            }
        }
        return value;
    }
//finn antall ganger en bestemt bokstav dukker opp:
public int getBokstav(char bokstav){
    return antallTegn[finnIndex(bokstav)];
}

    //finn st�rst antall ganger en bokstav forekomster:
    private int finnMaksimum(){
        int maks = 0;
        for(int i = 0; i < (antallTegn.length - 1); i++){
            if(antallTegn[i] > maks){ //feil her
                maks = antallTegn[i];
            }
        }
        return maks;
    }

    //Finn bokstaven som blir brukt oftest:
    public String getOftest(){
        int maks = finnMaksimum();
        String alfabetet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ���*";
        String print = "";
        if(getProsent() == 100){
            print += ("Det er ingen bokstaver i teksten");
        } else{
            for(int i = 0; i < antallTegn.length - 1; i++){
                if(antallTegn[i] == maks){
                    print += (" " + alfabetet.charAt(i) + " ");
                }
            }
        }
        return print;
    }
}