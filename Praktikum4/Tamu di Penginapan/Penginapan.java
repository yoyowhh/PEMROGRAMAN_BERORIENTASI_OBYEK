import java.util.ArrayList;

public class Penginapan {
    private String nama;
    private String alamat;
    private ArrayList<Tamu> daftarTamu = new ArrayList<>();

    public Penginapan(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void catatMasuk(Tamu tamu) {
        daftarTamu.add(tamu);
        System.out.println(tamu.getNama() + " masuk ke penginapan " + nama);
    }

    public void catatKeluar(Tamu tamu) {
        daftarTamu.remove(tamu);
        System.out.println(tamu.getNama() + " keluar dari penginapan " + nama);
    }

    public void tampilkanDaftarTamu() {
        System.out.println("Daftar tamu di penginapan " + nama + ":");
        if (daftarTamu.isEmpty()) {
            System.out.println("- (tidak ada tamu saat ini)");
        } else {
            for (Tamu t : daftarTamu) {
                System.out.println("- " + t);
            }
        }
        System.out.println();
    }
}
