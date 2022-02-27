package hu.petrik.zita;

public class Main {

    public static void main(String[] args) {
        Fuvarok FU= new Fuvarok("fuvar.csv");
        System.out.println(FU);

        System.out.println("1. Feladat");
        System.out.println(FU.utazasokSzama()+" db.");

        System.out.println("\n2. Feladat");
        System.out.println(FU.bevetelFuvar(6185));

        System.out.println("\n3. Feladat");
        System.out.println(FU.merfoldMind()+" mérföldet tettek meg a taxisok összesen.");

        System.out.println("\n4. Feladat");
        System.out.println("Az időben leghosszabb fuvar adatai:\n"+FU.leghosszabbFuvar());

        System.out.println("\n5. Feladat");
        System.out.println("A legbőkezűbb borravalóval ajándékozott fuvar adatai:\n"+FU.legbokezubbFuvar());

        System.out.println("\n6. Feladat");

        System.out.println("\n7. Feladat");

        System.out.println("\n8. Feladat");

        System.out.println("\n9. Feladat");

        System.out.println("\n10. Feladat");

        System.out.println("\n11. Feladat");
    }

}
