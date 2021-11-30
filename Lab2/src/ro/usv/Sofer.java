package ro.usv;

public class Sofer extends Persoana implements Angajat{
    private static final int nrMaxOreLucrate = 300;
    private static final int kmParcursiMax = 5000;
    private int kmParcursi=0;
    public Sofer(String nume, String prenume, int id) {
        super(nume, prenume, id);
    }
    @Override
    public int getNrMaxOreLucrate() {
        return nrMaxOreLucrate;
    }
    @Override
    public double salariu() {
        return super.salariu() + kmParcursi * 0.1;
    }
    public void setKm_parcursi(int kmParcursi) {
        this.kmParcursi = Math.max(kmParcursi, 0);
        this.kmParcursi = Math.min(this.kmParcursi, kmParcursiMax);
    }

    @Override
    public String toString() {
        return "Sofer{" +
                "kmParcursi=" + kmParcursi +
                '}';
    }
}
