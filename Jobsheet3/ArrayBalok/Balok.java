package Jobsheet3.ArrayBalok;

/**
 * Balok
 */
public class Balok {

    public int panjang;
    public int lebar;
    public int tinggi;

    Balok(int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public int hitungVolume(){
        return panjang * lebar * tinggi;
    }
}





































//soal no 3 3.3
// public class Balok {
//     public int sisi;
//  public static void main(String[] args) {
//     Balok[] ppBaloks = new Balok[100];
//     ppBaloks[5] = new Balok();
//     ppBaloks[5].sisi = 20;
// }
//  }