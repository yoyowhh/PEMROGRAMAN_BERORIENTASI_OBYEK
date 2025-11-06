public class Tamu {
    private String nama;
    private int durasiMenginap;
    private Penginapan penginapan; // agregasi

    public Tamu(String nama, int durasiMenginap, Penginapan penginapan) {
        this.nama = nama;
        this.durasiMenginap = durasiMenginap;
        this.penginapan = penginapan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getDurasiMenginap() {
        return durasiMenginap;
    }

    public void setDurasiMenginap(int durasiMenginap) {
        this.durasiMenginap = durasiMenginap;
    }

    public Penginapan getPenginapan() {
        return penginapan;
    }

    public void setPenginapan(Penginapan penginapan) {
        this.penginapan = penginapan;
    }

    @Override
    public String toString() {
        return nama + " (" + durasiMenginap + " hari) - " +
               (penginapan != null ? "Penginapan: " + penginapan.getNama() : "Belum ada penginapan");
    }
}