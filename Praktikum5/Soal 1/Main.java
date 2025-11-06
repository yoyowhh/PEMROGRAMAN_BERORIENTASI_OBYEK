import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    // Fungsi untuk menghitung rata-rata
    public static double hitungRataRata(Scanner input) throws ArithmeticException, InputMismatchException {
        System.out.print("Berapa banyak nilai yang ingin dimasukan? ");
        int jumlahNilai = input.nextInt();

        if (jumlahNilai == 0) {
            throw new ArithmeticException("Tidak ada masukan nilai!");
        }

        // Inisialisasi total nilai
        double total = 0;

        // Loop untuk memasukkan nilai
        for (int i = 1; i <= jumlahNilai; i++) {
            System.out.print("Masukkan nilai ke-" + i + ": ");
            double nilai = input.nextDouble();
            total += nilai;
        }

        return total / jumlahNilai;
    }

    // Fungsi main hanya menangkap error
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            double rata = hitungRataRata(input);
            System.out.printf("Nilai rata-rata adalah: %.2f%n", rata);
        } 
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } 
        catch (InputMismatchException e) {
            System.out.println("Input bukan angka!");
        } 
        catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } 
        finally {
            input.close();
        }
    }
}
