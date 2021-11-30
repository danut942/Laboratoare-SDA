package ro.usv;

public class Sofer extends Persoana implements IAngajat {
    private static final int nrMaxOreLucrate = 300;
    private static final int kmParcursiMax = 5000;
    private double coeficientSlarial = 1.5;
    private int kmParcursi;
    private int nrOreLucrate;
    private int coeficientSalarial = 1;

    public Sofer(String nume, String prenume, int nrOreLucrate, int kmParcursi) {
        super(nume, prenume);
        this.kmParcursi = kmParcursi;
        this.nrOreLucrate = nrOreLucrate;
    }
    @Override
    public int setNrOreLucrate(int nrOreLucrate) {
        return nrOreLucrate;
    }

    @Override
    public double salariu() {
        return (salariuOrarMinim * coeficientSalarial)*setNrOreLucrate(nrOreLucrate) + kmParcursi * 0.1;
    }
    public String toString() {
        return "Sofer "+ super.toString() + " a lucrat "+ nrOreLucrate +" ore, a parcurs "+kmParcursi+" km - salariu = " + salariu();
    }
}
