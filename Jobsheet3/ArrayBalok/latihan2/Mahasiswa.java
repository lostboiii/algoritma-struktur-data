package Jobsheet3.ArrayBalok.latihan2;

public class Mahasiswa {
    public String nim;
    public String nama;
    public double ipk;

    Mahasiswa(String n, String a, double i){
        nim = n;
        nama = a;
        ipk = i;
    }
    public String toString() {
        return nama;
    }

    double rata2(Mahasiswa[] mhs) {
        double totalIPK = 0;
        for (Mahasiswa mahasiswa : mhs) {
            totalIPK += mahasiswa.ipk;
        }
        return totalIPK / mhs.length;
    }


   static Mahasiswa mahasiswaTerbaik(Mahasiswa[] mhs) {
        Mahasiswa terbaik = mhs[0];
        for (int i = 1; i < mhs.length; i++) {
            if (mhs[i].ipk > terbaik.ipk) {
                terbaik = mhs[i];
            }
        }
        return terbaik;
    }
}
