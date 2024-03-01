import java.util.Scanner;

public class soal1 {

    public static void main(String[] args) {

        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};


        String[] KOTA = {"Banten","Jakarta", "Bandung", "Cirebon", "Bogor", "Pekalongan",
                "Semarang", "Surabaya", "Malang", "Tegal"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kode Plat Nomor: ");
        char kode = scanner.next().toUpperCase().charAt(0);


        int index = -1;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kode) {
                index = i;
                break;
            }
        }

        
        if (index != -1) {
            System.out.println("Kota: " + KOTA[index]);
        } else {
            System.out.println("Kode Salah");
        }

        scanner.close();
    }
}
