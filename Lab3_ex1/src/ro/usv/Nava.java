package ro.usv;

public abstract class Nava {
    private String nume,pavilion;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPavilion() {
        return pavilion;
    }

    public void setPavilion(String pavilion) {
        this.pavilion = pavilion;
    }

    public Nava(String nume, String pavilion) {
        this.nume=nume;
        this.pavilion=pavilion;
    }

    public String toString() {
        return "Nava{" +
                "nume=" + nume +
                ", pavilion=" + pavilion +
                ' ';
    }
     public abstract void utilizare();
}
