package Jobsheet3.latihan1;

public class Bola {
    public int jari2;

    public Bola(int j) {
        jari2 = j;
        
    }
    public double luas() {
        return 4 * Math.PI * jari2 * jari2;
    }
    public double volume() {
        return (4.0 / 3.0) * Math.PI * jari2 * jari2 * jari2;
    }
}
