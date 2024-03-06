package Jobsheet3.latihan2;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan Jumlah Mahasiswa :");
        int jumlah = scanner.nextInt();

        Mahasiswa mhs [] = new Mahasiswa[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.println("Masukkan NIM : ");
            String nim = scanner.next();
            System.out.println("Masukkan Nama : ");
            String nama = scanner.next();
            System.out.println("Masukkan IPK : ");
            double ipk = scanner.nextDouble();
            mhs[i] = new Mahasiswa(nim, nama, ipk);
        }
         for (int i = 0; i < jumlah; i++) {
                Mahasiswa mahasiswa = mhs[i];
                String nim = mahasiswa.nim;
                String nama = mahasiswa.nama;
                double ipk = mahasiswa.ipk;
                System.out.println("Data Mahasiswa ke-" + (i + 1) + ":");
                System.out.println("Nama: " + nama);
                System.out.println("Nim: " + nim);
                System.out.println("IPK: " + ipk);
                System.out.println("Rata2 : " + mahasiswa.rata2(mhs));
                System.out.println("Mahasiswa Terbaik : " + Mahasiswa.mahasiswaTerbaik(mhs));
                System.out.println();
            }
       
    }
}
