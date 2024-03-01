package Jobsheet3.latihan1;

public class Kerucut {
    public int jari2;
    public int sisimiring;

    Kerucut(int j, int s){
        jari2 = j;
        sisimiring = s;
    }

    public double luas(){
        return Math.PI * jari2 *(jari2+sisimiring);
    }
    public double volume(){
        return (1/3)*Math.PI *jari2*jari2*sisimiring;
    }
}
