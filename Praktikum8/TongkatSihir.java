public class TongkatSihir extends Senjata {
    private boolean isElementEffective;

    public TongkatSihir(String nama, double power, boolean isElementEffective) {
        super(nama, power);
        this.isElementEffective = isElementEffective;
    }

    @Override
    public void attack() {
        System.out.println("Tongkat sihir " + nama + " melancarkan mantra dengan kekuatan " + power + ".");
    }

    @Override
    public void attack(String jurus) {
        double damage = isElementEffective ? power * 10 : power * 0.5;
        String efektif = isElementEffective ? "Ya" : "Tidak";

        System.out.println("Tongkat sihir " + nama + " mengeluarkan mantra " + jurus + " dengan kekuatan " + damage + ". Efektif? : " + efektif);
    }
}
