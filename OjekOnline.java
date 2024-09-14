
import java.util.Scanner;


    public class OjekOnline {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        // Biaya Per Km = 2000
        int BiayaPerKm = 4000;
        System.out.println("===SELAMAT DATANG DI OK-JEK===");
        System.out.print("masukkan jarak yang akan anda tempuh: ");
        double jarak = input.nextDouble();

        // Biaya Total
        double BiayaTotal = jarak * BiayaPerKm;
        
        // hasil
        System.out.printf("Harga yang harus anda bayar: Rp %.2f\n", BiayaTotal );
        System.out.println("==TERIMA KASIH==");
    }
}