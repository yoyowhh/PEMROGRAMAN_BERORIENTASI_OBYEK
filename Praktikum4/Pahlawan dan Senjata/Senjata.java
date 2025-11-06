public class Senjata {
    private String nama;
    private int power;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void upgrade(int tambahanPower) {
        this.power += tambahanPower;
    }
}
