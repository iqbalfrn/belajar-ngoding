
import java.util.Scanner;
import java.util.Random;
       
       public class penjumlahan {
           
       public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
       Random random = new Random();
       int angka1, angka2,jawaban, hasilnya;
       angka1 = random.nextInt (10);
       angka2 = random.nextInt (10);
       System.out.println("Berapakah jumlah bilangan dari " + angka1 + " + " + angka2 + "? " );
       System.out.println("berapa bro ? " );
       jawaban = scanner.nextInt();
       hasilnya = angka1 + angka2;
       
       if (jawaban == hasilnya) {
            System.out.println("Bener bro!");
            System.out.println("gud job!!");
        } else {  
            System.out.println("Jawabannya salah bro, yang bener itu " + hasilnya);
            System.out.println("Belajar lagi y!");
        }
       
    }
}