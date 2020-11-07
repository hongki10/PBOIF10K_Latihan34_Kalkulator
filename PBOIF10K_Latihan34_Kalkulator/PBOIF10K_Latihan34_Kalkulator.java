 import java.util.Scanner;
/**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 */

public class PBOIF10K10119915Latihan34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        kalkulator KALKULATOR = new kalkulator();
        
        System.out.println("=== Aplikasi Kalkulator Bilangan ===");
        System.out.print("Masukkan Angka ke-1 : ");
        KALKULATOR.value1 = scanner.nextDouble();
                
        System.out.print("Masukkan Angka ke-2 : ");
        KALKULATOR.value2 = scanner.nextDouble();
        
        System.out.print("");
        
        System.out.println("Hasil Pertambahan : " + 
                KALKULATOR.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + 
                KALKULATOR.kurangBilangan());
        System.out.println("Hasil Perkalian : " + 
                KALKULATOR.kaliBilangan());
        System.out.println("Hasil Pembagian : " + 
                KALKULATOR.bagiBilangan());
        System.out.println("Hasil Sisa : " + 
                KALKULATOR.sisaBilangan());
        
    }
}