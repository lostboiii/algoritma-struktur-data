package Jobsheet3;

public class Segitiga {
    int alas,tinggi;

    Segitiga(int a, int t){
        alas = a;
        tinggi = t;
    }

    double hitungLuas(){
        return  alas * tinggi/2;
    }
    double hitungKeliling(){
        return Math.sqrt(alas * alas + tinggi * tinggi);
    }

    public static void main(String[] args) {
        Segitiga seg[] = new Segitiga[4];
        seg[0] = new Segitiga(10,4);
        seg[1] = new Segitiga(20,10);
        seg[2] = new Segitiga(15,6);
        seg[3] = new Segitiga(25,10);

        for (int i = 0; i < seg.length; i++) {
             System.out.println("Luas segitiga ke-" +(i+1) + ": " + seg[i].hitungLuas());
             System.out.println("Keliling segitiga ke-" +(i+1) + ": " + seg[i].hitungKeliling());
        }

    }
}
