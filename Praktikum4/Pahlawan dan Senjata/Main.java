public class Main {
    public static void main(String[] args) {
        // Membuat Pahlawan beserta senjatanya (komposisi)
        Pahlawan hayhay = new Pahlawan("HayHay", 100, 5, "Vandal", 80);

        hayhay.menyerang();

        hayhay.upgradeSenjata(20);

        hayhay.menyerang();
    }
}
