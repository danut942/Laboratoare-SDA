package ro.usv;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class Magazin {
    private Map <Integer, Produs> inventar = new HashMap <Integer, Produs>();
    private Map<Integer, Produs> vanzari = new HashMap <Integer, Produs>();

    public int aprovizioneaza (int codProdus, int qa)
    {
        if (inventar.containsKey(codProdus))
        {
            Produs p = inventar.get(codProdus);
            p.setCantitate(p.getCantitate() + Math.abs(qa));
            //inventar.put(codProdus, p);
            return p.getCantitate();
        }
        else
        {
            return -1;
        }
    }

    public int aprovizioneaza (int codProdus, String denumire, int pret, int qa)
    {
        if (this.inventar.containsKey(codProdus))
        {
            return -1;
        }
        else
        {
            Produs p = new Produs (codProdus, pret, qa, denumire);
            this.inventar.put(codProdus,p);
            return qa;
        }
    }

    public int vanzare (int codProdus,int qv)
    {
        if (inventar.containsKey(codProdus))
        {
            Produs p = this.inventar.get(codProdus);
            int remaining = p.getCantitate();
            if (qv > remaining)
            {
                qv = remaining;
            }
            remaining = remaining - qv;
            if (remaining == 0)
            {
                this.inventar.remove(codProdus);
            }
            else
            {
                p.setCantitate(remaining);
            }
            if (this.vanzari.containsKey(codProdus))
            {
                Produs pV = this.vanzari.get(codProdus);
                pV.setCantitate(pV.getCantitate()+ qV);
            }
            else
            {
                produs pV = new Produs (codProdus, p.getPret(), qv, p.getDenumire());
                this.vanzari.put(codProdus, pV);
            }
            return qv;
        }
        else
        {
            return -1;
        }
    }

    public int vanzare (int codProdus)
    {
        return vanzare(codProdus, 1);
    }

    public void situatieVanzari()
    {
        situatieVanzari (false,null);
    }

    public void situatieProdus(String denumire)
    {
        situatieVanzari(true,denumire);
    }

    private void situatieVanzari(boolean filterByDenumire, String denumire)
    {
        int totalVanzari = 0;
        System.out.println("cod denumire pret cantitateExist. cantitateVanduta");
        for (int codProdus : this.vanzari.keySet())
        {
            Produs pV = this.vanzari.get(codProdus);
            if ( filterByDenumire && !pV.getDenumire().equals(denumire))
            {
                continue;
            }
            Produs pI = this.inventar.get(codProdus);
            int cantitateExist = 0;
            if (pI != null)
            {
                cantitateExist = pI.getCantitate();
            }
            int valVanzare = pV.getCantitate() + pV.getPret();
            totalVanzari += valVanzare;
            System.out.println(codProdus + " " + pV.getDenumire() + " " + pV.getDenumire() + " " + cantitateExist + " " + pV.getCantitate() + " " + valVanzare);
        }
        System.out.println("Total vanzari: " + totalVanzari);
    }

    public static void main (String[] args)
    {
        Magazin magazin = new Magazin();
        magazin.aprovizioneaza(1,"mouse",10,5);
        magazin.aprovizioneaza(2,"monitor",100,3);
        magazin.aprovizioneaza(3,"TV",500,2);

        magazin.vanzare(2 ,3);
        magazin.vanzare(1, 3);
        //magazin.vanzare(4);
        magazin.situatieVanzari();

        magazin.situatieProdus("monitor");

        //System.out.println(magazin.aprovizioneaza(33,3));
        //System.out.println(magazin.aprovizioneaza(1,5));
    }

}
