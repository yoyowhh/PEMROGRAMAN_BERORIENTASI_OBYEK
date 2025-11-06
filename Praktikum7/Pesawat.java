// Kelas anak mewarisi atribut & method dari kelas induk.
public class Pesawat extends Kendaraan {
    private int jumlahPeluru;
    private int ketinggian; // dalam meter

    public Pesawat(String nama, int tahunProduksi, Produsen produsen, int jumlahPeluru) {
        super(nama, tahunProduksi, produsen);
        this.jumlahPeluru = jumlahPeluru;
        this.ketinggian = 0;
    }

    public void infoPesawat() {
        System.out.println("=== INFO PESAWAT ===");
        System.out.println("Jumlah Peluru: " + jumlahPeluru + " buah");
        System.out.println("Ketinggian: " + ketinggian + " meter");
    }

    public void ubahKetinggian(int tinggiBaru) {
        this.ketinggian = tinggiBaru;
        System.out.println("Mengubah ketinggian ke: " + tinggiBaru + " meter");
    }

    public void tembak(int jumlah) {
        if (jumlahPeluru == 0) {
            System.out.println("Peluru habis! Tidak bisa menembak.");
        } else if (jumlahPeluru < jumlah) {
            System.out.println("Pesawat Menembakkan " + jumlahPeluru + " butir peluru");
            jumlahPeluru = 0;
            System.out.println("Peluru sudah ditembakkan semua");
        } else {
            jumlahPeluru -= jumlah;
            System.out.println("Pesawat Menembakkan " + jumlah + " butir peluru");
            System.out.println("Sisa Peluru: " + jumlahPeluru + " butir");
        }
    }

    public void refillPeluru(int jumlah) {
        if (ketinggian == 0) {
            jumlahPeluru += jumlah;
            System.out.println("Menambah Peluru sebanyak " + jumlah + " buah");
            System.out.println("Jumlah Peluru Sekarang: " + jumlahPeluru + " buah");
        } else {
            System.out.println("Tidak bisa isi peluru, Pesawat belum mendarat");
        }
    }
}
