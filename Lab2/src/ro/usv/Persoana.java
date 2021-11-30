package ro.usv;
public class Persoana {
    private String nume;
    private String prenume;
    public Persoana(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }
    @Override
    public String toString() {
        return nume + " " + prenume;
    }
}