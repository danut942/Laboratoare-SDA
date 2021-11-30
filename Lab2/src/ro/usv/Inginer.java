package ro.usv;
public class Inginer extends Persoana implements IAngajat {
    private static final int nrMaxOreLucrate = 250;
    private double coeficientSlarial = 1.5;
    int nrOreLucrate;

    public Inginer(String nume, String prenume,int nrOreLucrate) {
        super(nume, prenume);
        this.nrOreLucrate=nrOreLucrate;
    }
    @Override
    public int setNrOreLucrate(int nrOreLucrate) {
        return nrOreLucrate;
    }

    @Override
    public double salariu() {
        return (salariuOrarMinim*coeficientSlarial)*setNrOreLucrate(nrOreLucrate);
    }

    public String toString() {
        return "Inginer "+ super.toString() + " a lucrat "+ nrOreLucrate +" ore - salariu = " + salariu();
    }
}
