import java.util.Scanner;
public class Angka {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        
        if (angka < 10) {
            System.out.println("Angka "+angka+" adalah angka satuan");
        } else if (angka < 100) {
            System.out.println("Angka "+angka+" adalah angka puluhan");
        } else if (angka < 1000) {
            System.out.println("Angka "+angka+" adalah angka ratusan");
        } else if (angka < 10000) {
            System.out.println("Angka "+angka+" adalah angka satuan");
        } else {
            System.out.println("Angka yamg dibaca hanya sampai angka ribuan");
        }
    }
    
}
