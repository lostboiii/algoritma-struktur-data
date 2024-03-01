package Jobsheet3.latihan1;

public class Limas {
    public int panjangAlas;
    public int tinggi;

    Limas(int p, int t){
        panjangAlas = p;
        tinggi = t;
    }

    public int luas(){
        return panjangAlas * panjangAlas;
    }
    
    public int volume(){
        return (1/3) * luas() * tinggi + panjangAlas;
    }

}
