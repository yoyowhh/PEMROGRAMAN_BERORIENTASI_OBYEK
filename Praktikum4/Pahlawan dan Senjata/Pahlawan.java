public class Pahlawan {
    private String nama;
    private int health;
    private int level;
    private Senjata senjata; // bagian dari Pahlawan

    // Constructor membuat sekaligus senjatanya
    public Pahlawan(String nama, int health, int level, String namaSenjata, int powerSenjata) {
        this.nama = nama;
        this.health = health;
        this.level = level;
        this.senjata = new Senjata(); // senjata dibuat di sini (bagian dari Pahlawan)
        this.senjata.setNama(namaSenjata);
        this.senjata.setPower(powerSenjata);
    }

    // Getter & Setter untuk atribut dasar
    public String getNama() { return nama; }
    public int getHealth() { return health; }
    public int getLevel() { return level; }

    public void setHealth(int health) { this.health = health; }
    public void setLevel(int level) { this.level = level; }

    // Tidak ada setter Senjata dari luar (karena komposisi)
    public Senjata getSenjata() {
        return senjata;
    }

    public void upgradeSenjata(int nilaiUpgrade) {
        senjata.upgrade(nilaiUpgrade);
        System.out.println(senjata.getNama() + " di-upgrade! Power sekarang: " + senjata.getPower());
    }

    public void menyerang() {
        System.out.println(nama + " menyerang dengan " + senjata.getNama() + " (Power: " + senjata.getPower() + ")");
    }
}
