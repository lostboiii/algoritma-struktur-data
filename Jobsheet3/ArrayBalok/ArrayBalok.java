package Jobsheet3.ArrayBalok;

public class ArrayBalok {
    public static void main(String[] args) {
        Balok[] balok = new Balok[3];

        balok[0] = new Balok(10, 5, 15);
        balok[1] = new Balok(6, 11, 9);
        balok[2] = new Balok(2, 10, 10);

        for (int i = 0; i < balok.length; i++) {
            System.out.printf("Volume Balok ke- %d: %d %n", i, balok[i].hitungVolume());
        }
        
    }
}
