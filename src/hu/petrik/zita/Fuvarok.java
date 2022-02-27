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


    @Override
    public String toString() {
        String s="";
        for (Fuvar fu:this.fuvarok) {
            s+=fu+"\n";
        }
        return s;
    }
}
