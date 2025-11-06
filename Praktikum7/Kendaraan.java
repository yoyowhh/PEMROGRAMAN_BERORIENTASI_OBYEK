public class Kendaraan {
    protected String nama;
    protected int tahunProduksi;
    protected Produsen produsen;
    // kelas turunan bisa mengaksesnya langsung

    public Kendaraan(String nama, int tahunProduksi, Produsen produsen) {
        this.nama = nama;
        this.tahunProduksi = tahunProduksi;
        this.produsen = produsen;
    }

    public void infoDasar() {
        System.out.println("=== INFO DASAR KENDARAAN ===");
        System.out.println("Nama: " + nama);
        System.out.println("Tahun Produksi: " + tahunProduksi);
    }

    public void infoProdusen() {
        produsen.infoProdusen();
    }
}
