// public class fungsi {
//     public static void main(String[] args) {
//         int[][] daftarTanaman = {
//             {10,5,15,7},
//             {6,11,9,12},
//             {2,10,10,5},
//             {5,7,12,9},
//         };
//         lihatDaftar(daftarTanaman);
//         lihatPendapatan(daftarTanaman);
//         editGarden4(daftarTanaman[3], -1, -2, -0, -5);

//         }
//         private static void lihatDaftar(int[][] daftarTanaman){
//             System.out.println("\t\tAglonema  Keladi  Alocasia  Mawar");
//             for (int n = 0; n < daftarTanaman.length; n++ ) {
//                 System.out.printf("RoyalGarden%d\t%d\t  %d\t  %d\t    %d\n", n+1, daftarTanaman[n][0], daftarTanaman[n][1], daftarTanaman[n][2], daftarTanaman[n][3]);
//             }
//         }
//         private static int hitungPendapatan(int stokAglonema, int stokKeladi, int stokAlocasia, int stokMawar)
//         {
//             int hAglonema = 75000, hKeladi = 50000, hAlocasia = 60000, hMawar = 10000; 
//             return (stokAglonema * hAglonema) + (stokKeladi * hKeladi) + (stokAlocasia * hAlocasia) + (stokMawar * hMawar); 
//         }
        
//         private static void lihatPendapatan(int[][] daftarTanaman){
//             System.out.println("\t\tAglonema  Keladi  Alocasia  Mawar");
//             for (int n = 0; n < daftarTanaman.length; n++ ) {
//                 System.out.printf("RoyalGarden%d\t%d\t  %d\t  %d\t    %d\n", n+1,hitungPendapatan (daftarTanaman[n][0], daftarTanaman[n][1], daftarTanaman[n][2], daftarTanaman[n][3]));
//             }
//         }
//         private static void editGarden4(int[] daftarTanaman, int AglonemaMati, int KeladiMati, int AlocasiaMati, int MawarMati) {


//            
//         }
        
// }
public class fungsi {

    public static void main(String[] args) {
        int[][] daftarTanaman = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9},
        };

        lihatDaftar(daftarTanaman);
        lihatPendapatan(daftarTanaman);
        editGarden4(daftarTanaman[3], -1, -2, -0, -5);

    }

    private static void lihatDaftar(int[][] daftarTanaman) {
        System.out.println("\t\tAglonema  Keladi  Alocasia  Mawar");
        for (int n = 0; n < daftarTanaman.length; n++ ) {
            System.out.printf("RoyalGarden%d\t%d\t  %d\t  %d\t    %d\n", n+1, daftarTanaman[n][0], daftarTanaman[n][1], daftarTanaman[n][2], daftarTanaman[n][3]);
        }
    }

    private static int hitungPendapatan(int stokAglonema, int stokKeladi, int stokAlocasia, int stokMawar) {
        int hAglonema = 75000, hKeladi = 50000, hAlocasia = 60000, hMawar = 10000;
        return (stokAglonema * hAglonema) + (stokKeladi * hKeladi) + (stokAlocasia * hAlocasia) + (stokMawar * hMawar);
    }

    private static void lihatPendapatan(int[][] daftarTanaman) {
        System.out.println("\t\tAglonema  Keladi  Alocasia  Mawar");
        for (int n = 0; n < daftarTanaman.length; n++) {
            System.out.printf("RoyalGarden%d\t%d\t  %d\t  %d\t    %d\n", n + 1,
                    hitungPendapatan(daftarTanaman[n][0], daftarTanaman[n][1], daftarTanaman[n][2],
                            daftarTanaman[n][3]));
        }
    }

    private static void editGarden4(int[] daftarTanaman, int AglonemaMati, int KeladiMati, int AlocasiaMati, int MawarMati){
        System.out.println("\t    jumlah   tumbuhan mati   tumbuhan tersisa");
                    System.out.printf("Aglonema    %d\t\t%d\t\t%d\n", daftarTanaman[0], AglonemaMati, daftarTanaman[0] + AglonemaMati);
                    System.out.printf("Keladi      %d\t\t%d\t\t%d\n", daftarTanaman[1], KeladiMati, daftarTanaman[1] + KeladiMati);
                    System.out.printf("Alocasia    %d\t\t%d\t\t%d\n", daftarTanaman[2], AlocasiaMati, daftarTanaman[2] + AlocasiaMati);
                    System.out.printf("Mawar       %d\t\t%d\t\t%d\n", daftarTanaman[3], MawarMati, daftarTanaman[3] + MawarMati);
        

    }
}