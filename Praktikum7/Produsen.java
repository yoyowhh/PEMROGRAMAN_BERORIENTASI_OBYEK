// agregarsi (kelas lain menggunakan objek dari kelas ini).
public class Produsen {
    private String nama;
    private String negara;

// parameter constructor
    public Produsen(String nama, String negara) {
        this.nama = nama;
        this.negara = negara;
    }

    public void infoProdusen() {
        System.out.println("=== INFO PRODUSEN ===");
        System.out.println("Nama Produsen: " + nama);
        System.out.println("Negara Asal  : " + negara);
    }
}
