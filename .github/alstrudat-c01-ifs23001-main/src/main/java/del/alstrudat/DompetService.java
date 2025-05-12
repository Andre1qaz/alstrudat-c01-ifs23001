package del.alstrudat;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class DompetService {
    private Scanner scanner = new Scanner(System.in);
    private Map<String, User> users = new HashMap<>();
    private List<Report> reports = new ArrayList<>();
    private final String adminUsername = "admin";
    private final String adminPassword = "admin123";

    public void startApp() {
        while (true) {
            System.out.println("\n=== Dompet Digital ===");
            System.out.println("1. Login");
            System.out.println("2. Daftar");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi: ");
            int opsi = scanner.nextInt();
            scanner.nextLine();

            switch (opsi) {
                case 1:
                    login();
                    break;
                case 2:
                    daftar();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Opsi tidak valid.");
            }
        }
    }

    private void login() {
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        if (username.equals(adminUsername) && password.equals(adminPassword)) {
            adminMenu();
        } else if (users.containsKey(username) && users.get(username).password.equals(password)) {
            customerMenu(users.get(username));
        } else {
            System.out.println("Login gagal. Username atau password salah.");
        }
    }

    private void daftar() {
        System.out.print("Masukkan username baru: ");
        String username = scanner.nextLine();
        if (users.containsKey(username)) {
            System.out.println("Username sudah terdaftar.");
            return;
        }
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();
        users.put(username, new User(username, password));
        System.out.println("Akun berhasil dibuat.");
    }

    private void adminMenu() {
        while (true) {
            System.out.println("\n--- Menu Admin ---");
            System.out.println("1. Lihat laporan masalah");
            System.out.println("2. Lihat jumlah pengguna");
            System.out.println("3. Logout");
            System.out.print("Pilih opsi: ");
            int opsi = scanner.nextInt();
            scanner.nextLine();

            switch (opsi) {
                case 1:
                    if (reports.isEmpty()) {
                        System.out.println("Tidak ada laporan.");
                    } else {
                        System.out.println("\nNo   | Nama Akun       | Masalah");
                        System.out.println("-------------------------------------------");
                        int no = 1;
                        for (Report report : reports) {
                            System.out.printf("%04d | %-15s | %s\n", no++, report.username, report.message);
                        }
                    }
                    break;
                case 2:
                    System.out.println("\nNo   | Nama Akun       | Total Saldo");
                    System.out.println("------------------------------------");
                    int idx = 1;
                    for (Map.Entry<String, User> entry : users.entrySet()) {
                        String nama = entry.getKey();
                        double saldo = entry.getValue().balance;
                        System.out.printf("%04d | %-15s | Rp%.2f\n", idx++, nama, saldo);
                    }
                    System.out.println("------------------------------------");
                    System.out.printf("Total Pengguna: %04d\n", users.size());
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opsi tidak valid.");
            }
        }
    }

    private void customerMenu(User user) {
        while (true) {
            System.out.println("\n--- Menu Costumer ---");
            System.out.println("Saldo: Rp" + user.balance);
            System.out.println("1. Deposit");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Transfer");
            System.out.println("4. Laporkan Masalah");
            System.out.println("5. Logout");
            System.out.print("Pilih opsi: ");
            int opsi = scanner.nextInt();
            scanner.nextLine();

            switch (opsi) {
                case 1:
                    System.out.print("Masukkan jumlah deposit: ");
                    double deposit = scanner.nextDouble();
                    user.balance += deposit;
                    System.out.println("Deposit berhasil.");
                    break;
                case 2:
                    System.out.print("Masukkan jumlah tarik tunai: ");
                    double tarik = scanner.nextDouble();
                    if (tarik > user.balance) {
                        System.out.println("Saldo tidak cukup.");
                    } else {
                        user.balance -= tarik;
                        System.out.println("Tarik tunai berhasil.");
                    }
                    break;
                case 3:
                    System.out.print("Masukkan username tujuan: ");
                    String tujuan = scanner.nextLine();
                    if (!users.containsKey(tujuan)) {
                        System.out.println("Pengguna tidak ditemukan.");
                    } else {
                        System.out.print("Masukkan jumlah transfer: ");
                        double transfer = scanner.nextDouble();
                        if (transfer > user.balance) {
                            System.out.println("Saldo tidak cukup.");
                        } else {
                            user.balance -= transfer;
                            users.get(tujuan).balance += transfer;
                            System.out.println("Transfer berhasil ke " + tujuan);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Tuliskan masalah Anda: ");
                    String pesan = scanner.nextLine();
                    reports.add(new Report(user.username, pesan));
                    System.out.println("Laporan dikirim.");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opsi tidak valid.");
            }
        }
    }
}
