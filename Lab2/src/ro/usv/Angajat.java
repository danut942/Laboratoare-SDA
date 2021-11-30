package ro.usv;

public abstract class Angajat extends Persoana{
    private static double salariu_orar_minim=15;
    private int nrOreLucrate;
    private int id;
    public abstract int getNrMaxOreLucrate();
    public Angajat(String nume, String prenume, int id) {
        super(nume, prenume);
        this.id = id;
    }
    public void setNrOreLucrate(int nrOreLucrate){
        this.nrOreLucrate = Math.max(nrOreLucrate, 0);
        this.nrOreLucrate = Math.min(this.nrOreLucrate, getNrMaxOreLucrate());
    }
    public double salariu() {
        return salariu_orar_minim * nrOreLucrate * getCoeficientSlarial();
    }
    public double getCoeficientSlarial(){
        return 1;
    }
    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + super.toString() +
                " (ID "+ id+") "+ " a lucrat " + nrOreLucrate+ " ore";
    }

    public static void main(String[] args) {
        Persoana p = new Persoana("Ion","Vasile");
        System.out.println(p);
    }
}