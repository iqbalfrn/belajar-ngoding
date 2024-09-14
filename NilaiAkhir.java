
import java.util.Scanner;
public class NilaiAkhir {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        // Mengambil input
        System.out.print("Nama: ");
        String Nama = input.nextLine(); // menggunakan nextLine agar bisa mengambil nama lengkap
        System.out.print("Nim: ");
        String Nim = input.nextLine();
        System.out.print("Masukkan nilai Tugas: ");
        float Tugas = input.nextFloat();
        System.out.print("Masukkan nilai Quiz: ");
        float Quiz = input.nextFloat();
        System.out.print("Masukkan nilai Uts: ");
        float Uts = input.nextFloat();
        System.out.print("Masukkan nilai Uas: ");
        float Uas = input.nextFloat();
        System.out.print("Masukkan nilai Keaktifan: ");
        float Keaktifan = input.nextFloat();

        // menghitung nilai akhir
        float NA = (0.1f * Tugas) + (0.2f * Quiz) + (0.3f * Uts) + (0.3f * Uas) + (0.1f * Keaktifan);
        
        String NH;
        String komentar;

        if (NA >= 85){
        NH = "A";
        komentar = "GACOR";
        } else if (NA > 70){
        NH = "B";
        komentar = "BAIK"; 
        } else {
        NH = "E";
        komentar = "JELEK";
      
        // Menampilkan hasil termasuk Nama dan Nim
        System.out.println("Nama: " + Nama);
        System.out.println("NIM: " + Nim);
        System.out.printf("Nilai akhir anda adalah: %.2f\n", NA);
        System.out.printf("%-15s: %s%n", "Nilai_huruf", NH);
        System.out.printf("%-15s: %s%n", "Komentar", komentar);

    }
}