// Kelas anak mewarisi atribut & method dari kelas induk.
public class Tank extends Kendaraan {
    private String kaliber;
    private int amunisi;
    private int derajatRotasi;

    public Tank(String nama, int tahunProduksi, Produsen produsen, String kaliber, int amunisi) {
        super(nama, tahunProduksi, produsen);
        this.kaliber = kaliber;
        this.amunisi = amunisi;
        this.derajatRotasi = 0;
    }

    public void infoMeriam() {
        System.out.println("=== INFO MERIAM TANK ===");
        System.out.println("Kaliber: " + kaliber);
        System.out.println("Jumlah Amunisi: " + amunisi + " buah");
        System.out.println("Derajat Rotasi: " + derajatRotasi + " derajat");
        System.out.println("Arah Rotasi: " + getArah());
    }

    public void tembak() {
        if (amunisi > 0) {
            System.out.println("Tank Menembak...");
            amunisi--;
            System.out.println("Sisa Amunisi: " + amunisi + " buah");
        } else {
            System.out.println("Amunisi habis, tidak bisa menembak.");
        }
    }

    public void putarMeriam(int derajat) {
        derajatRotasi = (derajatRotasi + derajat) % 360;
        System.out.println("Memutar tank ke " + derajat + " derajat");
        System.out.println("Arah Rotasi: " + getArah());
    }

    public void tambahAmunisi(int jumlah) {
        amunisi += jumlah;
        System.out.println("Menambah Amunisi sebanyak " + jumlah + " buah");
        System.out.println("Jumlah Amunisi Sekarang: " + amunisi + " buah");
    }

    private String getArah() {
        if (derajatRotasi == 0) return "Depan";
        if (derajatRotasi == 90) return "Kanan";
        if (derajatRotasi == 180) return "Belakang";
        if (derajatRotasi == 270) return "Kiri";
        if (derajatRotasi > 0 && derajatRotasi < 90) return "Depan Kanan";
        if (derajatRotasi > 90 && derajatRotasi < 180) return "Belakang Kanan";
        if (derajatRotasi > 180 && derajatRotasi < 270) return "Belakang Kiri";
        return "Depan Kiri";
    }
}
