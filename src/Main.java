public class Main {
    public static void main(String[] args) {
        Oviraptor oviraptor = new Oviraptor();
        Triceratops triceratops = new Triceratops();
        TyrannosaurusRex trex = new TyrannosaurusRex();
        
        Pemburu pemburu = new Pemburu();
        AnakPemburu anak = new AnakPemburu();

        System.out.println("=-=-=-=-= Oviraptor =-=-=-=-=");
        oviraptor.berjalan();
        oviraptor.makan();
        oviraptor.bertelur();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println();

        System.out.println("=-=-=-=- triceratops -=-=-=-=");
        triceratops.berjalan();
        triceratops.makan();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println();

        System.out.println("=-=-=-=-=-= T-Rex =-=-=-=-=-=");
        trex.berjalan();
        trex.makan();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println();

        System.out.println("=-=-=-=-=- Pemburu -=-=-=-=-=");
        pemburu.berburu(trex);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println();

        System.out.println("=-=-=-=-=-= Anak  =-=-=-=-=-=");
        anak.mengambilTelur(trex);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    }
}
