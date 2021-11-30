package ro.usv;

public class CalculSalarii {
    public static void main(String[] args) {

        int TotalSum=0;
        Inginer i = new Inginer("Barbulescu","Barbu",100);
        TotalSum+=i.salariu();
        Inginer i2 = new Inginer("Trestie","Tudor",200);
        TotalSum+=i2.salariu();
        Sofer s = new Sofer("Repede","Raul",250,1000);
        TotalSum+=s.salariu();
        System.out.println(i);
        System.out.println(i2);
        System.out.println(s);
        System.out.println(TotalSum);
    }
}
