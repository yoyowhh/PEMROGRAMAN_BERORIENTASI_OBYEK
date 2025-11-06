public class Main {
    public static void main(String[] args) {
        // Produsen
        Produsen porsche = new Produsen("Porsche", "Jerman");
        Produsen yamaha = new Produsen("Yamaha", "Jepang");

        // Pesawat
        Pesawat bf109 = new Pesawat("Messerschmitt Bf 109", 1936, porsche, 250);
        bf109.infoDasar();
        bf109.infoProdusen();
        bf109.infoPesawat();
        bf109.ubahKetinggian(400);
        bf109.ubahKetinggian(300);
        bf109.tembak(30);
        bf109.tembak(220);
        bf109.refillPeluru(40); // masih di udara
        bf109.ubahKetinggian(0);
        bf109.refillPeluru(40);

        System.out.println("\n==============================\n");

        // Tank
        Tank tigerII = new Tank("Tiger II", 1944, porsche, "88 mm", 1);
        tigerII.infoDasar();
        tigerII.infoProdusen();
        tigerII.infoMeriam();
        tigerII.tembak();
        tigerII.putarMeriam(30);
        tigerII.tembak();
        tigerII.tambahAmunisi(45);
        tigerII.tembak();

        System.out.println("\n==============================\n");

        // Kendaraan biasa
        Kendaraan mio = new Kendaraan("Mio Gear", 2022, yamaha);
        mio.infoDasar();
        mio.infoProdusen();
    }
}
