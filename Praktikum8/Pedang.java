public class Pedang extends Senjata {
    private double critBonus;

    public Pedang(String nama, double power, double critBonus) {
        super(nama, power);
        this.critBonus = critBonus;
    }

    @Override
    public void attack() {
        System.out.println("Pedang " + nama + " menebas dengan kekuatan " + power + ".");
    }

    @Override
    public void attack(String jurus) {
        System.out.println("Pedang " + nama + " menebas dengan jurus " + jurus + " dengan kekuatan " + (power * critBonus) + "!");
    }
}
