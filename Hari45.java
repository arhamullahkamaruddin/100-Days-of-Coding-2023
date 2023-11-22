import java.util.Scanner;
public class KelilingLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Selamat Datang di Program Hitung Keliling Lingkaran");
        
        System.out.print("Masukkan panjang jari-jari: ");
        int jari2 = input.nextInt();
        
        double keliling = 2*3.14*jari2;
        
        System.out.println("");
        System.out.println("Keliling dari bola tersebut adalah "+keliling);
    }
}
