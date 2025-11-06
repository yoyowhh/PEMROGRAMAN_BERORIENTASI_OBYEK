public class Pegawai {
    private String id;
    private String nama;
    private String alamat;
    private String departemen;
    private double gaji;

    // Konstruktor (menggilatkan semua atribut)
    public Pegawai(String id, String nama, String alamat, String departemen, double gaji) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.departemen = departemen;
        this.gaji = gaji;
    }

    // Getter & Setter
    public String getId() {
        return id;
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

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void tampilData() {
        System.out.println("ID: " + id + ", Nama: " + nama + ", Alamat: " + alamat +
                ", Departemen: " + departemen + ", Gaji: " + gaji);
    }
}
