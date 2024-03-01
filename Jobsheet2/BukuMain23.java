package Jobsheet2;

public class BukuMain23 {
    public static void main(String[] args) {
        Buku23 bk1 = new Buku23();
        bk1.judul = "Today Ends Tomorrow Ends";
        bk1.pengarang = "Denada Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 710000;
        
    
        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.hitungHargaTotal();
        bk1.hitungDiskon();
        bk1.hitungHargaBayar();
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
    
        Buku23 bk2 = new Buku23("nganu", "anu", 300, 50000, 20);
        bk2.terjual(11);
        bk2.hitungHargaTotal();
        bk2.hitungDiskon();
        bk2.hitungHargaBayar();
        bk2.tampilInformasi();
    
        Buku23 bukuDafa = new Buku23("cara ngoding pake batu tulis", "asep beureum", 69, 420, 20);
        bukuDafa.terjual(10);
        bukuDafa.hitungHargaTotal();
        bukuDafa.hitungDiskon();
        bukuDafa.hitungHargaBayar();
        bukuDafa.tampilInformasi();
    
    }
}
