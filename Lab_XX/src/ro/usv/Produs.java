package ro.usv;

public class Produs {
    private Integer codProdus;
    private Integer pret;
    private Integer cantitate;
    private String denumire;

    public Produs(Integer codProdus, Integer pret, Integer cantitate,String denumire) {
        this.codProdus = codProdus;
        this.pret = pret;
        this.cantitate = cantitate;
        this.denumire = denumire;
    }

    public Integer getCodProdus() {
        return codProdus;
    }

    public void setCodProdus(Integer codProdus) {
        this.codProdus = codProdus;
    }

    public Integer getPret() {
        return pret;
    }

    public void setPret(Integer pret) {
        this.pret = pret;
    }

    public Integer getCantitate() {
        return cantitate;
    }

    public void setCantitate(Integer cantitate) {
        this.cantitate = cantitate;
    }

    public String getDenumire(){
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public String toString(){
        return "Produs [codProdus=" + codProdus + ", pret=" + pret + ", cantitate=" + cantitate + ", denumire=" + denumire + "]";
    }
}
