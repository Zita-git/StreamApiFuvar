package hu.petrik.zita;

import java.io.*;
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
        return fuvarok.stream().filter(fuvar -> fuvar.getTaxi_id()== fuvar.getTaxi_id()).mapToDouble(fuvar -> fuvar.getViteldij()+fuvar.getBorravalo()).sum();
    }
    public long db(int a){
        return fuvarok.stream().filter(fuvar -> fuvar.getTaxi_id()== fuvar.getTaxi_id()).count();
    }
    public String bevetelFuvar(int a){
        double bevetel;
        long szam;
        szam=db(a);
        bevetel=doll(a);

        return String.format(a+" azonósító számmal rendelkező taxinak a bevétele %4.2f $, ami %d fuvarból állt.",bevetel,szam);
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
