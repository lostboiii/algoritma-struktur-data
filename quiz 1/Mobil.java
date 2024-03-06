public class Mobil {
    String nama;
    int cc,hargaBeli,thnProduksi;

    public Mobil(String n, int c, int h, int t) {
        nama = n;
        cc = c;
        hargaBeli = h;
        thnProduksi = t;
    }
    double hitungPajak(){
        if (cc > 1500) {
            return hargaBeli * 0.10;
        }
        return hargaBeli * 0.075;
    }
    double hitungBiayaPerawatan(){
        if (thnProduksi < 2010) {
            return hargaBeli * 0.08;
        }
        return hargaBeli * 0.05;
    }
    double hitungTotalBiaya(){
        return hargaBeli + hitungPajak() + hitungBiayaPerawatan();
    }
    void printData(){
        System.out.println("Nama Mobil : " + nama);
        System.out.println("cc Mobil : " + cc);
        System.out.println("Harga Beli Mobil : " + hargaBeli);
        System.out.println("Tahun Produksi Mobil : " + thnProduksi);
        System.out.println("Biaya Pajak Mobil :"+ hitungPajak());
        System.out.println("Biaya Perawatan Mobil :"+ hitungBiayaPerawatan());
        System.out.println("Total Harga Beli Mobil :"+ hitungTotalBiaya());
    }

    
}
