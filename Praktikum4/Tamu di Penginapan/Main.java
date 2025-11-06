public class Main {
    public static void main(String[] args) {
        Penginapan penginapan = new Penginapan("Kost Kia", "PGA 2");

        Tamu karina = new Tamu("Karina", 3, penginapan);
        Tamu fathia = new Tamu("Fathia", 2, penginapan);
        Tamu kia = new Tamu("Kia", 6, penginapan);

        penginapan.catatMasuk(karina);
        penginapan.catatMasuk(fathia);
        penginapan.catatMasuk(kia);

        penginapan.tampilkanDaftarTamu();

        penginapan.catatKeluar(karina);
        penginapan.catatKeluar(fathia);

        penginapan.tampilkanDaftarTamu();
    }
}