package ro.usv;

import java.util.Comparator;

public class Main {
     public static void main(String[] args) {

        NavaCroaziera sv = new NavaCroaziera("Suceava","Ro",1000);
        System.out.print(sv + "Utilizare: ");
        sv.utilizare();

        NavaCroaziera sv2 = new NavaCroaziera("Victoria","Ro",5000);
        System.out.print(sv2 + "Utilizare: ");
        sv2.utilizare();

        // Flota flota1= new Flota();
       flota1.adaugaNava(sv);
        flota1.adaugaNava(sv1);
        flota1.adaugaNava(sv2);
        flota1.adaugaNava(sv3);
        flota1.adaugaNava(sv4);

       Arrays.sort(flota.nave,new Comparator<Nava>())
        {
            @Override
                    public int compare (Nava s1,Nava s2)
            {
                return s1.getPavilion,compareTo(sv2.getPavilion());
            }
        }
        System.out.println(Flota.toString());
    }
}
