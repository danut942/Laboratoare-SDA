package ro.usv;

import java.util.Arrays;

public class Flota {

    private int nrNave;
    private Nava[] nave;

    public Flota(){
        nrNave=0;
        nave = new Nava[10];
    }
    public void adaugaNava(Nava x)
    {
        if(nrNave>=nave.length)
        {
            nave = Arrays.copyOf(nave,nave.length+1);
        }
        nave(NrNave) =x;
        nrNave ++;
    }
}
