public class Panah extends Senjata {
    private int rangeBonus;

    public Panah(String nama, double power, int rangeBonus) {
        super(nama, power);
        this.rangeBonus = rangeBonus;
    }

    @Override
    public void attack() {
        System.out.println("Panah " + nama + " menembakkan anak panah dengan kekuatan " + power + ".");
    }

    @Override
    public void attack(String jurus) {
        System.out.println("Panah " + nama + " melepaskan anak panah khusus dengan jurus " + jurus + " dengan kekuatan " + (power * rangeBonus) + "!");
    }
}
