package ro.usv;
public class Persoana {
    private String nume;
    private String prenume;

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public Persoana(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }
    @Override
    public String toString() {
        return getNume() + " " + getPrenume();
    }
}