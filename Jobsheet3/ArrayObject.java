package Jobsheet3;

import java.util.Scanner;

public class ArrayObject {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jumlah persegi panjang :");
        int p = scanner.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[p];
        for (int i = 0; i < p; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke- " +i);
            System.out.println("Masukkan Panjang : ");
            ppArray[i].panjang = scanner.nextInt();
            System.out.println("Masukkan Lebar : ");
            ppArray[i].lebar = scanner.nextInt();
        }

        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi Panjang ke-" +i);
            System.out.printf("Panjang : %d, Lebar : %d %n",ppArray[i].panjang,ppArray[i].lebar);
        }
        
    }

}

// // ppArray[0] = new PersegiPanjang();
// // // ppArray[0].panjang = 10
// //    ppArray[0].lebar = 10
// // ppArray[1] = new PersegiPanjang();
// ppArray[1].panjang = 11
// //    ppArray[1].lebar = 10
// // ppArray[2] = new PersegiPanjang();
// ppArray[2].panjang = 10
// //    ppArray[2].lebar = 10

// System.out.printf("Persegi Panjang ke-0,panjang:%d,lebar:%d %n", ppArray[0].panjang, ppArray[0].lebar);
        // System.out.printf("Persegi Panjang ke-1,panjang:%d,lebar:%d %n", ppArray[1].panjang, ppArray[1].lebar);
        // System.out.printf("Persegi Panjang ke-2,panjang:%d,lebar:%d %n", ppArray[2].panjang, ppArray[2].lebar);
