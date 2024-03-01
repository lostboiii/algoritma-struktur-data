package Jobsheet2;
public class Buku23 {

    String judul,pengarang;
    int halaman,stok,harga,totalHarga,terjual,hargaBayar;
    double hargaDiskon;

    public Buku23(){

    }
    public Buku23(String jd, String pg, int hal, int har, int stok){
        judul = jd;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
    public void tampilInformasi(){
        System.out.println("Judul : " +judul);
        System.out.println("Pengarang : " +pengarang);
        System.out.println("Halaman : " +halaman);
        System.out.println("Sisa Stok : " +stok);
        System.out.println("Harga : Rp " +harga);
        System.out.println("Total : Rp " +totalHarga);
        System.out.println("Harga Diskon : Rp " +hargaDiskon);
        System.out.println("Harga Bayar : Rp " +hargaBayar);
        System.out.println("");
    }
    public void terjual(int jml){
        if (stok > 0 && stok >= jml) {
        stok = stok - jml;
        terjual = jml;
        }
        else{
            System.out.println(" stok tidak cukup");
        }
        
    }
    public void restock(int n){
        stok = stok + n;
    }
    public void gantiHarga(int hrg){
        harga = hrg;
    }
    public int hitungHargaTotal() {
        totalHarga = harga * terjual;
        return totalHarga;
    }
    public double hitungDiskon(){
         if (totalHarga > 150000) { 
            hargaDiskon = totalHarga * 0.12;
         }
         else if(75000 > totalHarga && totalHarga < 150000){
            hargaDiskon = totalHarga * 0.10;
         }
         else{
            hargaDiskon = totalHarga;
         }
         return hargaDiskon;
    }
    public int hitungHargaBayar(){
            hargaBayar = (int) (totalHarga-hargaDiskon);
        return hargaBayar;
    }
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