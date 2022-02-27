package hu.petrik.zita;


import java.time.LocalDateTime;

public class Fuvar {
    private String fizetes_modja,indulas;
    private int taxi_id,idotartam;
    private Double tavolsag,viteldij,borravalo;

    public Fuvar(String s){
        String[] adatok=s.split(";");
        this.taxi_id=Integer.parseInt(adatok[0]);
        this.indulas = adatok[1];
        this.idotartam=Integer.parseInt(adatok[2]);
        this.tavolsag= Double.parseDouble(adatok[3].replace(",", "."));
        this.viteldij= Double.parseDouble(adatok[4].replace(",", "."));
        this.borravalo= Double.parseDouble(adatok[5].replace(",", "."));
        this.fizetes_modja=adatok[6];
    }

    public String getFizetes_modja() {
        return fizetes_modja;
    }

    public void setFizetes_modja(String fizetes_modja) {
        this.fizetes_modja = fizetes_modja;
    }

    public int getTaxi_id() {
        return taxi_id;
    }

    public void setTaxi_id(int taxi_id) {
        this.taxi_id = taxi_id;
    }

    public int getIdotartam() {
        return idotartam;
    }

    public void setIdotartam(int idotartam) {
        this.idotartam = idotartam;
    }

    public String getIndulas() {
        return indulas;
    }

    public void setIndulas(String indulas) {
        this.indulas = indulas;
    }

    public Double getTavolsag() {
        return tavolsag;
    }

    public void setTavolsag(Double tavolsag) {
        this.tavolsag = tavolsag;
    }

    public Double getViteldij() {
        return viteldij;
    }

    public void setViteldij(Double viteldij) {
        this.viteldij = viteldij;
    }

    public Double getBorravalo() {
        return borravalo;
    }

    public void setBorravalo(Double borravalo) {
        this.borravalo = borravalo;
    }

    @Override
    public String toString() {
        return String.format("Taxi azonosítója: %-7d Indulás időpontja: %-22s Utazás időtartama: %5d mp " +
                        "\nUtazás távolsága: %4.2f m  Utazás viteldíja: %4.2f $   Taxis borravalója: %5.2f $   Fizetés módja: %12s\n",
                this.taxi_id,this.indulas,this.idotartam,this.tavolsag,this.viteldij,this.borravalo,this.fizetes_modja);

    }
}
