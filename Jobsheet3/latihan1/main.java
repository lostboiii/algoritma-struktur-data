package Jobsheet3.latihan1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih Benda (1-3) :");
        System.out.println("Bola");
        System.out.println("Kerucut");
        System.out.println("Limas");
        int p = scanner.nextInt();

        switch (p) {
            case 1:
            System.out.print("Masukkan Jumlah Bola: ");
            int banyak = scanner.nextInt();
    
           
            Bola[] bolaArray = new Bola[banyak];
    
           
            for (int i = 0; i < bolaArray.length; i++) {
                System.out.print("Masukkan jari-jari Bola ke-" + (i + 1) + ": ");
                int jari2 = scanner.nextInt();
                bolaArray[i] = new Bola(jari2);
            }
    
           
            for (int i = 0; i < banyak; i++) {
                Bola bola = bolaArray[i];
                double luas = bola.luas();
                double volume = bola.volume();
                System.out.println("Bola ke-" + (i + 1) + ":");
                System.out.println("Luas permukaan: " + luas);
                System.out.println("Volume: " + volume);
                System.out.println();
            }
                break;
            case 2:
            System.out.print("Masukkan Jumlah Kerucut: ");
            int banyak1 = scanner.nextInt();
            Kerucut[] KerucutArray = new Kerucut[banyak1];

            for (int i = 0; i < KerucutArray.length; i++) {
                System.out.print("Masukkan jari-jari Kerucut ke-" + (i + 1) + ": ");
                int jari2 = scanner.nextInt();
                System.out.print("Masukkan Sisi Miring Kerucut ke-" + (i + 1) + ": ");
                int sismir = scanner.nextInt();
                KerucutArray[i] = new Kerucut(jari2, sismir);
            }
            for (int i = 0; i < banyak1; i++) {
                Kerucut kerucut = KerucutArray[i];
                double luas = kerucut.luas();
                double volume = kerucut.volume();
                System.out.println("Kerucut ke-" + (i + 1) + ":");
                System.out.println("Luas permukaan: " + luas);
                System.out.println("Volume: " + volume);
                System.out.println();
            }
                break;
            case 3:
            System.out.print("Masukkan Jumlah Limas: ");
            int banyak2 = scanner.nextInt();
           Limas[]LimasArray = new Limas[banyak2];

            for (int i = 0; i < LimasArray.length; i++) {
                System.out.print("Masukkan jari-jari Limas ke-" + (i + 1) + ": ");
                int panjangAlas = scanner.nextInt();
                System.out.print("Masukkan Sisi Miring Limas ke-" + (i + 1) + ": ");
                int tinggi = scanner.nextInt();
                LimasArray[i] = new Limas(panjangAlas, tinggi);
            }
            for (int i = 0; i < banyak2; i++) {
                Limas Limas = LimasArray[i];
                double luas = Limas.luas();
                double volume = Limas.volume();
                System.out.println("Kerucut ke-" + (i + 1) + ":");
                System.out.println("Luas permukaan: " + luas);
                System.out.println("Volume: " + volume);
                System.out.println();
            }
                break;
            default:
                System.out.println("Pilihan Salah");
                break;
        }
    }

}

