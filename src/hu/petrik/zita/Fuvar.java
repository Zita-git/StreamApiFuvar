package hu.petrik.zita;


import java.time.LocalDateTime;

public class Fuvar {
    private String fizetes_modja;
    private int taxi_id,idotartam;
    private LocalDateTime indulas;
    private Double tavolsag,viteldij,borravalo;

    public Fuvar(String s){
        String[] adatok=s.split(";");
        this.taxi_id=Integer.parseInt(adatok[0]);

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

    public LocalDateTime getIndulas() {
        return indulas;
    }

    public void setIndulas(LocalDateTime indulas) {
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
        return "Fuvar{" +
                "fizetes_modja='" + fizetes_modja + '\'' +
                ", taxi_id=" + taxi_id +
                ", idotartam=" + idotartam +
                ", indulas=" + indulas +
                ", tavolsag=" + tavolsag +
                ", viteldij=" + viteldij +
                ", borravalo=" + borravalo +
                '}';
    }
}
