public class Main {
    public static void main(String[] args) {
        // buat 2 objek buku
        Buku buku1 = new Buku("Harry Potter", "J.K. Rowling", 300000);
        Buku buku2 = new Buku("UML", "Ivar Jacobson", 400000);

        // tampilkan datanya
        System.out.println("Judul :" + buku1.getJudul() + "\t" + "Pengarang :" + buku1.getPengarang() + "\t" + "Harga :" + buku1.getHarga());
        System.out.println("Judul :" + buku2.getJudul() + "\t" + "Pengarang :" + buku2.getPengarang() + "\t" + "Harga :" + buku2.getHarga());
    }
}
