import java.util.Scanner;
public class Angka {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai tegangan (V): ");
        double tegangan = input.nextDouble();

        System.out.print("Masukkan nilai hambatan (R): ");
        double hambatan = input.nextDouble();
        
        double arus = tegangan / hambatan;

        System.out.println("Nilai arus (I) adalah: " + arus + " Ampere");
    }
}
