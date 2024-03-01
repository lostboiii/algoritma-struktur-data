import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        boolean condition = true;
        do {
            System.out.println("Selamat datang di penghitung rumus");
            System.out.println("Pilih menu dibawah ini:");
            System.out.println("1. Menghitung Rumus Kecepatan");
            System.out.println("2. Menghitung Rumus Jarak");
            System.out.println("3. Menghitung Rumus Waktu");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            try {
                pilihan = scanner.nextInt();
                switch (pilihan) {
                    case 0:
                        condition = false;
                        System.out.println("Program Keluar");
                        break;
                    case 1:
                        hitungKecepatan();
                        break;
                    case 2:
                        hitungJarak();
                        break;
                    case 3:
                        hitungWaktu();
                        break;
                    default:
                        System.out.println("Pilihan yang Anda masukkan salah");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Pilihan yang Anda masukkan tidak valid.");
                scanner.nextLine(); // Membersihkan input buffer
            }
        } while (condition);
        scanner.close();
    }

    private static void hitungKecepatan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jarak (dalam meter): ");
        double jarak = scanner.nextDouble();
        System.out.print("Masukkan waktu (dalam detik): ");
        double waktu = scanner.nextDouble();
        double kecepatan = jarak / waktu;
        System.out.println("Kecepatan adalah: " + kecepatan + " m/s");
        scanner.close();
    }

    private static void hitungJarak() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kecepatan (dalam m/s): ");
        double kecepatan = scanner.nextDouble();
        System.out.print("Masukkan waktu (dalam detik): ");
        double waktu = scanner.nextDouble();
        double jarak = kecepatan * waktu;
        System.out.println("Jarak adalah: " + jarak + " meter");
        scanner.close();
    }

    private static void hitungWaktu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kecepatan (dalam m/s): ");
        double kecepatan = scanner.nextDouble();
        System.out.print("Masukkan jarak (dalam meter): ");
        double jarak = scanner.nextDouble();
        double waktu = jarak / kecepatan;
        System.out.println("Waktu adalah: " + waktu + " detik");
        scanner.close();
    }
}
