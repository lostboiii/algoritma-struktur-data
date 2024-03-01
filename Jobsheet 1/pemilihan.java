import java.util.Scanner;

public class pemilihan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean isValid;
        double bobotNTugas = 0.2, bobotNKuis = 0.2, bobotNUTS = 0.3, bobotNUAS = 0.3, nilaiAkhir;
        int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
        String nilaiHuruf;
        
        System.out.println("\nPROGRAM MENGHITUNG NILAI AKHIR\n");
        
  
        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas = scanner.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        nilaiKuis = scanner.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        nilaiUTS = scanner.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        nilaiUAS = scanner.nextInt();

        isValid = (0 <= nilaiTugas && nilaiTugas <= 100 && 0 <= nilaiKuis && nilaiKuis <= 100 && 0 <= nilaiUTS && nilaiUTS <= 100 && 0 <= nilaiUAS && nilaiUAS <= 100); 

        if (!isValid) {
            System.out.println("\n\nnilai tidak valid\n\n");
        } else {
            nilaiAkhir = (nilaiTugas * bobotNTugas) + (nilaiKuis * bobotNKuis) + (nilaiUTS * bobotNUTS) + (nilaiUAS * bobotNUAS);
            nilaiHuruf =  (nilaiAkhir > 80 && nilaiAkhir <= 100) ? "A" 
                        : (nilaiAkhir > 73) ? "B+" 
                        : (nilaiAkhir > 65) ? "B" 
                        : (nilaiAkhir > 60) ? "C+"
                        : (nilaiAkhir > 50) ? "C"
                        : (nilaiAkhir > 39) ? "D"
                        : "E";
            System.out.println("Nilai Akhir = "+nilaiAkhir);
            System.out.println("Nilai Huruf = "+nilaiHuruf+"SELAMAT ANDA LULUS");
        }

    }
    
}