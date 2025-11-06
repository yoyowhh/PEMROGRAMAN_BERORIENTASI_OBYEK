import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Pegawai> sdms = new ArrayList<>();
    private static ArrayList<Pegawai> keuangan = new ArrayList<>();
    private static ArrayList<Pegawai> produksi = new ArrayList<>();

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int pilih;
        do {
            System.out.println("\nMenu aplikasi pegawai");
            System.out.println("1. Input Pegawai");
            System.out.println("2. Edit Pegawai");
            System.out.println("3. Tampilkan Semua Pegawai");
            System.out.println("4. Tampilkan Pegawai per Departemen");
            System.out.println("5. Tampilkan1 Pegawai Berdasarkan Range Gaji");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1 -> inputPegawai();
                case 2 -> editPegawai();
                case 3 -> tampilSemua();
                case 4 -> tampilPerDepartemen();
                case 5 -> tampilRangeGaji();
                case 0 -> System.out.println("Keluar dari aplikasi.");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 0);
    }

    // Input, Edit, Tampil Semua, Tampil per Departemen, Tampil Range Gaji
    private static void inputPegawai() {
        System.out.print("ID Pegawai: ");
        String id = sc.nextLine();
        System.out.print("Nama Pegawai: ");
        String nama = sc.nextLine();
        System.out.print("Alamat Pegawai: ");
        String alamat = sc.nextLine();
        System.out.print("Departemen (1. SDM, 2. Keuangan, 3. Produksi): ");
        int dept = sc.nextInt();
        sc.nextLine();
        String departemen = switch (dept) {
            case 1 -> "Sumber Daya Manusia";
            case 2 -> "Keuangan";
            case 3 -> "Produksi";
            default -> "";
        };
        if (departemen.equals("")) {
            System.out.println("Departemen tidak valid!");
            return;
        }
        System.out.print("Gaji Pegawai: ");
        double gaji = sc.nextDouble();
        sc.nextLine();

        Pegawai p = new Pegawai(id, nama, alamat, departemen, gaji);
        switch (dept) {
            case 1 -> sdms.add(p);
            case 2 -> keuangan.add(p);
            case 3 -> produksi.add(p);
        }
        System.out.println("Pegawai berhasil ditambahkan.");
    }

    // Edit Pegawai berdasarkan ID
    private static void editPegawai() {
        System.out.print("Masukkan ID Pegawai yang ingin diedit: ");
        String id = sc.nextLine();
        Pegawai pegawai = cariPegawai(id);

        if (pegawai == null) {
            System.out.println("Pegawai tidak ditemukan.");
            return;
        }

        System.out.print("Nama baru: ");
        pegawai.setNama(sc.nextLine());
        System.out.print("Alamat baru: ");
        pegawai.setAlamat(sc.nextLine());
        System.out.print("Gaji baru: ");
        pegawai.setGaji(sc.nextDouble());
        sc.nextLine();

        System.out.println("Data pegawai berhasil diperbarui.");
    }

    // Tampilkan Semua Pegawai
    private static void tampilSemua() {
        System.out.println("\nSemua Data Pegawai");
        for (Pegawai p : sdms) p.tampilData();
        for (Pegawai p : keuangan) p.tampilData();
        for (Pegawai p : produksi) p.tampilData();
    }

    // Tampilkan Pegawai per Departemen
    private static void tampilPerDepartemen() {
        System.out.print("Pilih Departemen (1. SDM, 2. Keuangan, 3. Produksi): ");
        int dept = sc.nextInt();
        sc.nextLine();

        ArrayList<Pegawai> daftar = switch (dept) {
            case 1 -> sdms;
            case 2 -> keuangan;
            case 3 -> produksi;
            default -> null;
        };

        if (daftar == null) {
            System.out.println("Departemen tidak valid.");
            return;
        }

        System.out.println("Data Pegawai Departemen");
        for (Pegawai p : daftar) p.tampilData();
    }

    // Tampilkan Pegawai berdasarkan Range Gaji
    private static void tampilRangeGaji() {
        System.out.print("Masukkan batas bawah gaji: ");
        double min = sc.nextDouble();
        System.out.print("Masukkan batas atas gaji: ");
        double max = sc.nextDouble();
        sc.nextLine();

        System.out.println("Pegawai dengan gaji antara " + min + " - " + max + " ");
        for (Pegawai p : sdms) if (p.getGaji() >= min && p.getGaji() <= max) p.tampilData();
        for (Pegawai p : keuangan) if (p.getGaji() >= min && p.getGaji() <= max) p.tampilData();
        for (Pegawai p : produksi) if (p.getGaji() >= min && p.getGaji() <= max) p.tampilData();
    }

    // Cari Pegawai berdasarkan ID
    private static Pegawai cariPegawai(String id) {
        for (Pegawai p : sdms) if (p.getId().equals(id)) return p;
        for (Pegawai p : keuangan) if (p.getId().equals(id)) return p;
        for (Pegawai p : produksi) if (p.getId().equals(id)) return p;
        return null;
    }
}
