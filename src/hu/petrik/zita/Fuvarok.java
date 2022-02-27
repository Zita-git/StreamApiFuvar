package hu.petrik.zita;

import java.io.*;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Fuvarok {
    private List<Fuvar> fuvarok;
    public Fuvarok(String file) {
        fuvarok = new LinkedList<>();
        try{
            FileReader fr =new FileReader(file);
            BufferedReader br= new BufferedReader(fr);
            br.readLine();
            String sor=br.readLine();
            while(sor!=null){
                fuvarok.add(new Fuvar(sor));
                sor=br.readLine();
            }
            br.close();
            fr.close();

        }catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }catch (IOException ex){
            System.err.println( ex.getMessage());
        }

    }
    public long utazasokSzama(){
        return fuvarok.stream().count();
    }

    public double doll(double a){
        return fuvarok.stream().filter(fuvar -> fuvar.getTaxi_id()== a).mapToDouble(fuvar -> fuvar.getViteldij()+fuvar.getBorravalo()).sum();
    }
    public long db(int a){
        return fuvarok.stream().filter(fuvar -> fuvar.getTaxi_id()== a).count();
    }
    public String bevetelFuvar(int a){
        double bevetel;
        long szam;
        szam=db(a);
        bevetel=doll(a);

        return String.format(a+" azonósító számmal rendelkező taxinak a bevétele %4.2f $, ami %d fuvarból állt.",bevetel,szam);
    }
    public double merfoldMind(){
        return fuvarok.stream().mapToDouble(Fuvar::getTavolsag).sum();
    }

    public Fuvar leghosszabbFuvar(){
        return fuvarok.stream().max(Comparator.comparingDouble(fuvar -> fuvar.getIdotartam())).get();
    }

    public Fuvar legbokezubbFuvar(){
        return fuvarok.stream().max(Comparator.comparingDouble(fuvar -> fuvar.getBorravalo())).get();
    }

    public double merfold(int a){
        return fuvarok.stream().filter(fuvar -> fuvar.getTaxi_id()== a).mapToDouble(fuvar->fuvar.getTavolsag()).sum();
    }
    public String osszKilometer(int a){
        double szam;
        szam=merfold(a)*1.6;

        return String.format(a+" azonósító számmal rendelkező taxis összesen %2.2f kilómétert tett meg.",szam);
    }





    @Override
    public String toString() {
        String s="";
        for (Fuvar fu:this.fuvarok) {
            s+=fu+"\n";
        }
        return s;
    }
}
