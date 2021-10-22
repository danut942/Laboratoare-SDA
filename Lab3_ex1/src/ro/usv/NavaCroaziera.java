package ro.usv;

public class NavaCroaziera extends Nava{
    private int nrPasageri;

    public NavaCroaziera(String nume, String pavilion, int nrPasageri) {
        super(nume, pavilion);
        this.nrPasageri = nrPasageri;
    }

    public void utilizare()
    {
        System.out.println("Croaziera de lux");
    }

    public String toString() {
        return super.toString() + "nrPasageri=" +nrPasageri +
                '}';
    }
}
