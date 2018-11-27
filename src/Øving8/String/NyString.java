package Øving8.String;

public class NyString{

    private final String tekst;

    public NyString(String tekst){
        this.tekst = tekst;
    }

    //dele Stringen i ord og finne f�rste bokstav:
    public String Forkort(){
        String print = "";
        String[] ord = tekst.split("[,.;:!? ]");
        for(int i = 0; i < ord.length; i++){
            String ordz = ord[i];
            print += ordz.substring(0,1);
            print += " ";
        }
        return print;
    }

    public String FjernTegn(String input){
        return tekst.replace(input, "");
    }
}