import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan bilangan 1: ");
        int bil1 = input.nextInt();
        System.out.println("masukkan bilangan 2: ");
        int bil2 = input.nextInt();
        System.out.println("masukkan bilangan 3: ");
        int bil3 = input.nextInt();
        
        int BilanganTerbesar;
        if (bil1 >= bil2 && bil1 >= bil3) {
            BilanganTerbesar = bil1;
        }  else if (bil2 >= bil1 && bil2 >= bil3) {
            BilanganTerbesar = bil2;
        }  else {
            BilanganTerbesar = bil3; 
            
        }
        System.out.print("bilangan terbesar adalah : " + BilanganTerbesar);
        
    }
}