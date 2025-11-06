public class Main {
    public static void main(String[] args) {
        Senjata[] senjataList = new Senjata[3];

        // Upcasting
        senjataList[0] = new Pedang("RoukanKen", 50, 3.5);
        senjataList[1] = new Panah("Moon Bow", 30, 2);
        senjataList[2] = new TongkatSihir("Gohei", 40, true);

        // Attack biasa
        for (Senjata s : senjataList) {
            s.attack();
        }
        System.out.println();

        // Attack spesial
        senjataList[0].attack("Hesitation-Cutting Sword \"Slash of Departing from Hesitation\"");
        senjataList[1].attack("Heaven's Curse \"Apollo 13\"");
        senjataList[2].attack("Spirit Sign \"Fantasy Seal\"");
    }
}
