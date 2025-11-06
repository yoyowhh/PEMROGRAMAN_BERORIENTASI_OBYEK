import java.util.HashMap;
import java.util.Scanner;

public class AuthApp {
    // === Custom Exception ===
    // email sudah terdaftar.
    static class ConflictException extends Exception {
        public ConflictException(String message) {
            super(message);
        }
    }

    // password kurang dari 8 karakter.
    static class BadRequestException extends Exception {
        public BadRequestException(String message) {
            super(message);
        }
    }

    // aksi tidak diizinkan.
    static class UnauthorizedException extends Exception {
        public UnauthorizedException(String message) {
            super(message);
        }
    }

    // data tidak ditemukan.
    static class NotFoundException extends Exception {
        public NotFoundException(String message) {
            super(message);
        }
    }

    // === User class ===
    static class User {
        private String email;
        private String fullname;
        private String password;

        public User(String email, String fullname, String password) {
            this.email = email;
            this.fullname = fullname;
            this.password = password;
        }

        public String getEmail() {
            return email;
        }

        public String getFullname() {
            return fullname;
        }

        public String getPassword() {
            return password;
        }
    }

    // === AuthApp data & logic ===
    // Menyimpan data user dalam HashMap
    private HashMap<String, User> users = new HashMap<>();
    private User loggedInUser = null;

    // REGISTER
    public void register(String email, String fullname, String password)
            throws ConflictException, BadRequestException, UnauthorizedException {

        // Cek apakah ada user yang sedang login
        if (loggedInUser != null) {
            throw new UnauthorizedException("Logout terlebih dahulu sebelum register!");
        }

        // Validasi password
        if (password.length() < 8) {
            throw new BadRequestException("Password kurang dari 8 karakter!");
        }

        // Cek apakah email sudah terdaftar
        if (users.containsKey(email)) {
            throw new ConflictException("Email " + email + " sudah digunakan!");
        }

        // Simpan user baru
        users.put(email, new User(email, fullname, password));
        System.out.println("Register berhasil!");
    }

    // LOGIN
    public void login(String email, String password)
            throws NotFoundException, UnauthorizedException {

        // Cek apakah ada user yang sedang login
        if (!users.containsKey(email)) {
            throw new NotFoundException("Email tidak ditemukan!");
        }

        // Cek password
        User user = users.get(email);
        if (!user.getPassword().equals(password)) {
            throw new UnauthorizedException("Password salah!");
        }

        // Set user sebagai logged in
        loggedInUser = user;
        System.out.println("Login berhasil!");
    }

    // LOGOUT
    public void logout() throws UnauthorizedException {
        if (loggedInUser == null) {
            throw new UnauthorizedException("Belum login!");
        }
        loggedInUser = null;
        System.out.println("Logout berhasil!");
    }

    // PROFIL
    public void profile() throws UnauthorizedException {
        if (loggedInUser == null) {
            throw new UnauthorizedException("Harus login terlebih dahulu!");
        }
        System.out.println("\n=== Profil Pengguna ===");
        System.out.println("Email    : " + loggedInUser.getEmail());
        System.out.println("Fullname : " + loggedInUser.getFullname());
    }

    // === MAIN PROGRAM ===
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AuthApp app = new AuthApp();

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Lihat Profil");
            System.out.println("4. Logout");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            String pilih = input.nextLine();

            try {
                switch (pilih) {
                    case "1":
                        System.out.print("Masukan email : ");
                        String email = input.nextLine();
                        System.out.print("Masukan fullname : ");
                        String fullname = input.nextLine();
                        System.out.print("Masukan password : ");
                        String password = input.nextLine();
                        app.register(email, fullname, password);
                        break;

                    case "2":
                        System.out.print("Masukan email : ");
                        email = input.nextLine();
                        System.out.print("Masukan password : ");
                        password = input.nextLine();
                        app.login(email, password);
                        break;

                    case "3":
                        app.profile();
                        break;

                    case "4":
                        app.logout();
                        break;

                    case "5":
                        System.out.println("Program selesai.");
                        input.close();
                        return;

                    default:
                        System.out.println("Pilihan tidak valid!");
                }
            } catch (ConflictException | BadRequestException | 
                     UnauthorizedException | NotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

