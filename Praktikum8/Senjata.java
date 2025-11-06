public class Senjata {
    protected String nama;
    protected double power;

    public Senjata(String nama, double power) {
        this.nama = nama;
        this.power = power;
    }

    // Attack biasa
    public void attack() {
        System.out.println("Senjata " + nama + " menyerang dengan kekuatan " + power);
    }

    // Attack spesial (overloading)
    public void attack(String jurus) {
        System.out.println("Senjata " + nama + " menggunakan jurus " + jurus + " dengan kekuatan " + (power * 2) + "!");
    }
}
