package Øving10;

public class Oppgaveoversikt{

    private Student[] studenter; //tabellen opprettes i konstukt�ren
    private int antStud = 30; // �kes med 1 for hver ny student


    public Oppgaveoversikt(Student[] studenter, int antStud){ //hvor mange oppgave studenten har gjort
        this.antStud = antStud;
        this.studenter = studenter;
    }

    public int finnStudNr(String input){
        int x = -1;
        for (int i = 0; i < antStud; i ++){
            if((studenter[i].getNavn()).equals(input)){
                x = i;
            }
        }
        return x;
    }

    public Student getStudKlasse(String input){
        if(finnStudNr(input) != -1){
            return studenter[finnStudNr(input)];
        } else {
            return new Student("Ingen student",0);
        }
    }

    public String getStudentNavn(int input){
        return studenter[input].getNavn();
    }

    public int getAntStud(){
        return antStud;
    }

    public int getAntOppgaver(String input){ //antall oppgaver en bestemt har l�st
        return studenter[finnStudNr(input)].getAntOppg();
    }

    public void nyStudent(String input, int oppg){ //registrer ny student
        int lengde = studenter.length + 1;
        Student[] nyTab = new Student[lengde];
        nyTab[lengde - 1] = new Student(input,oppg);
        for (int i = 0 ; i < studenter.length; i++){
            nyTab[i] = studenter[i];
        }
        studenter = new Student[lengde];
        for (int n = 0; n < lengde; n++) {
            studenter[n] = nyTab[n];
        }
        antStud++;
    }

    public void nyOppg(String input, int antall){ //�k antall oppgaver for en bestemt student
        studenter[finnStudNr(input)].�kAntOppg(antall);
    }

    public boolean testNavn(String input){
        for (int i = 0; i < antStud; i++){
            if (studenter[i].getNavn().equals(input)){
                return true;
            }
        }
        return false;
    }

    public String toString(){
        String print = ("Det er totalt " + antStud + " studenter: \n");
        for (int i = 0; i < antStud; i++){
            print += ("Nr: " + (i+1) + ": " +  getStudentNavn(i));
            print += (" har " + getAntOppgaver(getStudentNavn(i)) + " oppgaver. \n");
        }
        return print;
    }
}