import java.util.Scanner;

public class Mobilmain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan Jumlah Mobil");
        int jumlah = scanner.nextInt();

        Mobil[] mobil = new Mobil[jumlah];
        
        for (int i = 0; i < mobil.length; i++) {
            
            System.out.println("Masukkan Nama Mobil");
            String nama = scanner.next();
            System.out.println("Masukkan cc Mobil");
            int cc = scanner.nextInt();
            System.out.println("Masukkan Harga Mobil");
            int hargaBeli = scanner.nextInt();
            System.out.println("Masukkan Tahun Produksi Mobil");
            int thnProduksi = scanner.nextInt();
            mobil[i] = new Mobil(nama, cc, hargaBeli, thnProduksi);
        }
        Mobil mobiltermahal = null;
        int mobilindex = 0;
        for (int i = 0; i < mobil.length; i++) {
            if (mobil[0].hitungTotalBiaya() >  mobil[i].hitungTotalBiaya() && mobil[i].thnProduksi < 2010  && mobil[i].cc >1500) {
                mobiltermahal = mobil[i];
                mobilindex = i;
            }
        }
        double sum=0;
        int j =0;
        for (int i = 0; i < mobil.length; i++) {
            if (mobil[i].thnProduksi > 2010) {
                
               sum = sum+mobil[i].hitungBiayaPerawatan();
                j = i+1;
            }
        }
        double avg  = sum/j;
        for (int i = 0; i < mobil.length; i++) {
            Mobil Mobil = mobil[i];
            Mobil.printData();
           
        }
        System.out.println("Mobil Termahal :"+ mobil[mobilindex].nama);
        System.out.println("Rata rata Biaya Perawatan :"+ avg);
        scanner.close();
    }
}
