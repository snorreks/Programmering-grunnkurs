package Øving8.TekstBehandling;

public class TekstBehandling{

    private final String tekst;

    public TekstBehandling(String tekst){
        this.tekst = tekst;
    }

    public int getAntallOrd(){
        String[] ord = tekst.split("[ ]");
        return ord.length;
    }

    public String finnGSordLengde(){
        String[] ord = tekst.split("[ ,.;:!?]");
        double antallBokstaver = 0;
        for(int i = 0; i < ord.length; i++){
            String ordlengde = ord[i];
            antallBokstaver += ordlengde.length();
        }
        double ordLengde = (antallBokstaver / (double)ord.length);
        return String.format("%.2f", ordLengde);

    }

    public int getPerioder(){
        String[] periode = tekst.split("[,.;:!?]");
        return periode.length;
    }

    public String finnGSantallOrd(){
        double GSantallOrd = ((double)getAntallOrd() / (double)getPerioder());
        return String.format("%.2f", GSantallOrd);
    }

    public String Replaceify(String input,String output){
        return tekst.replace(input, output);
    }

    public String toString(){
        return tekst;
    }

    public String getStorTekst(){
        return tekst.toUpperCase();
    }
}