package ro.usv;

public class Student extends Persoana {
    private float medieAdmitere;
    private Facultate facultate;
    @Override
    public String toString() {
        return "stud. " +super.toString()+", " + medieAdmitere + ", " + facultate;
    }
    public Student(String nume, Gen gen, float medieAdmitere, Facultate facultate) {
        super(nume,gen);
        this.medieAdmitere = medieAdmitere;
        this.facultate = facultate;
    }
    public Student(){
    //    medieAdmitere = r.nextInt(10)+5;
    //    facultate=Facultate.getFacultate(r.next())
        super();
        facultate=Facultate.getFacultate(r.nextInt(Facultate.nrFacultati));
        medieAdmitere = 5 + ((10-5) * r.nextFloat());
    }
        // trebuie completat ca sa genereze aleator date pt. a construi
        // un student (medie admitere >=5 si facultate)
    }
    public float getMedieAdmitere() {
        return medieAdmitere;
    }
    public Facultate getFacultate() {
        return facultate;
    }
// clasa mai trebuie completata si cu altele pentru
// ca aplicatia sa poata functiona asa cum s-a cerut